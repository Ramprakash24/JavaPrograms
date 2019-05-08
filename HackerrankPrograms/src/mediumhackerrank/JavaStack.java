package mediumhackerrank;
// Question : https://www.hackerrank.com/challenges/java-stack/problem
// Question : https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
import java.util.Stack;
public class JavaStack {
	public static void main(String args[]) {
	String paranthesis = "({())";
	System.out.println(isBalanced(paranthesis) ? "Balanced" : "Unbalanced");
	}

	private static boolean isBalanced(String paranthesis) {
		Stack<Character> stackValue = new Stack<Character>();
		for(int i = 0; i < paranthesis.length(); i++) {
			char ch = paranthesis.charAt(i);
			if(ch == '{' || ch == '(' || ch == '[' || ch == '<')
				stackValue.push(ch);
			else if(stackValue.empty()) // if the first input is '}' or ')' or ']' or '>' then it is imbalanced
				return false;
			else {
				char popch = stackValue.pop();
				if((popch == '{' && ch != '}') ||(popch == '(' && ch != ')') ||
						(popch == '[' && ch != ']') || (popch == '<' && ch != '>'))
					return false;
			}
		}
		return stackValue.empty();
	}
}
