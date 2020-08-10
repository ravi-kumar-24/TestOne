package com.test;

import java.util.HashMap;
import java.util.Map;

public class Mapduplecate {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        String str = new String("A");
        String str1= new String("A");
        map.put(str, "a");
        map.put("B", "b");
        map.put("C", "c");

        map.remove(new String(str1));

        System.out.println(map);
    }
}
