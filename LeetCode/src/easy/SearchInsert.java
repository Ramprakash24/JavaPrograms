package easy;
// Question : https://leetcode.com/problems/search-insert-position/description/
public class SearchInsert {
public static int searchVal(int[] array, int number) {
	int i = 0,j = array.length;
	if(number > array[j - 1])
		return array.length;
	if(number < array[0])
		return 0;
	while(i < j) {
		int mid = (i + j) / 2;
		if(number > array[mid])
			i = mid + 1;
		else
			j = mid;
	}
	return j;
	
}
	public static void main(String args[]) {
	int[] input = {1,3,4,6};
	int val = 5;
	System.out.println(input.length);
	System.out.println(searchVal(input,val));
}
}
