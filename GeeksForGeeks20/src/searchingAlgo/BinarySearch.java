package searchingAlgo;
// Question : https://www.geeksforgeeks.org/binary-search/

class BinarySearchAlgo{

	public int binarySearch(int[] inputArray, int left, int right, int search) {
		
		if(right >= left) {
		int mid = left + (right - left) / 2;
		if(inputArray[mid] == search)
			return mid;
		if(inputArray[mid] > search)
			 return binarySearch(inputArray, left, mid - 1, search);
		else
			return binarySearch(inputArray, mid + 1, right, search);
		}
		return -1;
	}
	
}

public class BinarySearch {
	public static void main(String args[]) {
		BinarySearchAlgo bsa = new BinarySearchAlgo();
		int[] inputArray = {2, 3, 4, 10, 40};
		int search = 10;
		int position = bsa.binarySearch(inputArray,0,inputArray.length - 1, search);
		if(position == -1)
			System.out.println("Element NOT found");
		else
			System.out.println("Element found at "+position	 );
	}
}
