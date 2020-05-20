package hashProblems;

import java.util.HashSet;

// Question : https://www.geeksforgeeks.org/find-whether-an-array-is-subset-of-another-array-set-1/

class CheckSubsetArray{

	public boolean isSubset(int[] aArray, int[] bArray) {
		int aLength = aArray.length;
		int bLength = bArray.length;
		HashSet<Integer> hSet = new HashSet<>();
		
		for(int i = 0; i < aLength; i++)
			if(!hSet.contains(aArray[i]))
				hSet.add(aArray[i]);
		
		for(int i = 0 ; i < bLength; i++)
			if(!hSet.contains(bArray[i]))
				return false;
		return true;
	}
	
}
public class SubsetArray {
	public static void main(String args[]) {
		CheckSubsetArray cSA = new CheckSubsetArray();
		int[] aArray = {11, 1, 13, 21, 3, 7}; 
		int[] bArray = {11, 3, 7, 1};
		if(cSA.isSubset(aArray,bArray))
			System.out.println("bArray is subset of aArray");
		else
			System.out.println("bArray isNot Subset of aArray");
	}
}
