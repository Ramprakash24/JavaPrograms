package doubts;
import java.util.Deque;
import java.util.ArrayDeque;
public class DequeueClass {
	public static void main(String args[]) {
		Deque<Integer> dq = new ArrayDeque<Integer>();
		dq.add(5);
		dq.add(3);
		dq.add(5);
		for(Integer i : dq)
			System.out.println(i);
		//dq.remove();
		System.out.println("after remove");
		System.out.println(dq.contains(5));
		
	}
}
