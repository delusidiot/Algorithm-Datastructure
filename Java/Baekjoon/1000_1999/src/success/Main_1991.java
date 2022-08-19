package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main_1991 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(br.readLine());
		Tree root = new Tree();
		for (int i = 0; i < N; i++) {
			String[] values = br.readLine().split(" ");
			root.addNode(values[0], values[1], values[2]);
		}
		root.preorder(root.root);
		System.out.println();
		root.inorder(root.root);
		System.out.println();
		root.postorder(root.root);
		System.out.println();
	}
	
	private static class Tree {
		Node root;
		public Tree() {
			this.root = null;
		}
		
		public void addNode(String value, String left, String right) {
			Node curr = searchNode(value, root);
			if (curr == null) {
				this.root = new Node(value);
				if (!left.equals("."))
					this.root.left = new Node(left);
				if (!right.equals("."))
					this.root.right = new Node(right);
			}
			else {
				if (!left.equals("."))
					curr.left = new Node(left);
				if (!right.equals("."))
					curr.right = new Node(right);
			}
		}
		
		public Node searchNode(String value, Node curr) {
			if (curr != null) {
				if (curr.value.equals(value)) {
					return curr;
				}
				Node left = searchNode(value, curr.left);
				if (left != null)
					return left;
				Node right = searchNode(value, curr.right);
				if (right != null)
					return right;
			}
			return null;
		}
		
		public void preorder(Node node) {
			if (node != null) {
				System.out.print(node.value + " ");
				preorder(node.left);
				preorder(node.right);
			}
		}
		public void inorder(Node node) {
			if (node != null) {
				inorder(node.left);
				System.out.print(node.value + " ");
				inorder(node.right);
			}
		}
		public void postorder(Node node) {
			if (node != null) {
				postorder(node.left);
				postorder(node.right);
				System.out.print(node.value + " ");
			}
		}
	}
	
	private static class Node {
		String value;
		Node left;
		Node right;
		public Node(String value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
		
	}
}
