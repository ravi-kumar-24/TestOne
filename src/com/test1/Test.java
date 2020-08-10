package com.test1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    //O(long n) + n/2 + n/4 +..
    // 2 O(long n) O(long n)

    public static void main(String[] args) {
        // 1- 50
        //51 -100
        List<Integer> list = Arrays.asList(1,0,0,0,0,0,0,0);/*,1,1,1,1,1,1
                ,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);*/
        int c = badIndex(list, 0, list.size());
        System.out.println(c+1);
     }

    public  static int badIndex(List<Integer> list, int start, int end){

        int mid = (start + end )/2;
        if(end - start <= 1){
            return end;
        }
        if(list.get(mid)==0){
            end = mid;
        }else {
            start = mid;
        }
        return badIndex(list, start, end);
    }

    public int getBadCommit(List<String> commits){


     int   badIndex = Collections.binarySearch(commits, "0"); //58 50, 75
     int   goodIndex = Collections.binarySearch(commits, "1"); // 50

        for (int i = goodIndex; i < badIndex; i++) {
            if(commits.equals("0")){
                return i;
            }
        }

        return 0;
    }


}
