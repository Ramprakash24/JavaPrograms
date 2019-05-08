package treeProblems;

import java.util.Stack;

// Question :https://www.geeksforgeeks.org/construct-bst-from-given-preorder-traversal-set-2/
class Node {
	int data;
	Node left,right;
	
	Node(int d){
		data = d;
		left=right=null;
	}
}
public class ConstructBSTFromPreOrder {
	public static void main(String args[]) {
		ConstructBSTFromPreOrder bst = new ConstructBSTFromPreOrder();
		int[] preOrder = new int[]{10, 5, 1, 7, 40, 50};
		Node output = bst.constructTree(preOrder, preOrder.length); 
		System.out.println("Inorder traversal");
		bst.printInorder(output);
	}

	private void printInorder(Node node) {
		if(node == null)
			return;
		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}

	private Node constructTree(int[] preOrder, int length) {
		Node root = new Node(preOrder[0]);
		Stack<Node> s = new Stack<>();
		s.push(root);
		
		for(int i = 1; i < length; i++) {
			Node temp = null;
			
			while(!s.isEmpty() && preOrder[i] >s.peek().data) {
				temp = s.pop();
			}
			if(temp != null) {
				temp.right = new Node(preOrder[i]);
				s.push(temp.right);
			}
			else {
				temp = s.peek();
				temp.left = new Node(preOrder[i]);
				s.push(temp.left);
			}
		}
		return root;
	}
}
