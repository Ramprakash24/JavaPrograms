//Question : https://www.geeksforgeeks.org/rearrange-array-maximum-minimum-form-set-2-o1-extra-space/
// The complexity of the code is O(n) and without extraspace.
package arrayproblems;

public class RearrangeArrayMinMax {
	public static void main(String args[]) {
		int arrInput[] = {1,2,3,4,5,6,7,8,9};
		int n = arrInput.length;
		
		for(int i = 0; i < n; i++)
			System.out.print(arrInput[i]+" ");
		
		rearrangeMinMax(arrInput,n);
		System.out.println();
		for(int i = 0; i < n; i++)
			System.out.print(arrInput[i]+" ");
		
	}

	public static void rearrangeMinMax(int[] arr, int n) {
		int maxIndex = n - 1;
		int minIndex = 0;
		int maxElement = arr[maxIndex] + 1;
		
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				arr[i] += ( arr[maxIndex] % maxElement ) * maxElement;
				maxIndex--;
			}
			else {
				arr[i] += ( arr[minIndex] % maxElement) * maxElement;
				minIndex++;
			}
		}
		
		for(int i = 0; i < n; i++)
			arr[i] = arr[i] / maxElement;
		
	}

}
