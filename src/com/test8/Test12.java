package com.test8;

public class Test12 {

    public static void main(String[] args) {
        int[] arr = {6,7,1,5,3,2,9,8,4};

        for (int i = 0; i < arr.length-1 ; i++) { //n
            for (int j = 0; j < arr.length-1; j++) { //n
                if(arr[j]> arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        } //n*n

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}
