package arrayproblems;
//Question Link : https://www.geeksforgeeks.org/maximum-sum-iarri-among-rotations-given-array/
public class MaxSumAllRotations {

	int MaxSum(int[] array) {
	int cum_sum = 0;
	int n = array.length;
	System.out.println(n);
	for(int i = 0; i < n; i++)
		cum_sum += array[i];
	System.out.println(cum_sum);
	int cur_val = 0;
	int result = cur_val;
	for(int i = 0; i < n; i++)
		cur_val += i*array[i];
	System.out.println(cur_val);
	for(int i = 1; i < n; i++) {
		int next_val = cur_val - (cum_sum - array[i-1]) + array[i-1]*(n-1);
		cur_val = next_val;
		result = Math.max(result, cur_val);
	}
	return result;
	}
	
	public static void main(String args[]) {
		int[] values = {8,3,1,2};
		MaxSumAllRotations msar = new MaxSumAllRotations();
		System.out.println(msar.MaxSum(values));
	}
}
