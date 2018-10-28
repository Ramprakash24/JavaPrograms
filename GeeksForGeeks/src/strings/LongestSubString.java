package strings;

/*
 * Question : https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/
 * Question : https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
*/
import java.util.Arrays;

public class LongestSubString {
	static int longestSubString(String input) {
	int n = input.length();
	int currentLength = 1;
	int maxLength = 1;
	int previousIndex,i;
	int[] visited = new int[256];
	Arrays.fill(visited, -1);
	visited[input.charAt(0)] = 0;
	for(i = 1; i < n; i++) {
		previousIndex = visited[input.charAt(i)];
		if(previousIndex == -1 || i - currentLength > previousIndex)
			currentLength++;
		else {
			if(currentLength > maxLength)
				maxLength = currentLength;
			currentLength = i - previousIndex;
		}
		visited[input.charAt(i)] = i;
	}
	if(currentLength > maxLength)
		maxLength = currentLength;
	return maxLength;
}
	public static void main(String args[]) {
	String str = "ABDEFGABEF";
	System.out.println("The length of the longest non repeating sequence is: "+longestSubString(str));
}
}
