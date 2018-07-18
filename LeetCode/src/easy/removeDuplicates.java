package easy;

public class removeDuplicates {
public int[] removeDuplicatesArray(int[] nums) {
	int n = nums.length;
	int i = 0;
	while(i < n) {
		int j = i + 1;
		while(j < n && nums[i] == nums[j]) {
			nums[j] = -1;
			j++;
		}
		i = j;
	}
	return nums;
}
void printArray(int[] printArray) {
	for(int i = 0; i < printArray.length; i++)
	{
		if(printArray[i] != -1)
		System.out.print(printArray[i] + " ");
	}
}
public static void main(String args[]) {
	removeDuplicates r = new removeDuplicates();
	int[] inputArray = {0,0,1,1,1,2,2,3,3,4,5,5};
	int[] outputArray = r.removeDuplicatesArray(inputArray);
	r.printArray(outputArray);
}
}
