package arrayproblems;
// Question : https://www.geeksforgeeks.org/rearrange-array-alternating-positive-negative-items-o1-extra-space/
public class RearrangeArray {
public void rightRotate(int[] array, int outOfPlace, int current) {
	
	int temp = array[current];
	for(int i = current; i > outOfPlace; i--) 
		array[i] = array[ i - 1 ];
	array[outOfPlace] = temp;
}
public void rearrangeAlternating(int[] array) {
	int i = 0, arrLength = array.length, outOfPlace = 0,temp = 0;
	while(i < arrLength) {
		if(i % 2 == 1 && array[i] < 0) {
			outOfPlace = temp = i;
			while(temp < arrLength && array[temp] > 0)
				temp++;
			rightRotate(array,outOfPlace,temp);
		}
		
		if(i % 2 == 0 && array[i] > 0) {
			outOfPlace = temp = i;
			while(temp < arrLength && array[temp] < 0)
				temp++;
			rightRotate(array,outOfPlace,temp);
		}
		i++;
	}
}
void printArray(int[] printArray) {
	for(int i = 0; i < printArray.length; i++)
		System.out.print(printArray[i] + " ");
}
public static void main(String args[]) {
	RearrangeArray rearrangeArray = new RearrangeArray();
	int[] arrayValue = {-5,-2,5,2,4,7,1,8,0,-8};
	System.out.println("The expected output is:");
	int[] expectedArray = {-5,5,-2,2,-8,4,7,1,8,0};
	rearrangeArray.printArray(expectedArray);
	rearrangeArray.rearrangeAlternating(arrayValue);
	System.out.println("\n");
	System.out.println("The Obtained output is:");
	rearrangeArray.printArray(arrayValue);
	}
}
