package linkedListProblems;
// Question : https://www.geeksforgeeks.org/flatten-a-linked-list-with-next-and-child-pointers/
public class FlattenList {
	static Node head;
	
	class Node{
		int data;
		Node next,child;
		Node(int d){
			data = d;
			next = child = null;
		}
	}
	
	private Node createList(int[] array, int n) {
		Node node = null;
		Node p = null;
		for(int i = 0; i < n; i++) {
			if(node == null)
				node = p = new Node(array[i]);
			else {
				p.next = new Node(array[i]);
				p = p.next;
			}
			p.next = p.child = null;
		}
		return node;
	}
	private Node createList() {
		int arr1[] = new int[]{10, 5, 12, 7, 11}; 
        int arr2[] = new int[]{4, 20, 13}; 
        int arr3[] = new int[]{17, 6}; 
        int arr4[] = new int[]{9, 8}; 
        int arr5[] = new int[]{19, 15}; 
        int arr6[] = new int[]{2}; 
        int arr7[] = new int[]{16}; 
        int arr8[] = new int[]{3}; 
        
        // converting the array to list
        Node head1 = createList(arr1, arr1.length);
        Node head2 = createList(arr2, arr2.length);
        Node head3 = createList(arr3, arr3.length);
        Node head4 = createList(arr4, arr4.length);
        Node head5 = createList(arr5, arr5.length);
        Node head6 = createList(arr6, arr6.length);
        Node head7 = createList(arr7, arr7.length);
        Node head8 = createList(arr8, arr8.length);
        
        // Modifying the linkedlist to the structure required
        head1.child = head2; 
        head1.next.next.next.child = head3; 
        head3.child = head4; 
        head4.child = head5; 
        head2.next.child = head6; 
        head2.next.next.child = head7; 
        head7.child = head8;
        
        return head1;
	}
	void flatten(Node node) {
		if(node == null)
			return;
		
		Node temp = null;
		
		Node tail = node;
		while(tail.next != null)
			tail = tail.next;
		
		Node cur = node;
		while(cur != tail) {
			if(cur.child != null) {
				tail.next = cur.child;
				temp = cur.child;
				while(temp.next != null)
					temp = temp.next;
				tail = temp;
			}
			cur = cur.next;
		}
		
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
	public static void main(String args[]) {
		FlattenList fl = new FlattenList();
		head = fl.createList();
		fl.flatten(head);
		fl.printList(head);
		
	}
}
