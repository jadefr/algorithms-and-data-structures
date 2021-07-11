package com.jade.stack;

public class Stack {
    int count;
    int size;
    int[] stack;

    public Stack(int size) {
        this.size = size;
        count = 0;
        stack = new int[size];
    }

    public void push(int data) {
        if (count < size) {
            stack[count] = data;
            count++;
        } else {
            System.out.println("stack overflow");
        }
    }

    public void peek() {
        System.out.println("peek: " + stack[count - 1]);
    }

    public void print() {
        for (int a: stack) {
            System.out.print(a + " ");
        }
    }

    public void pop() {
        if (count > 0) {
            count--;
        } else {
            System.out.println("stack underflow");
        }
    }
}
