package com.test7;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        int[] arr = {10,12,11,15,5,9};
        Arrays.sort(arr);
        findMissingElement(arr);
    }

    private static void findMissingElement(int[] arr) {
        for (int i = 0; i <arr.length -1 ; i++) {
            int count = arr[i+1] - arr[i];
            if( count >1){
                for (int j = 1; j <count  ; j++) {
                    System.out.println(arr[i]+j);
                }
            }



        }
    }
}
