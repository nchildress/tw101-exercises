package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        left = null;
        right = null;
    }

    public void add(String nameOfNewNode) {
        if(nameOfNewNode.compareTo(name) < 0) {
            if(left == null) left = new Node(nameOfNewNode);
            else left.add(nameOfNewNode);
        }
        else {
            if(right == null) right = new Node(nameOfNewNode);
            else right.add(nameOfNewNode);
        }
    }

    public List<String> names() {
        List<String> list;
        if(left != null) list = names(left);
        else list = new ArrayList<>();
        list.add(name);
        if(right != null) list.addAll(names(right));

        return list;
    }

    private List<String> names(Node childNode) {
        List<String> list;
        if(childNode.left != null) list = names(childNode.left);
        else list = new ArrayList<>();
        list.add(childNode.name);
        if(childNode.right != null) list.addAll(names(childNode.right));

        return list;
    }
}
