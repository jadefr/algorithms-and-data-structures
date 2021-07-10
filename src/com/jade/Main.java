package com.jade;

import com.jade.linkedlist.LinkedList;
import com.jade.linkedlist.Node;
import com.jade.sorting.Sort;
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
        linkedList.insert(25);
        linkedList.insert(30);
        linkedList.insert(35);
        linkedList.peek();
        linkedList.print();
        linkedList.delete(22);
        linkedList.print();
        linkedList.getSize();
        linkedList.isLinkedListPalindrome();
        Node reverse = linkedList.reverse();
        System.out.println("reverse head: " + reverse.data);
        linkedList.print();

        Sort sorting = new Sort();
        int[] arr = {3, 6, 2, 7, 11, 1, 5, 4};
//        sorting.bubbleSort(arr);
        System.out.println();
//        sorting.mergeSort(arr);
        sorting.quickSort(arr, 0, arr.length - 1);
    }
}
