package com.test9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {

    }

    private  void printTopView(Node root){
        if(root == null){
            return;
        }
        Stack<Node> q = new Stack<>();

        Node tempRight = root;
        while (tempRight !=null){
            //System.out.println(root.data);
            if(tempRight.getRight() !=null){
                q.add(root.getRight());
            }
            tempRight = tempRight.getRight();

        }
        q.add(root);
        Node tempLeft = root;
        while (tempLeft!=null){
            //System.out.println(root.data);
            if(tempLeft.getRight() !=null){
                q.add(tempLeft.getRight());
            }
            tempLeft = tempLeft.getLeft();
        }
    }

}

class Node {
    int data;
    Node left;
    Node right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
