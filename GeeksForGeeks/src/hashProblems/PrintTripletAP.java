package hashProblems;

import java.util.ArrayList;

// Question : https://www.geeksforgeeks.org/print-triplets-sorted-array-form-ap/
class Triplet{
	void printTriplets(int inputArray[]) {
		int n = inputArray.length;
		ArrayList<Integer> tripletExists = new ArrayList<Integer>();
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				int diff = inputArray[j] - inputArray[i];
				boolean exists = tripletExists.contains(inputArray[i] - diff);
				if(exists)
					System.out.println(inputArray[i] - diff +" "+ inputArray[i] +" "+inputArray[j]);
			}
			tripletExists.add(inputArray[i]);
		}
	}
}
public class PrintTripletAP {
	public static void main(String args[]) {
		Triplet t = new Triplet();
		int []arr = {2, 6, 9, 12, 17,22, 31, 32, 35, 42}; 
		t.printTriplets(arr); 
	}
}
