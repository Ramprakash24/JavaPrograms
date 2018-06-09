package arrayproblems;
//Question : https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotationCountSortedArray {
int countRotations(int[] array, int low, int high) {
	int mid = low + (high - low)/2;
	if(high<low)
		return 0;
	if(high == low)
		return low;
	if(mid < high && array[mid+1] < array[mid])
		return (mid + 1);
	if(mid > low && array[mid] < array[mid - 1])
		return mid;
	if(array[mid] < array[high])
		return countRotations(array,low,mid-1);
	return countRotations(array,mid+1,high);
}
public static void main(String args[]) {
	int[] arr = {15, 18, 2, 3, 6, 12};
	RotationCountSortedArray rcsa = new RotationCountSortedArray();
	System.out.println(rcsa.countRotations(arr, 0, arr.length - 1));
}
}
