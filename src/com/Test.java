package com;

import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        boolean s ;
        Set<String> set = new HashSet<>();
         s = set.add("a");
        System.out.println(s);

        s = set.add("a");
        System.out.println(s);
        s = set.add("b");
        System.out.println(s);
        /*Map<Integer, String> map = new HashMap<>();

        map.put(1,"a");
        map.put(2,"a");
        map.put(3,"b");
        map.put(4,"c");

       List<String > list = map.values().
                        stream().
                         distinct().
                       collect(Collectors.toList());
        System.out.println(list);*/
    }
}
