package com.jade.linkedliststack;

public class LinkedListStack {
    Node top;

    public void push(int data) {
        if (top == null) {
            top = new Node(data);
            return;
        }
        Node newTop = new Node(data);
        newTop.next = top;
        top = newTop;
    }

    public void pop() {
        if (top == null) {
            throw new IllegalArgumentException("Stack Underflow");
        } else {
            top = top.next;
        }
    }

    public void print() {
        System.out.println();
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void peek() {
        if (top == null) {
            throw new IllegalArgumentException("Stack Underflow");
        } else {
            System.out.println("stack peek: " + top.data);
        }
    }

}
