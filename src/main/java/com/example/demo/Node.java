package com.example.demo;

public class Node {
    private double[] point;
    private int weight;
    private Node left;
    private Node right;

    public Node(double[] point, int weight) {
        this.point = point;
        this.weight = weight;
        this.left = null;
        this.right = null;
    }

    public double[] getPoint() {
        return point;
    }

    public int getWeight() {
        return weight;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
