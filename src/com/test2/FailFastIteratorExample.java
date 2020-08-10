package com.test2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class FailFastIteratorExample
{
    public static void main(String[] args)
    {
        //Creating an ArrayList of integers

    ArrayList<Integer> list = new ArrayList<Integer>();

        //Adding elements to list
        list.add(1452);
        list.add(6854);
        list.add(8741);
        list.add(6542);
        list.add(3845);
        //Getting an Iterator from list

        /*for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
            list.add(6854);
        }*/
        for (Integer num:list ) {
            System.out.println(num);
            list.add(36);
        }

       /* Iterator<Integer> it = list.iterator();
        while (it.hasNext())
        {

            Integer integer = (Integer) it.next();
            System.out.println("iterator "+integer);
            list.add(8457);      //This will throw ConcurrentModificationException
        }*/

        System.out.println("after completing");
    }
}
