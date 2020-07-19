package com.test;

import java.util.*;

public class Test {
    //99810076453443
    //99876453443100

    /*public static void main(String[] args) {
   //     System.out.println("hello");
        Integer[] arr = {100, 34, 3, 98, 9, 76, 45, 4};

        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.stream(arr).forEach(e -> System.out.print(e+" "));
        System.out.println();
        long x = arr[0];
        long y = arr[0];
        for (int i = 1; i <arr.length ; i++) {
           y = arr[i];
           long temp = merge(x,y);
            System.out.println(temp);
            x = temp;
        }

    }

    private static long merge(long x, long y) {
        String s1=  ""+x+y;
        String s2=  ""+y+x;
        return Long.parseLong(s1.compareTo(s2)>1?s1:s2);
    }*/

    static void printLargest(List<String> arr, Comparator com){

        Collections.sort(arr, com);


        Iterator it = arr.iterator();

        while(it.hasNext())
            System.out.print(it.next()+" ");

    }

    // driver program
    public static void main (String[] args) {

        List<String> arr = Arrays.asList("100", "34", "3", "98", "9", "76", "45", "4");
        arr.stream().forEach(e -> System.out.print(e+ " "));
        System.out.println();
        Comparator com = new Comparator<String>() {


            // A comparison function which is used by
            // sort() in printLargest()
            @Override
            public int compare(String X, String Y) {
                // first append Y at the end of X
                String XY = X + Y;

                // then append X at the end of Y
                String YX = Y + X;



                // Now see which of the two formed numbers
                // is greater
                int re = XY.compareTo(YX) > 0 ? -1 : 1;
                System.out.println("X "+X+" Y "+ Y+ " XY "+XY + " YX " + YX+" return value "+re);
                return re;
            }
        };
        printLargest(arr, com);
        //output should be 6054854654

    }
}


