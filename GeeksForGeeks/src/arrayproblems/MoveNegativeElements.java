/* Question : https://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers/
 * You need to understand the working of the mergesort for the same problem, so that you can solve 
 * the code in O(nlogn)
 * */
package arrayproblems;

public class MoveNegativeElements {
public static void main(String args[]) {
	int arr[] = {12,11,-13,-5,6,-7,5,-3,-6};
	int n = arr.length;
	for(int i = 0; i < n; i++)
		System.out.print(arr[i]+" ");
	System.out.println();
	moveNegativeInsertion(arr,n);
	for(int i = 0; i < n; i++)
		System.out.print(arr[i]+" ");
	
}

public static void moveNegativeInsertion(int[] arr, int n) {
	int key,j;
	
	for(int i = 1; i < n; i++) {
		key = arr[i];
		if(key < 0) {
			j = i - 1;
			while(j >= 0 && arr[j] > 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}
}
