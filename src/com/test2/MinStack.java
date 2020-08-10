package com.test2;


import java.util.Stack;

public class MinStack {

    private Stack<Integer> st;
    private Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }

    public void push(int data) {

        int min = data;

        if(!minSt.isEmpty() && min > minSt.peek()) {
            min = minSt.peek();
        }

        st.push(data);
        minSt.push(min);
    }

    public void pop() {

        st.pop();
        minSt.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minSt.peek();
    }


    public static void main(String[] args) {

        MinStack minElem = new MinStack();

        minElem.push(4);
        minElem.push(5);
        minElem.push(6);
        minElem.push(7);
        minElem.push(8);
        System.out.println(" Minimum Element from Stack " + minElem.getMin());
        minElem.pop();
        System.out.println(" Minimum Element from Stack " + minElem.getMin());
        minElem.pop();

        System.out.println(" Minimum Element from Stack " + minElem.getMin());
        minElem.pop();

        System.out.println(" Minimum Element from Stack " + minElem.getMin());
        minElem.pop();

        System.out.println(" Minimum Element from Stack " + minElem.getMin());

    }
}
