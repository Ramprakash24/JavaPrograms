package stackProblems;

import java.util.Stack;

// Question : https://www.geeksforgeeks.org/prefix-infix-conversion/
// Question : https://www.geeksforgeeks.org/prefix-postfix-conversion/

class PrefixToInfixConversion{

	public String convertPrefixToInfix(String prefixExpression) {
		Stack<String> infixStack = new Stack<>();
		Stack<String> posfixStack = new Stack<>();
		int length = prefixExpression.length();
		
		for(int i = length -1 ; i >= 0; i--) {
			if(isOperator(prefixExpression.charAt(i))) {
				infixStack.push("(" + infixStack.pop() + prefixExpression.charAt(i) + infixStack.pop() + ")");
				posfixStack.push(posfixStack.pop() + posfixStack.pop() + prefixExpression.charAt(i));
			}
			else {
				infixStack.push(Character.toString(prefixExpression.charAt(i)));
				posfixStack.push(Character.toString(prefixExpression.charAt(i)));
			}
				
		}
		return "Infix: " + infixStack.peek() + "\n" + "Posfix: " + posfixStack.peek();
		}

	private boolean isOperator(char ch) {
		switch(ch) {
			case '+':
			case '-':
			case '*':
			case '/':
				return true;
		}
		return false;
	}
	
}
public class PrefixToInfix {
	public static void main(String args[]) {
		String prefixExpression = "*-A/BC-/AKL";
		PrefixToInfixConversion pic = new PrefixToInfixConversion();
		System.out.println(pic.convertPrefixToInfix(prefixExpression));
	}
}
