package com.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIteratorExample
{
    public static void main(String[] args)
    {
        //Creating a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();

      // HashMap<String, Integer> map = new HashMap<String, Integer>();

        //Adding elements to map

        map.put("ONE", 1);

        map.put("TWO", 2);

        map.put("THREE", 3);

        map.put("FOUR", 4);

        //Getting an Iterator from map

        Iterator<String> it = map.keySet().iterator();

        while (it.hasNext())
        {
            String key = (String) it.next();

            System.out.println(key+" : "+map.get(key));

            map.put("fivse", 5);
        }
        List<? super Number> foo1 = new ArrayList<>();  // Number "extends" Number (in this context)
        List<? super Integer> foo2 = new ArrayList<Integer>(); // Integer extends Number
        List<? extends Number> foo3 = new ArrayList<Double>();  // Double extends Number
        foo2.add(3);
    }
}
