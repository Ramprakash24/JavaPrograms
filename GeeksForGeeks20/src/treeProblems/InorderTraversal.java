package treeProblems;

import java.util.Stack;

// Question : https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
class Node {
	int data;
	Node left, right;
	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}

class BinaryTree{
	Node root;
	void inorder() {
		if(root == null)
			return;
		Stack<Node> s = new Stack<Node>();
		Node current = root;
		
		while(current != null || s.size() > 0) {
			while(current != null) {
				s.push(current);
				current = current.left;
			}
			current = s.pop();
			System.out.print(current.data + " ");
			current = current.right;
		}
	}
}
public class InorderTraversal {
	public static void main(String args[]) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.inorder();
		
	}

}
