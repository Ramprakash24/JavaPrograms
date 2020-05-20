package hashProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Frequency{
	int findNumberOfMaxFrequency(int arr[]) {
		Map<Integer, Integer> h = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.length - 1; i++) {
			if(h.containsKey(arr[i])) {
				int freq = h.get(arr[i]);
				freq++;
				h.put(arr[i], freq);
			}
			else
				h.put(arr[i], 1);
		}
		int maxCount = 0,res = -1;
		for(Entry<Integer, Integer> val : h.entrySet()) {
			if(maxCount < val.getValue()) {
				maxCount = val.getValue();
				res = val.getKey();
			}
		}
		return res;
	}
}
public class MaxFequency {
	public static void main(String args[]) {
		Frequency fre = new Frequency();
		int arr[] = {1, 5, 2, 1, 3, 2, 1,2,2,2}; 
        System.out.println(fre.findNumberOfMaxFrequency(arr)); 
	}
}
