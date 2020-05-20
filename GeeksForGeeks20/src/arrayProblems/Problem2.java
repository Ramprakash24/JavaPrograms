package arrayProblems;

class ProductSubarray{

	public int maxProduct(int[] arr) {
		int n = arr.length;
		int maxEndingHere = 1;
		int minEndingHere = 1;
		int maxSoFar = 1;
		int flag = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] > 0) {
				maxEndingHere *=  arr[i];
				minEndingHere = Math.min(minEndingHere * arr[i], 1);
				flag = 1;
			}
			
			if(arr[i] < 0) {
				int temp = maxEndingHere;
				maxEndingHere = Math.max(minEndingHere * arr[i], 1);
				minEndingHere = temp * arr[i];
			}
			
			if(arr[i] == 0) {
				maxEndingHere = 1;
				minEndingHere = 1;
			}
			
			if(maxSoFar < maxEndingHere)
				maxSoFar = maxEndingHere;

		}
		
		if(flag == 0 && maxSoFar == 1)
			return 0;
		return maxSoFar;
	}
	
}

public class Problem2 {
	public static void main(String args[]) {
		ProductSubarray ps = new ProductSubarray();
		int arr[] = { 1, -2, -3, 0, 7, -8, -2 }; 
		System.out.println("Maximum Product is "+ps.maxProduct(arr));
	}
}
