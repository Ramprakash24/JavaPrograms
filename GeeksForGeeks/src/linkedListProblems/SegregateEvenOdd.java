package linkedListProblems;
// Question : https://www.geeksforgeeks.org/segregate-even-and-odd-elements-in-a-linked-list/
public class SegregateEvenOdd {

	Node nodeList;
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
		if(nodeList == null)
			nodeList = newNode;
		else {
			newNode.next = nodeList;
			nodeList = newNode;
		}
	}
	
	public void printList() {
		Node print = nodeList;
		while(print != null) {
			if(print.next == null)
				System.out.print(print.data);
			else
				System.out.print(print.data+"->");
			print = print.next;
		}
	}
	
	public void segregateNodes() {
		Node evenStart = null;
		Node evenEnd = null;
		Node oddStart = null;
		Node oddEnd = null;
		Node currentNode = nodeList;
		while(currentNode != null) {
			if(currentNode.data % 2 == 0) {
				if(evenStart == null) {
					evenStart = currentNode;
					evenEnd = evenStart;
				}
				else {
					evenEnd.next = currentNode;
					evenEnd = evenEnd.next;
				}
			}
			else {
				if(oddStart == null) {
					oddStart = currentNode;
					oddEnd = oddStart;
				}
				else {
					oddEnd.next = currentNode;
					oddEnd = oddEnd.next;
				}
			}
			currentNode = currentNode.next;
		}
		if(oddStart == null || evenStart == null)
			return;
		evenEnd.next = oddStart;
		oddEnd.next = null;
		nodeList = evenStart;
		
		
	}
	 public static void main(String args[]) 
	    { 
		 	SegregateEvenOdd seo = new SegregateEvenOdd(); 
		 	seo.append(11); 
		 	seo.append(10); 
		 	seo.append(9); 
		 	seo.append(6); 
		 	seo.append(4); 
		 	seo.append(1); 
		 	seo.append(0); 
	        System.out.println("Origional Linked List"); 
	        seo.printList(); 
	   
	        seo.segregateNodes(); 
	        System.out.println();
	        System.out.println("Modified Linked List"); 
	        seo.printList(); 
	    } 
}
