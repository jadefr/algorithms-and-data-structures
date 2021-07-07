package com.jade;

import com.jade.linkedlist.LinkedList;
import strings.StringManipulation;


public class Main {

    public static void main(String[] args) {

        StringManipulation sm = new StringManipulation();

        String s1 = "abcdefg";
        String s2 = "defgcb";
        boolean isUnique = sm.isUnique(s2);
        System.out.println("isUnique: " + isUnique);

        boolean isPermutation = sm.isPermutation(s1, s2);
        System.out.println("isPermutation: " + isPermutation);

        boolean isPalindrome = sm.isPalindrome("abba");
        System.out.println("isPalindrome: " + isPalindrome);

        System.out.println();
        LinkedList linkedList = new LinkedList();
        linkedList.insert(5);
        linkedList.insert(10);
        linkedList.insert(15);
        linkedList.insert(20);
        linkedList.insert(19);
        linkedList.insert(10);
        linkedList.insert(5);
        linkedList.peek();
        linkedList.print();
        linkedList.delete(22);
        linkedList.print();
        linkedList.getSize();
        linkedList.isLinkedListPalindrome();
    }
}
