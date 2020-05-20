package hashProblems;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
// Question : https://www.geeksforgeeks.org/find-whether-an-array-is-subset-of-another-array-set-1/
public class IsSubsetOfArray {
	public static void main(String args[]) {
		IsSubsetOfArray is = new IsSubsetOfArray();
		int[] arrayA = {11, 1, 13, 21, 3, 7,3};
		int[] arrayB = {11, 3, 7, 1};
		if(is.isSubset(arrayA,arrayB))
			System.out.println("Subset");
		else
			System.out.println("Not a Subset");
	}

	private boolean isSubset(int[] arrayA, int[] arrayB) {
		
		HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		for(int i = 0 ; i < arrayA.length; i++)
			if(!hs.containsKey(arrayA[i]))
				hs.put(arrayA[i],1);
			else
				hs.put(arrayA[i], hs.get(arrayA[i]) + 1);
	
		/*
		for(int i = 0; i < arrayB.length; i++) {
			if(hs.containsKey(arrayB[i]))
				System.out.println(hs.get(arrayB[i]));
		
			if(hs.get(arrayB[i]) < 0)
				return false;
			if(hs.containsKey(arrayB[i]))
				hs.put(arrayA[i], hs.get(arrayA[i]) - 1);
		
		}
		*/
		
		for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue().toString());
		}
		
		//System.out.println(hs.get(new );
		return true;
	}
	
	
}
