package com.test3;

public class Test {

    public static void main(String[] args) {
        int[] arr ={1,0,0,0,1,1,0,0,1,1,0};
        sortBinaryArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void sortBinaryArray(int a[])
    {
        int n = a.length;
        int j = -1;
        for (int i = 0; i < n; i++) {

            // if number is smaller than 1
            // then swap it with j-th number
            if (a[i] < 1) {
                j++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

            }
        }
    }
    public static void sort(int[] arr){
        int temp = -1 ;
      for (int i = 0; i < arr.length ; i++) {

          if(arr[i] <1){
              temp ++;
              swap(arr[i], arr[temp]);
          }
      }

     //  o(n) + o(n/2) = o(n)

    }

    private static void swap(int i, int i1) {
        int temp  = i1;
        i1 = i;
        i1 = temp;
    }
}
