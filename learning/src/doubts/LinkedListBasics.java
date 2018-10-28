package doubts;

public class LinkedListBasics {
	class Node{
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}
	Node head = null;
	
	public void pushFn(int new_data) {
		Node newNode = new Node(new_data);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAfterFn(Node prev_node, int new_data) {
		if(prev_node == null) {
			System.out.println("Prev node can't be null");
			return;
		}
		Node newNode = new Node(new_data);
		newNode.next = prev_node.next;
		prev_node.next = newNode;
	}
	
	public void appendFn(int new_data) {
		Node newNode = new Node(new_data);
		if(head == null) {
			head = new Node(new_data);
			return;
		}
		newNode.next = null;
		Node lastNode = head;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
		lastNode.next = newNode;
		return;
		}
	}
	
	public void printList() {
		Node traverseNode = head;
		while(traverseNode != null) {
			System.out.print(traverseNode.data+" ");
			traverseNode = traverseNode.next;
		}
	}
	
	public static void main(String args[]) {
		LinkedListBasics llist = new LinkedListBasics();
		llist.appendFn(6);
		llist.pushFn(7);
		llist.pushFn(1);
        llist.appendFn(4);
        //llist.insertAfterFn(llist.head.next, 8);
        System.out.println("\nCreated Linked list is: ");
        llist.printList();
	}
}
