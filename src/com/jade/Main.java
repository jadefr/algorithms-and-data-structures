package com.jade;

import com.jade.binarysearchtree.BinarySearchTree;
import com.jade.dynamicprogramming.Fibonacci;
import com.jade.linkedlist.LinkedList;
import com.jade.linkedlist.Node;
import com.jade.linkedliststack.LinkedListStack;
import com.jade.queue.Queue;
import com.jade.sorting.Sort;
import com.jade.stack.Stack;
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

        System.out.println("fibonacci: " + sm.fibonacci(20));

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

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(15);
        tree.insert(7);
        tree.insert(5);
        tree.insert(12);
        tree.insert(17);
        System.out.println("contains: " + tree.contains(tree.root, 11));
        tree.inOrder();
        tree.postOrder();
        tree.preOrder();
        tree.levelOrder();
        tree.preOrderIterative();

        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.print();
        queue.dequeue();
        queue.print();

        LinkedListStack llstack = new LinkedListStack();
        llstack.push(5);
        llstack.push(10);
        llstack.push(15);
        llstack.print();
        llstack.pop();
        llstack.pop();
        llstack.peek();
        llstack.print();

        Stack stack = new Stack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.peek();
        stack.print();
        stack.pop();
        stack.peek();

        Fibonacci fib = new Fibonacci();
        System.out.println("get fib: " + fib.getFib(20));
    }
}
