package medium;

import java.util.Arrays;

// Question : https://leetcode.com/problems/3sum-closest/

class Closest{
	public int threeSumClosest(int[] inputArray, int target) {
		int distance = Integer.MAX_VALUE;
		int closestValue = 0;
		Arrays.sort(inputArray);
		for(int i = 0 ; i < inputArray.length - 2 ; i++) {
			if(i == 0 || (i > 0 && inputArray[i] != inputArray[i - 1])) {
				int lowIndex = i + 1;
				int highIndex = inputArray.length - 1;
				
				while(lowIndex < highIndex) {
					int sum = inputArray[lowIndex] + inputArray[highIndex] + inputArray[i];
					int currentDistance = Math.abs(target - sum);
					
					if(currentDistance < distance) {
						distance = currentDistance;
						closestValue = sum;
					}
					
					if(sum == target)
						return target;
					else if(sum < target)
						lowIndex++;
					else if(sum > target)
						highIndex--;
				}
			}
		}
		return closestValue;
	} 
}
public class ThressSumClosest {
	public static void main(String args[]) {
		Closest c = new Closest();
		int[] inputArray = {-1, 2, 1, -4};
		int target = 1;
		System.out.println(c.threeSumClosest(inputArray,target));
	}
}
