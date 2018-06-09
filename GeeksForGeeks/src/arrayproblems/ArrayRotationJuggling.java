package arrayproblems;
/* Question Link : https://www.geeksforgeeks.org/array-rotation/
 * Method 3, scroll down 
 */
public class ArrayRotationJuggling {
	void juggling(int[] array, int numberOfRotations) {
		int gcdValue = gcd(array.length, numberOfRotations);
		for(int i = 0 ; i < gcdValue ; i++) {
			int temp,j;
			temp = array[i];
			for(j = i; j + numberOfRotations < array.length ; j = j + numberOfRotations)
				array[j] = array[j+numberOfRotations];
			array[j] = temp;
		}
	}
	int gcd(int len, int numberOfRotations) {
		if(numberOfRotations == 0)
			return len;
		else
			return gcd(numberOfRotations, len%numberOfRotations);
	}
	void printArray(int[] printArray) {
		for(int i = 0; i < printArray.length; i++)
			System.out.println(printArray[i]);
	}
	public static void main(String args[]) {
		ArrayRotationJuggling juggle = new ArrayRotationJuggling();
		int[] array = {10,20,30,40,50,60,70};
		juggle.juggling(array, 2);
		juggle.printArray(array);
	}
}
