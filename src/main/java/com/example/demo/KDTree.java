package com.example.demo;

public class KDTree {
    private Node root;

    public KDTree() {
        this.root = null;
    }

    public Node insert(Node root, double[] point, int weight, int depth) {
        if (root == null) {
            return new Node(point, weight);
        }

        int dim = depth % 2;

        if (point[dim] < root.getPoint()[dim]) {
            root.setLeft(insert(root.getLeft(), point, weight, depth + 1));
        } else {
            root.setRight(insert(root.getRight(), point, weight, depth + 1));
        }

        return root;
    }

    public void clearTree(Node root) {
        if (root != null) {
            clearTree(root.getLeft());
            clearTree(root.getRight());
            root.setLeft(null);
            root.setRight(null);
        }
    }

 /*   public NodeWithWeight searchRange(Node node, double[] targetPoint, double radius, int depth) {
        if (node == null) {
            return new NodeWithWeight(null, Integer.MIN_VALUE);
        }

        double distance = calculateDistance(node.getPoint(), targetPoint);

        if (distance <= radius) {
            return new NodeWithWeight(node, node.getWeight());
        }

        int dim = depth % 2;
        NodeWithWeight maxNode = null;

        if (targetPoint[dim] - radius <= node.getPoint()[dim]) {
            NodeWithWeight leftResult = searchRange(node.getLeft(), targetPoint, radius, depth + 1);
            maxNode = getMaxNodeWithWeight(maxNode, leftResult);
        }

        if (targetPoint[dim] + radius >= node.getPoint()[dim]) {
            NodeWithWeight rightResult = searchRange(node.getRight(), targetPoint, radius, depth + 1);
            maxNode = getMaxNodeWithWeight(maxNode, rightResult);
        }

        return maxNode;
    }
*/
    
    //Devuelve el nodo con mayor peso dentro del radio especificado, y si hay uno que lo empata en peso, devuelve el mas cercano al punto actual.
    public NodeWithWeight searchRange(Node node, double[] targetPoint, double radius, int depth, NodeWithWeight maxNode) {
        if (node == null) {
            return maxNode;
        }

        double distance = calculateDistance(node.getPoint(), targetPoint);

        if (distance <= radius) {
            if (maxNode == null || node.getWeight() > maxNode.getWeight() ||
                    (node.getWeight() == maxNode.getWeight() && distance < calculateDistance(maxNode.getNode().getPoint(), targetPoint))) {
                maxNode = new NodeWithWeight(node, node.getWeight());
            }
        }

        int dim = depth % 2;

        if (targetPoint[dim] - radius <= node.getPoint()[dim]) {
            maxNode = searchRange(node.getLeft(), targetPoint, radius, depth + 1, maxNode);
        }

        if (targetPoint[dim] + radius >= node.getPoint()[dim]) {
            maxNode = searchRange(node.getRight(), targetPoint, radius, depth + 1, maxNode);
        }

        return maxNode;
    }
    
    private NodeWithWeight getMaxNodeWithWeight(NodeWithWeight node1, NodeWithWeight node2) {
        if (node1.getNode() == null) {
            return node2;
        } else if (node2.getNode() == null) {
            return node1;
        } else {
            return (node1.getWeight() > node2.getWeight()) ? node1 : node2;
        }
    }

    private double calculateDistance(double[] point1, double[] point2) {
        double sum = 0.0;
        for (int i = 0; i < point1.length; i++) {
            double diff = point1[i] - point2[i];
            sum += diff * diff;
        }
        return Math.sqrt(sum);
    }
    
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
