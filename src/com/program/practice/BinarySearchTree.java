//18) Given node in Binary Search tree, write the implementation for Put, Contains and InOrder methods.

package com.program.practice;

public class BinarySearchTree {

	private Node root;

	public void add(int data) {
		root = add(root, data);
	}

	private Node add(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		}
		if (node.data > data) {
			node.left = add(node.left, data);
		} else if (node.data < data) {
			node.right = add(node.right, data);
		}
		return node;
	}

	public void display() {
		inorder(root);
	}

	private void inorder(Node node) {
		if (node == null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);

	}

	public boolean contains(int data) {
		return contains(root, data);
	}

	private boolean contains(Node node, int data) {
		if (node == null) {
			return false;
		}
		if (node.data == data) {
			return true;
		}

		if (node.data > data) {
			return contains(node.left, data);
		} else {
			return contains(node.right, data);
		}
	}
}

class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
	}
}
