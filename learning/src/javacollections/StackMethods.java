package javacollections;
import java.util.Stack;
public class StackMethods {
	public static void main(String args[]) {
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop());
	}
}
