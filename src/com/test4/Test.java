package com.test4;

import java.util.Arrays;

public class Test {

    public static void threeNOSort(int[] arr){

        int start=0, mid=0;
        int end = arr.length-1;
        System.out.println("total no of elements "+end);
        int pivot =1;
        int count =0;
        System.out.println(count+" "+Arrays.toString(arr));
        while (mid<=end){
            count++;
             if(arr[mid]< pivot){ //current element is 0
                swap(arr, start, mid);
                start++;
                mid++;
             }else if(arr[mid]>pivot){ // current element is 2
                 swap(arr,mid,end);
                 end--;
             }else{ // current element is one
                 mid++;
             }
             System.out.println(count+" "+Arrays.toString(arr));
         }
        System.out.println("total numbers of calls "+count);
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,1,1,1,2,2,0,0,1,0,2,0,1,2};
        threeNOSort(arr);
        System.out.println( Arrays.toString(arr));
    }
}
