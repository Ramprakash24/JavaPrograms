package javacollections;
import java.util.PriorityQueue;
import java.util.Iterator;
public class PriorityQueueExample {
	public static void main (String args[]) {
		PriorityQueue<String> pQueue = new PriorityQueue<>();
		pQueue.add("Java");
		pQueue.add("Python");
		pQueue.add("C++");
		pQueue.add("B++");
		pQueue.add("Javascript");
		
		System.out.println(pQueue.peek());
		
		System.out.println("Elements of Queue are:");
		Iterator<String> itr = pQueue.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		pQueue.poll();
		System.out.println("After polling:");
		//Iterator<String> itr2 = pQueue.iterator();
		itr = pQueue.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}
}
