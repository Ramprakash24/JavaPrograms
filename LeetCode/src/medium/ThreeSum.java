package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//Question : https://leetcode.com/problems/3sum/description/
public class ThreeSum {
public static List<List<Integer>> threeSum(int nums[]){
	Arrays.sort(nums);
	HashMap<Integer, Integer> temp = new HashMap<>();
	List<List<Integer>> res = new ArrayList<>();
	for(int i = 0; i < nums.length; i++)
		temp.put(nums[i], i);
	for(int i = 0; i <nums.length - 1; i++) {
		for(int j = i + 1; j < nums.length - 2; j++) {
			int target = 0 - nums[i] - nums[j];
			if(temp.containsKey(target) && temp.get(target) > j) {
				j  = temp.get(nums[j]);
				res.add(Arrays.asList(nums[i], nums[j], target));
			}
		}
		i = temp.get(nums[i]);
		if(i > nums.length - 1)
			break;
	}
	return res;
}

public static void main(String args[]) {
	int input[] = {-1, 0, 1, 2, -1, -4};
	List<List<Integer>> outPut = threeSum(input);
	System.out.println(outPut);
	}
}
