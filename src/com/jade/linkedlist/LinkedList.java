package com.jade.linkedlist;

import java.util.ArrayList;

public class LinkedList {
    private Node head;

    public void insert(int data) {
        Node newHead = new Node(data, head);
        head = newHead;
    }

    public void print() {
        System.out.println();
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void peek() {
        System.out.println("peek: " + this.head.data);
    }

    public void delete(int data) {

        // check if head
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        Node last;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            last = current.next;
            if (last.next == null) {
                System.out.println();
                System.out.println("The value " + data + " is not present in the linked list");
                break;
            }
            current = current.next;
        }
    }

    public int getSize() {
        System.out.println();
        Node current = head;
        int count = 1;
        while (current.next != null) {
            count++;
            current = current.next;
        }
        return count;
    }


    public boolean isLinkedListPalindrome() {
        int size = getSize();
        ArrayList<Integer> dataList = new ArrayList<>();
        Node current = head;

        while (current != null) {
            dataList.add(current.data);
            current = current.next;
        }

        for (int i = 0; i < size; i ++) {
            int j = (size - 1) - i;
            if (dataList.get(i) != dataList.get(j)) {
                System.out.println("Linked list is not a palindrome");
                return false;
            }
        }

        System.out.println("Linked list is a palindrome");
        return true;
    }
}
