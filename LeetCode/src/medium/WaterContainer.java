package medium;
// Question : https://leetcode.com/problems/container-with-most-water/description/
public class WaterContainer {
public static int calculateArea(int[] array) {
	// Time complexitiy is O(n^2)
	int maxArea = 0;
	int n = array.length;
	for(int i = 0; i < n - 1; i++)
		for(int j = i + 1; j < n; j++) {
			int height = array[i] < array[j] ? array[i] : array[j];
			int length = j - i;
			int area = length * height;
			if(area > maxArea)
				maxArea = area;
		}
	return maxArea;
}
public static int effcientArea(int[] array) {
	int maxArea = 0;
	int start = 0;
	int end = array.length - 1;
	while( start < end) {
		maxArea = Math.max(maxArea, area(array,start,end));
		if(array[start] < array[end])
			start++;
		else
			end--;
	}
	return maxArea;
}

public static int area(int[] heightValues, int i, int j) {
	return Math.min(heightValues[i], heightValues[j]) * (j - i);
}
public static void main(String args[]) {
	long startTime = System.nanoTime();
	int[] input = {1,8,6,2,5,4,8,3,7};
	System.out.println(effcientArea(input));
	long endTime = System.nanoTime();
	System.out.println((endTime - startTime) / 1000000);
}
}
