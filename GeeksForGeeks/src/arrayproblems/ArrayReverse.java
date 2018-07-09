package arrayproblems;
// Question : https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
public class ArrayReverse {
	void reverseArray(int[] array, int start, int end) {
	int temp;
	if(start >= end)
		return;
	temp = array[start];
	array[start] = array[end];
	array[end] = temp;
	reverseArray(array, start+1, end-1);
	}
	
	void printArray(int[] printArr) {
		for(int i = 0; i < printArr.length; i++)
			System.out.println(printArr[i]);
	}
	
	public static void main(String args[]) {
		ArrayReverse reverse = new ArrayReverse();
		int[] arrayValue = {100,200,300,400,500,600,700};
		reverse.reverseArray(arrayValue, 0, arrayValue.length-1);
		reverse.printArray(arrayValue);		
	}
	/*
	 Note : The time complexity of the algorithm is O(n) because recursion happens for n/2 times
	 */
}
