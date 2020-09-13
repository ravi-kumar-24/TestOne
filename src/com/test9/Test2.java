package com.test9;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test2 {

    public static void main(String[] args) {
        String num = "1";

        for (int i=1;i<=10;i++) {
            System.out.println(num);
            num = lookandsay(num);
        }
    }

    public static String lookandsay(String number){
        StringBuilder result= new StringBuilder();

        char repeat= number.charAt(0);
        number= number.substring(1) + " ";
        int times= 1;

        for(char actual: number.toCharArray()){
            if(actual != repeat){
                result.append(times + "" + repeat);
                times= 1;
                repeat= actual;
            }else{
                times+= 1;
            }
        }
        return result.toString();
    }

    private  static String getCountAndNumber(String str){

        if(str.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder();
       Map<Character , Integer> map = new LinkedHashMap<>();
       char[] c = str.toCharArray();
       char temp = c[0];
       int count = 1;
       if(str.length() ==1){
           return "1" + str;
       }
       boolean flag = false;
        for (int i = 0; i < c.length  ; i++) {
            if( i < c.length-1 && temp == c[i+1]){
                count++;
            }else {
                flag = true;
                if(i<c.length-1 ) {
                    temp = c[i + 1];
                }
                count =1;
            }


            if(flag || i == c.length) {
                  sb.append(count);
                 sb.append(c[i]);
                 flag = false;
            }

        }

        return sb.toString();
    }

    // Returns n'th term in
    // look-and-say sequence
    static String countnndSay(int n)
    {
        // Base cases
        if (n == 1)     return "1";
        if (n == 2)     return "11";

        // Find n'th term by generating
        // all terms from 3 to n-1.
        // Every term is generated
        // using previous term

        // Initialize previous term
        String str = "11";
        for (int i = 3; i <= n; i++)
        {
            // In below for loop, previous
            // character is processed in
            // current iteration. That is
            // why a dummy character is
            // added to make sure that loop
            // runs one extra iteration.
            str += '$';
            int len = str.length();

            int cnt = 1; // Initialize count
            // of matching chars
            String tmp = ""; // Initialize i'th
            // term in series
            char []arr = str.toCharArray();

            // Process previous term
            // to find the next term
            for (int j = 1; j < len; j++)
            {
                // If current character
                // does't match
                if (arr[j] != arr[j - 1])
                {
                    // Append count of
                    // str[j-1] to temp
                    tmp += cnt + 0;

                    // Append str[j-1]
                    tmp += arr[j - 1];

                    // Reset count
                    cnt = 1;
                }

                // If matches, then increment
                // count of matching characters
                else cnt++;
            }

            // Update str
            str = tmp;
        }

        return str;
    }
}
