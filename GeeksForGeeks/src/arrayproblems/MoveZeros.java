package arrayproblems;
// Question : https://www.geeksforgeeks.org/move-zeroes-end-array/
public class MoveZeros {
void  movingZeros(int[] array) {
	int count = 0;
	int n = array.length;
	for(int i = 0; i < n; i++) {
		if(array[i] != 0)
			array[count++] = array[i];
	}
	while(count < n)
		array[count++] = 0;
}
void printArray(int[] printArray) {
	for(int i = 0; i < printArray.length; i++)
		System.out.print(printArray[i] + " ");
}

public static void main(String args[]) {
	MoveZeros push = new MoveZeros();
	int[] arrayValue = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
	push.movingZeros(arrayValue);
	push.printArray(arrayValue);
	
}
}
