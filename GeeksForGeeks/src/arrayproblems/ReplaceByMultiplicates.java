package arrayproblems;
// Question : https://www.geeksforgeeks.org/replace-every-array-element-by-multiplication-of-previous-and-next/
public class ReplaceByMultiplicates {
	public static void main(String args[]) {
	int[] inputArray = {2,3,4,5,6,7};
	int n = inputArray.length;
	
	multiplicateOfEveryElement(inputArray,n);
	for(int i = 0; i < n; i++)
		System.out.print(inputArray[i]+" ");
	}

	public static void multiplicateOfEveryElement(int[] array, int size) {
		int previous = array[0];
		array[0] = array[0] * array[1];
		
		for(int i = 1; i < size - 1; i++) {
			int current = array[i];
			array[i] = previous * array[i + 1];
			previous = current;
		}
		
		array[size - 1] = previous * array[size - 1];
	}
	
	
}
