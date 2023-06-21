package com.example.demo;

public class NodeWithWeight {
    private Node node;
    private int weight;

    public NodeWithWeight(Node node, int weight) {
        this.node = node;
        this.weight = weight;
    }

    public Node getNode() {
        return node;
    }

    public int getWeight() {
        return weight;
    }
}
