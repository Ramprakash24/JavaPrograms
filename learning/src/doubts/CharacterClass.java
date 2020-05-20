package doubts;

import java.util.Stack;

public class CharacterClass {
	public static void main(String args[]) {
		char c = 'a';
		char d = '+';
		System.out.println(Character.isLetterOrDigit(c));
		System.out.println(Character.isLetterOrDigit(d));
		Stack<Character> stackChar = new Stack<>();
		System.out.println(stackChar.pop());
	}
}
