package com.test;

import java.io.*;
import java.util.*;

class Main1 {
    //COMPLETE THIS FUNCTION

    static class Pair
    {
        int first, second;
        Pair(int a, int b)
        {
            first = a;
            second = b;
        }
    }
    private static void process(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static ArrayList<Pair> findSubArrays(String[] arr)
    {
        // create an empty map
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

        int n = arr.length;
        // create an empty vector of pairs to store
        // subarray starting and ending index
        ArrayList<Pair> out = new ArrayList<>();

        // Maintains sum of elements so far
        int sum = 0;

        for (int i = 0; i < n; i++)
        {
            // add current element to sum
            sum += Integer.parseInt(arr[i]);

            // if sum is 0, we found a subarray starting
            // from index 0 and ending at index i
            if (sum == 0)
                out.add(new Pair(0, i));
            ArrayList<Integer> al = new ArrayList<>();

            // If sum already exists in the map there exists
            // at-least one subarray ending at index i with
            // 0 sum
            if (map.containsKey(sum))
            {
                // map[sum] stores starting index of all subarrays
                al = map.get(sum);
                for (int it = 0; it < al.size(); it++)
                {
                    Pair p =new Pair(al.get(it) + 1, i);
                    out.add(p);
                    System.out.println("out "+p.first +" "+p.second);
                }

            }
            al.add(i);
            map.put(sum, al);
            System.out.println("map "+map);
        }

        int count =0;
        for (Pair p:out) {
            if(p.first!=p.second) {
                count++;
            }
        }

        System.out.println(count);

        return out;
    }
    //you do not need to edit any code below this line
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            arr[i] = str;
        }
        findSubArrays(arr);
    }
}
