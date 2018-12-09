package linkedListProblems;
// Question : https://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-lists/
public class IntersectionOfNodes {

	Node node1, node2;

	static class Node{
	int data;
	Node next;
		Node(int d){
		data = d;
		next = null;
		}
	}
	
	int getNode() {
		int count1 = getCount(node1);
		int count2 = getCount(node2);
		int d;
		
		if(count1 > count2) {
			d = count1 - count2;
			return getIntersection(d,node1,node2);
		}
		else {
			d = count2 - count1;
			return getIntersection(d,node2,node1);
		}
	}
	
	
	public int getIntersection(int d, Node n1, Node n2) {
		Node current1 = n1;
		Node current2 = n2;
		for(int i = 0; i < d; i++) {
			if(current1 == null)
				return -1;
			current1 = current1.next;
		}
		while(current1 != null && current2 != null) {
			if(current1 == current2)
				return current1.data;
			current1 = current1.next;
			current2 = current2.next;
		}
		return -1;
	}
	public int getCount(Node node) {
		Node current = node;
		int count = 0;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	public static void main(String args[]) {
		IntersectionOfNodes list = new IntersectionOfNodes(); 
		  
        // creating first linked list 
        list.node1 = new Node(3);
        list.node1.next = new Node(6); 
        list.node1.next.next = new Node(15); 
        list.node1.next.next.next = new Node(16); 
        list.node1.next.next.next.next = new Node(30); 
  
        // creating second linked list 
        list.node2 = new Node(10); 
        list.node2.next = list.node1.next.next.next; 
        list.node2.next.next = list.node1.next.next.next.next; 
  
        System.out.println("The node of intersection is " + list.getNode());
	}
}

