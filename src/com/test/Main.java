package com.test;
import java.io.*;
import java.util.*;

class Main {
    //COMPLETE THIS FUNCTION
    private static void process(String text) {
        StringBuilder sb  = new StringBuilder();
        for (int start = 0, end =breakIterator(text, start);
             end !=-1;
             start = end, end=end =breakIterator(text, start)) {
            char [] ss= text.substring(start,end).toCharArray();
            Arrays.sort(ss);
            sb.append(ss);

        }
        System.out.println(sb.toString());

    }

    static int breakIterator(String s, int start) {
        if (start >= s.length()) return -1;
        boolean check = Character.isDigit(s.charAt(start));
        for (int i = start; i < s.length(); i++) {
            if (!(check == Character.isDigit(s.charAt(i)))) {
                return i;
            }
        }
        return s.length() ;
    }

    //you do not need to edit any code below this line
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        process(input);
    }
}