package medium;
// Question : https://leetcode.com/problems/set-matrix-zeroes/
class SetToZeros{

	public int[][] updateZeros(int[][] inputArray) {
		boolean firstRow = false;
		boolean firstColumn = false;
		int m = inputArray.length;
		int n = inputArray[0].length;
		// Checking if the first column contains zeros:
		for(int i = 0; i < m; i++)
			if(inputArray[i][0] == 0)
				firstColumn = true;
		
		// Checking if the first row contains zeros:
		for(int j = 0; j < n; j++)
			if(inputArray[0][j] == 0)
				firstRow = true;
		
		//Checking every element in matrix and setting the respective row & column to zero
		for(int i = 1; i < m ; i++)
			for(int j = 1; j < n; j++)
				if(inputArray[i][j] == 0) {
					inputArray[i][0] = 0;
					inputArray[0][j] = 0;
				}
		
		// Check if each row contains zero'th element by checking the firstColumn and update the entire row
		for(int i = 1 ; i < m; i++) {
			if(inputArray[i][0] == 0) {
				for(int j = 1; j < n; j++)
					inputArray[i][j] = 0;
			}
		}
		
		
		//Check if each column contains zero'th element by checking the firstRow and update the entire column
		for(int j = 1; j < n; j++) {
			if(inputArray[0][j] == 0) {
				for(int i = 1; i < m; i++)
					inputArray[i][j] = 0;
			}
		}
		
		//if firstRow or firstColumn equals to true then update first row and column
		if(firstRow)
			for(int j = 0; j < n; j++)
				inputArray[0][j] = 0;
		
		if(firstColumn)
			for(int i = 0; i < m; i++)
				inputArray[i][0] = 0;
		
		return inputArray;
	}
	
}
public class SetZeros {
	public static void main(String args[]) {
		SetToZeros sz = new SetToZeros();	
		int[][] inputArray = {{5,10,0,6,3},
							{7,12,11,20,15},
							{1,2,4,8,9},
							{13,0,14,16,19},
							{0,20,25,21,24},
							{22,23,25,21,30}};
		
		int[][] outputArray = sz.updateZeros(inputArray);
		for(int i = 0; i < outputArray.length; i++) {
			for(int j = 0; j < outputArray[0].length; j++)
				System.out.print(outputArray[i][j] + " ");
			System.out.println();
		}
	}
}
