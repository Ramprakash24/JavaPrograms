package medium;

public class AddLinkedList {
	static Node top = null;
	static Node head = null;
	static Node resultNode = null;
	static Node resultHead = null;
	
	public static class Node{
		int data;
		Node prev;
		Node(int d){
			data = d;
			prev = null;
		}
	}
	
	public static void appendFn(Node newNode) {
		if(top == null) 
			head = top = newNode;
		else {
			top.prev = newNode;
			top = newNode;
		}
	}
	
	public void printList(Node printNode) {
		Node temp = printNode;
		while(temp != null) {
			System.out.print("->"+temp.data);
			temp = temp.prev;
		}
	}
	
	
	public void addingList(Node first, Node second) {
		Node temp = null;
		int result = 0, carry = 0;
		top = null;
		while(first != null || second != null) {
			result = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);
			carry = result >= 10 ? 1 : 0;
			result = result % 10;
			temp = new Node(result);
			if(resultNode == null)
				resultHead = resultNode = temp;
			else{
				resultNode.prev = temp;
				resultNode = temp;
			}
			if(first != null)
				first = first.prev;
			if(second != null)
				second = second.prev;
		}
	}
	
	public static void main(String args[]) {
		AddLinkedList addLL = new AddLinkedList();
		Node ram = null;
		appendFn(new Node(7));
		appendFn(new Node(5));
		appendFn(new Node(9));
		appendFn(new Node(4));
		appendFn(new Node(6));
		ram = head;
		head = null;
		top = null;
		Node ramm = null;
		appendFn(new Node(8));
		appendFn(new Node(4));
		ramm = head;
		//addLL.printList(ram);
		System.out.println();
		//addLL.printList(ramm);
		addLL.addingList(ram, ramm);
		addLL.printList(resultHead);
	}
}
