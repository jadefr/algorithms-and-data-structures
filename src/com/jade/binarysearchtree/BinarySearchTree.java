package com.jade.binarysearchtree;

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
}
