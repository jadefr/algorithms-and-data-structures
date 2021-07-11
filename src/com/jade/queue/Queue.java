package com.jade.queue;

public class Queue {
    Node head;
    Node tail;

    public void enqueue(int data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
            return;
        }

        Node newTail = new Node(data);
        tail.next = newTail;
        tail = newTail;
    }

    public void dequeue() {
        head = head.next;
    }

    public void print() {
        System.out.println();
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
