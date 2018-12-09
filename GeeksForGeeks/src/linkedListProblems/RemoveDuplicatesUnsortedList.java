package linkedListProblems;
import java.util.HashSet;
// Question : https://www.geeksforgeeks.org/remove-duplicates-from-an-unsorted-linked-list/
public class RemoveDuplicatesUnsortedList {
	Node head = null;
	class Node{
		int data;
		Node next;
		public Node(int d) {
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
	
	public void removeDuplicates() {
		Node temp = head;
		HashSet<Integer> hs = new HashSet<>();
		Node prev = null;
		while(temp != null) {
			int tempData = temp.data;
			if(hs.contains(tempData))
				prev.next = temp.next;
			else {
				hs.add(tempData);
				prev = temp;
			}
			temp = temp.next;
		}
	}
	
	public void printList() {
		Node print = head;
		while(print != null) {
			if(print.next == null)
				System.out.print(print.data);
			else
				System.out.print(print.data+"->");
			print = print.next;
		}
	}
	public static void main(String args[]) {
		RemoveDuplicatesUnsortedList rdul = new RemoveDuplicatesUnsortedList();
		rdul.append(10);
		rdul.append(12);
		rdul.append(11);
		rdul.append(11);
		rdul.append(12);
		rdul.append(11);
		rdul.printList();
		rdul.removeDuplicates();
		System.out.println();
		rdul.printList();
	}
}
