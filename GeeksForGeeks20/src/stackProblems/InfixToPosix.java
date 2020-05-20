package stackProblems;

import java.util.Stack;

// Question : https://www.geeksforgeeks.org/stack-set-2-infix-to-postfix/

class InfixToPosixConversion{
	
	public String convertInfixToPosix(String inputValue) {
		String result = new String("");
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0 ; i < inputValue.length(); i++) {
			char c = inputValue.charAt(i);
			
			if(Character.isLetterOrDigit(c))
				result += c;
			else if (c == '(')
				stack.push(c);
			else if(c == ')') {
				while(!stack.isEmpty() && stack.peek() != '(')
					result += stack.pop();
				if(!stack.isEmpty() && stack.peek() != '(')
					return "Invalid Expression";
				else
					stack.pop();
			}
			else {
				while(!stack.isEmpty() && precedence(c) < precedence(stack.peek())) {
					if(stack.peek() == '(')
						return "Invalid Expression";
					result += stack.pop();
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty()) {
			if(stack.peek() == '(')
				return "Invalid Expression";
			result += stack.pop();
		}
		return result;
	}

	public int precedence(char ch) {
		switch(ch) {
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

public class InfixToPosix {
	public static void main(String args[]) {
		InfixToPosixConversion ipc = new InfixToPosixConversion();
		String inputValue = "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println(ipc.convertInfixToPosix(inputValue));
	}
}
