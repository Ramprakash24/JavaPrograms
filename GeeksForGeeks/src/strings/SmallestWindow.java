package strings;

import java.util.Arrays;

/* 
 * Question : https://www.geeksforgeeks.org/length-smallest-sub-string-consisting-maximum-distinct-characters/
 * Question : https://www.geeksforgeeks.org/smallest-window-contains-characters-string/ --> logic from this link
 * Question : https://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/
*/
public class SmallestWindow {
public static String findSubString(String str) {
	int n = str.length();
	boolean[] visited = new boolean[256];
	int dist_count = 0;
	Arrays.fill(visited, false);
	for(int i = 0; i < n; i++) {
		if(visited[str.charAt(i)] == false) {
			visited[str.charAt(i)] = true;
			dist_count++;
		}
	}
	int start = 0, start_index = -1;
	int min_len = Integer.MAX_VALUE;
	int count = 0;
	int[] curr_count = new int[256];
	for(int j = 0; j < n; j++) {
		curr_count[str.charAt(j)]++;
		if(curr_count[str.charAt(j)] == 1)
			count++;
		if(count == dist_count) {
			while(curr_count[str.charAt(start)] > 1) {
//				if(curr_count[str.charAt(start)] > 1)
					curr_count[str.charAt(start)]--;
				start++;
			}
			int len_window = j - start + 1;
			if(min_len > len_window) {
				min_len = len_window;
				start_index = start;
			}
		}
	}
	return str.substring(start_index, start_index+min_len);
}
public static void main(String args[]) {
	String str = "ABDEFGABEF";
	System.out.println(findSubString(str).length());
}
}
