package com.jade.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
    public Node root;

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node parent, int data) {
        if (parent == null) {
            parent = new Node(data);
        } else {
            if (data < parent.data) {
                parent.left = insert(parent.left, data);
            } else {
                parent.right = insert(parent.right, data);
            }
        }
        return parent;
    }


    public boolean contains(Node parent, int data) {
        parent = search(parent, data);
        return parent != null;
    }

    private Node search(Node parent, int data) {
        if (parent == null) {
            return null;
        }
        if (data == parent.data) {
            return parent;
        }
        if (data < parent.data) {
            return search(parent.left, data);
        } else {
            return search(parent.right, data);
        }
    }


    public void inOrder() {
        System.out.print("inOrder:: ");
        inOrder(root);
    }

    private void inOrder(Node parent) {
        if (parent != null) {
            inOrder(parent.left);
            System.out.print(parent.data + " ");
            inOrder(parent.right);
        }
    }


    public void postOrder() {
        System.out.print("postOrder:: ");
        postOrder(root);
    }

    private void postOrder(Node parent) {
        if (parent != null) {
            postOrder(parent.left);
            postOrder(parent.right);
            System.out.print(parent.data + " ");
        }
    }


    public void preOrder() {
        System.out.print("preOrder:: ");
        preOrder(root);
    }

    private void preOrder(Node parent) {
        if (parent != null) {
            System.out.print(parent.data + " ");
            preOrder(parent.left);
            preOrder(parent.right);
        }
    }

    /**
     * Breadth First Search
     */
    public void levelOrder() {
        System.out.println();
        System.out.print("  levelOrder:: ");
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node firstOfQueue = queue.poll(); // returns and removes the first node of the queue
            System.out.print(" " + firstOfQueue.data);
            if (firstOfQueue.left != null) {
                queue.add(firstOfQueue.left);
            }
            if (firstOfQueue.right != null) {
                queue.add(firstOfQueue.right);
            }
        }
    }

    /**
     * Depth First Search Without Recursion
     */
    public void preOrderIterative() {
        System.out.print("  depth first search with stack::  ");
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(" " + current.data);
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }
}
