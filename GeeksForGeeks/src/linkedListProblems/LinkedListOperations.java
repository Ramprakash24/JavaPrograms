package linkedListProblems;

public class LinkedListOperations {

	Node head = null;
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
		
	public void append(int newData) {
		Node newNode = new Node(newData);
		if(head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void insertAfter(int prevData, int newData) {
		Node prevNode = null;
		Node tempNode = head;
		Node nextNode = null;
		while(tempNode != null) {
			if(tempNode.data == prevData) {
				prevNode = tempNode;
				nextNode = tempNode.next;
			}
			tempNode = tempNode.next;
		}
		Node newNode = new Node(newData);
		prevNode.next = newNode;
		newNode.next = nextNode;
		
	}
	public void printList() {
		Node pNode = head;
		while(pNode != null) {
			if(pNode.next == null)
				System.out.print(pNode.data);
			else
				System.out.print(pNode.data+"->");
			pNode = pNode.next;
		}
	}	
	
	public static void main(String args[]) {
		LinkedListOperations llist = new LinkedListOperations();
		llist.append(10);
		llist.append(5);
		llist.append(30);
		//llist.insertAfter(20, 40);
		llist.printList();
		
	}
}
