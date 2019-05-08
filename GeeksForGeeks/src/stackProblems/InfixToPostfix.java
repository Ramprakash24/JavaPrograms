package stackProblems;
import java.util.Stack;
// Question : https://www.geeksforgeeks.org/stack-set-2-infix-to-postfix/
public class InfixToPostfix {
	
	public static void main(String args[]) {
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println(infixToPostfixFn(exp));
	}

	private static String infixToPostfixFn(String exp) {
		String result = "";
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);
			
			if(Character.isLetterOrDigit(c))
				result += c;
			
			else if(c == '(')
				stack.push(c);
			
			else if(c == ')') {
				while(!stack.isEmpty() && stack.peek() != '(')
					result += stack.pop();
				if(!stack.isEmpty() && stack.peek() != '(')
					return "Invalid";
				else
					stack.pop();
			}
			else {
				while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek()))
					result += stack.pop();
				stack.push(c);
			}
		}
		return result;
	}

	private static int precedence(char c) {
		switch (c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}
}
