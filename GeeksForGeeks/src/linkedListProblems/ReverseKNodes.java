package linkedListProblems;
//Question : https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
public class ReverseKNodes {
	static Node headNode = null, currentnode;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static void main(String args[]) {
		ReverseKNodes rkn = new ReverseKNodes();
		Node reverseNode;
		for(int i = 0; i < 10; i++)
			rkn.addToList(i);
		System.out.print("The original list is:");
		rkn.printList(headNode);
		reverseNode = rkn.reverseKNodes(headNode,3);
		System.out.println();
		System.out.print("Modified List:");
		rkn.printList(reverseNode);
		
		
	}

	private Node reverseKNodes(Node node, int k) {
		Node previousNode = null;
		Node currentNode = node;
		Node nextNode = null;
		int count = 0;
		while(currentNode != null && count < k) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
			count++;
		}
		
		if(node != null)
			node.next = currentNode;
		count = 0;
		
		while(currentNode != null && count < k - 1) {
			currentNode= currentNode.next;
			count++;
		}
		
		if(currentNode != null)
			currentNode.next = reverseKNodes(currentNode.next, k);
		
		return previousNode;
	}

	private void printList(Node printNode) {
		while(printNode != null) {
			if(printNode.next == null)
				System.out.print(printNode.data);
			else
				System.out.print(printNode.data+"->");
			printNode = printNode.next;
		}
		
	}

	private void addToList(int newData) {
		Node newNode = new Node(newData);
		if(headNode == null) {
			headNode = newNode;
			currentnode = newNode;
		}
		else {
			currentnode.next = newNode;
			currentnode = newNode;
			
		}
		
	}
}
