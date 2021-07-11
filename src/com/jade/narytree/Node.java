package com.jade.narytree;

import java.util.List;

public class Node {
    int data;
    List<Node> children;

    public Node (int data) {
        this.data = data;
    }

    private Node (int data, List<Node> children) {
        this.data = data;
        this.children = children;
    }
}
