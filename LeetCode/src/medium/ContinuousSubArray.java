package medium;

import java.util.HashMap;
import java.util.Map;

// Question : https://leetcode.com/problems/continuous-subarray-sum/

class ContinuousArray{
	void checkSubArray(int[] inputArray, int k) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(){{put(0,-1);}};;
		int runningSum = 0;
		
		for(int i = 0; i < inputArray.length; i++) {
			runningSum += inputArray[i];
			if(k != 0)   
				runningSum %= k;
		}
		for(Integer key : map.keySet()) {
			String k1 = key.toString();
			String v = map.get(key).toString();
			System.out.println(k1+" : "+v);
		}
			//System.out.println(key,key.get(key));
	}
}

public class ContinuousSubArray {
	public static void main(String args[]) {
		ContinuousArray ca = new ContinuousArray();
		int[] inputArray = {23, 2, 4, 6, 7};
		//System.out.println(inputArray.length);
		ca.checkSubArray(inputArray,6);
	}
}
