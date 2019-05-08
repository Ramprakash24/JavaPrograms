package medium;
// Question : https://leetcode.com/problems/reverse-words-in-a-string/
public class ReverseWordsInString {
	public static void main(String args[]) {
		ReverseWordsInString rs = new ReverseWordsInString();
		String input = " 1";
		System.out.println("The input:" + input);
		String output = rs.reverseWords(input);
		System.out.println("The output:" + output);
	}

	private String reverseWords(String input) {
		String[] words = input.split(" ");
		String returnValue = "";
		for(int i = words.length - 1; i >= 0; i--) {
			if(i == 0)
				returnValue += words[i];
			else
				returnValue += words[i] + " ";
		}
			
		return returnValue;
	}
	
	/*
	 https://www.programcreek.com/2014/02/leetcode-reverse-words-in-a-string-java/
	 The above link code alone is getting submitted into leetcode
	 */
}
