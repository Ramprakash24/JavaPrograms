package arrayproblems;
//Question : https://www.geeksforgeeks.org/reorder-a-array-according-to-given-indexes/
public class Reorder {
void reorderingNumber(int[] array, int[] indexes) {
	int n = array.length;
	int[] temp = new int[n];
	for(int i = 0; i < n; i++) {
		temp[indexes[i]] = array[i];
	}
	
	for(int i = 0; i < n; i++)
		array[i] = temp[i];
}
void printArray(int[] printArray) {
	for(int i = 0; i < printArray.length; i++)
		System.out.println(printArray[i]);
}

public static void main(String args[]) {
	Reorder reoderNum = new Reorder();
	int[] arrayValue = {50, 40, 70, 60, 90};
	int[] indexValue = {3,  0,  4,  1,  2};
	reoderNum.reorderingNumber(arrayValue,indexValue);
	reoderNum.printArray(arrayValue);
	
}
}
