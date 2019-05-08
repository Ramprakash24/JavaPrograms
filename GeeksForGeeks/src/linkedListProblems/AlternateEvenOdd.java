package linkedListProblems;

public class AlternateEvenOdd {
	static Node head = null;
	Node current;
	class Node{
		int data;
		Node next = null;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static void main(String args[]) {
		Node result;
		AlternateEvenOdd avo = new AlternateEvenOdd();
		for(int i = 0; i < 10; i++) {
			int randNum = (int) (Math.random()*(20));
			avo.addToList(randNum);
		}
		System.out.println("Original List:");
		avo.printList(head);
		result = avo.alternateEvenOdd(head);
		System.out.println();
		System.out.print("Modified List:");
		avo.printList(result);
	}

	private Node alternateEvenOdd(Node node) {
		Node oddStart = null;
		Node oddEnd = null;
		Node evenStart = null;
		Node evenEnd = null;
		while(node != null) {
			if(node.data % 2 == 0){
				if(evenStart == null) {
					evenStart = node;
					evenEnd = evenStart;
				}
				else {
					evenEnd.next = node;
					evenEnd = node;
				}
				}
			else
				System.out.println("odd");
			node = node.next;
		}
		return evenStart;
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
		if(head == null) {
			head = newNode;
			current = newNode;
		}
		else {
			current.next = newNode;
			current = newNode;
		}
		
	}
}
