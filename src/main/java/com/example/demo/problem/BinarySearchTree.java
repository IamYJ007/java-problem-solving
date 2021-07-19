package com.example.demo.problem;

class BinarySearchTree {

    // A Binary Tree Node
    static class Node {
        int data;
        Node left, right;
    }

    // Utility function to create a new tree node
    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }

    // Driver code
    public static void main(String args[]) {
        // Create the binary tree
        Node root = newNode(6);
        root.left = newNode(4);
        root.right = newNode(8);
        root.left.left = newNode(3);
        root.left.right = newNode(5);
        root.right.left = newNode(7);
        root.right.right = newNode(9);
    }
}



