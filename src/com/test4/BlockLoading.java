package com.test4;

public class BlockLoading {
    static {
        System.out.println("static block");
    }
    {
        System.out.println("default block");
    }

    public BlockLoading(){
        System.out.println("constructor");
    }

     void m1(){
        System.out.println("hello method");
    }

    public static void main(String[] args) {
        BlockLoading blockLoading = new BlockLoading();
        blockLoading.m1();
        System.out.println("=================");
        BlockLoading blockLoading1 = new BlockLoading();
        blockLoading1.m1();
    }
}
