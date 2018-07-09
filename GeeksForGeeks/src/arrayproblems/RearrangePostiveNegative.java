package arrayproblems;
// Question : https://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers-publish/
public class RearrangePostiveNegative {
public void rearrange(int[] array) {
	int n = array.length, i = -1, temp = 0;
	for(int j = 0; j < n; j++) {
		if(array[j] < 0) {
			i++;
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}
	
	int positive = i + 1, negative = 0;
	while(positive < n && negative < positive && array[negative] < 0) {
		temp = array[negative];
		array[negative] = array[positive];
		array[positive] = temp;
		positive++;
		negative += 2;
	}
}
void printArray(int[] printArr) {
	for(int i = 0; i < printArr.length; i++)
		System.out.print(printArr[i] + " ");
}
public static void main(String args[]) {
	RearrangePostiveNegative alternate = new RearrangePostiveNegative();
	int[] arrayValue = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
	alternate.rearrange(arrayValue);
	alternate.printArray(arrayValue);		
}
}
