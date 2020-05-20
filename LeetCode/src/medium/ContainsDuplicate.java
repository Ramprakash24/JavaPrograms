package medium;

// Question : https://leetcode.com/problems/contains-duplicate-iii/
// One case failing
class Duplicate{
	boolean containsDuplicate(int arr[], int k, int t) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j <= Math.min(i + k, arr.length - 1); j++) {
				int diff = Math.abs(arr[i] - arr[j]);
				if(diff <= t)
					return true;
			}
		}
		return false;
	}	
}

public class ContainsDuplicate {
	public static void main(String args[]) {
		Duplicate d = new Duplicate();
		int numsArr[] = {1,0,1,1}, k = 1, t = 2;
		System.out.println(d.containsDuplicate(numsArr,k,t));
	}
}
