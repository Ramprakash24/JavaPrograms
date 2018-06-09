package arrayproblems;
// Question Link : https://www.geeksforgeeks.org/array-rotation/
public class ArrayRotation {
	void rotateLeftByOne(int[] array, int lengthValue) {
		int i,temp;
		temp = array[0];
		for(i = 0; i < lengthValue - 1; i++)
			array[i] = array[i+1];
		array[i] = temp;
	}
	void leftRotate(int[] array,int d, int lengthValue) {
		for(int i = 0; i < d; i++)
			rotateLeftByOne(array, lengthValue);
	}
	void printArray(int[] printArray) {
		for(int i = 0; i < printArray.length; i++)
			System.out.println(printArray[i]);
	}
	
	public static void main(String args[]) {
		ArrayRotation rotate = new ArrayRotation();
		int[] arrayValue = {100,200,300,400,500,600,700};
		rotate.leftRotate(arrayValue,2, arrayValue.length);
		rotate.printArray(arrayValue);
		
	}
}
