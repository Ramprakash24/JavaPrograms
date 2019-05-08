package linkedListProblems;
// Question : https://www.geeksforgeeks.org/reverse-a-linked-list/
public class ReverseLinkedList {
	static Node head = null;
	Node currentNode = null;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void reverseNode(Node node) {
		Node previousNode = null;
		Node nextNode = null;
		Node currentNode = node;
		while(currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		head =  previousNode;
	}
	
	public void addToList(int newData) {
		Node newNode = new Node(newData);
		
		if(head == null) {
			head = newNode;
			currentNode = newNode;
			}
		else {
			currentNode.next = newNode;
			currentNode = newNode;
		}
	}
	
	public void printList(Node printNode) {
		Node pNode = printNode;
		while(pNode != null) {
			if(pNode.next == null)
				System.out.print(pNode.data);
			else
				System.out.print(pNode.data+"->");
			pNode = pNode.next;
		}
	}
	
	public static void main(String args[]) {
		ReverseLinkedList rll = new ReverseLinkedList();
		rll.addToList(85);
		rll.addToList(15);
		rll.addToList(4);
		rll.addToList(20);
		System.out.println("Original list");
		rll.printList(head);
		rll.reverseNode(head);
		System.out.println();
		System.out.println("Reversed List");
		rll.printList(head);
		
		
	}
}
