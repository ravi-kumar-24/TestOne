package com.test8;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findSmallestDivisor' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     */

    public static int findSmallestDivisor(String s, String t) {
        // Write your code here
        int count = getCount(s, t);
        if(count ==-1){
            return -1;

        }else{
           char[] cArrays = t.toCharArray();
           Map<Character, Integer> map = new HashMap<>();
            for (char c:cArrays  ) {
                if (map.containsKey(c)){
                    map.put( c , map.get(c)+1);
                }else{
                    map.put( c , 1);
                }
            }
            System.out.println(map);
            int a =0;;
            int temp =0;
            for (Map.Entry<Character, Integer> entry:map.entrySet() ) {
                if(a==0){
                   temp = entry.getValue();
                   a++;
                }else {
                    if(temp == entry.getValue()){
                        temp = entry.getValue();
                    }else {
                        return cArrays.length;
                    }
                }

            }
            return map.entrySet().size();
        }
//bcdbcd
        //bcdbcdbcdbcd
        //return t.length();

    }

    public static int perfectSubstring(String s, int k) {
        // Write your code here
        char[] c = s.toCharArray();
        int count =0;
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < c.length -1 ; i++) {
            str.append(c[i]);
            for (int j = 0; j < c.length ; j++) {
                if (c[i] == c[j]){
                    str.append(c[j]);
                    count++;
                }
                else{
                    str.append(c[j]);
                }
            }
        }
        return 0;
    }

    private static int getCount(String s, String t) {
        if(s.length() !=0 && s.length() < t.length()){
            return -1;
        }
        if(s.startsWith(t)){// bcdbcdbcdbcdbcd
            s = s.substring(t.length(), s.length());// bcdbcdbcdbcdbcd
           return getCount(s, t);
           // return 1;
        }
        return 1;
    }


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int result = Result.findSmallestDivisor(s, t);

        System.out.println(result);
        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();*/

        bufferedReader.close();
       // bufferedWriter.close();
    }
}

