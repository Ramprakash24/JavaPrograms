package arrayProblems;

import java.util.Arrays;

// Question : https://www.geeksforgeeks.org/rearrange-array-arri-arrj-even-arri/

class RearrangeEvenOdd{

	public void reArrange(int[] inputArray) {
		int n = inputArray.length;
		int oddPosition	 = n / 2;
		int evenPosition = n - oddPosition;
		int[] tempArray = Arrays.copyOf(inputArray, n);
		Arrays.sort(tempArray);
		int j = evenPosition - 1;
		for(int i = 0; i < n ; i += 2) {
			inputArray[i] = tempArray[j];
			j--;
		}
		
		j = evenPosition;
		for(int i = 1; i < n; i += 2) {
			inputArray[i] = tempArray[j];
			j++;
		}
		for(int i = 0; i < n ; i++)
			System.out.print(inputArray[i] + " ");
		//System.out.println(evenPosition);
		
	}
	
}
public class Problem1 {
	public static void main(String args[]) {
		RearrangeEvenOdd reo = new RearrangeEvenOdd();
		int[] inputArray = { 1, 2, 3, 4, 5, 6, 7 };
		reo.reArrange(inputArray);
		
	}
	
	
}
