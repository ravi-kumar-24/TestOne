package com.test2;

interface Poet
{
    default void write()
    { System.out.println("Poet's default method"); }
}

interface Writer {
    default void write() {
        System.out.println("Writer's default method");
    }
}
public class Multitalented implements Poet, Writer{
    public static void main(String args[]) {
        Multitalented john = new Multitalented();
        john.write(); // which write method to call, from Poet // or, from Writer } }
    }


    @Override
    public void write() {

    }
}

