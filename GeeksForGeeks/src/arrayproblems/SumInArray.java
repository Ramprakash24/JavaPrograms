package arrayproblems;

import java.util.Arrays;

public class SumInArray {
	int[] isSumAvailable(int[] array, int sum) {
		int[] a = new int[2];
		int left, right;
		left = 0;
		right = array.length - 1;
		while(left < right) {
			if(array[left] + array[right] == sum) {
				a[0] = left;
				a[1] = right;
				return a;
			}
			else if(array[left] + array[right] < sum)
				left++;
			else
				right--;
		}
		a[0] = -1;
		a[1] = -1;
		return a;
	}
	
	public static void main(String args[]) {
		int[] array = {-8,1,4,6,10,11};
		SumInArray sumEvaluation = new SumInArray();
		Arrays.sort(array);
		int sumValue = 16;
		int[] b = sumEvaluation.isSumAvailable(array, sumValue);
		if(b[0] == -1 && b[1] == -1)
			System.out.println("The sum pair is not found");
		else
			System.out.println("The pair of the sum "+sumValue+" is ("+array[b[0]]+","+array[b[1]]+")");
	}
}
