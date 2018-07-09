package arrayproblems;

import java.util.Arrays;

//Question : https://www.geeksforgeeks.org/rearrange-array-arri-arrj-even-arri/
public class Rearrange {
	public static void rearrange(int[] array) {
		int n = array.length;
		int oddPosition = n - (n / 2);
		int[] tempArray = new int[n];
		for(int i = 0; i < n ; i++)
			tempArray[i] = array[i];
		Arrays.sort(tempArray);
		int j = oddPosition - 1;
		for(int i = 0; i < n; i += 2) {
			array[i] = tempArray[j];
			j--;
		}
		
		j = oddPosition;
		for(int i = 1; i < n; i += 2) {
			array[i] = tempArray[j];
			j++;
		}
 	}
	
	public static void main(String args[]) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		rearrange(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
