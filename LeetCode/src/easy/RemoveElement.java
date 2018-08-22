package easy;
// Question : https://leetcode.com/problems/remove-element/solution/

public class RemoveElement {
public static int[] removeElement(int[] array, int value) {
	int j = 0;
	int n = array.length;
	for(int i = 0; i < n; i++) 
		if(array[i] != value) {
			array[j] = array[i];
			j++;
		}
	return array;
}
public static void main(String args[]) {
	int[] a = {0,1,2,2,3,0,4,2};
	int val = 2;
	int[] b = removeElement(a,val);
	for(int i = 0; i < b.length; i++)
		System.out.println(b[i]);
	}
}
