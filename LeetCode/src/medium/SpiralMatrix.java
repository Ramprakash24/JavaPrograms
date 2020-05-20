package medium;
// Question : https://leetcode.com/problems/spiral-matrix/
// Solution : https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/

import java.util.ArrayList;
import java.util.List;

class Matrix{
public List<Integer> printSpiral(int[][] matrix) {
		
		int endRow,endColumn,startRow,startColumn,i;
		List<Integer> resultList = new ArrayList<Integer>();
		if (matrix.length == 0) return resultList;
        endRow = matrix.length;
		endColumn = matrix[0].length;
		startColumn = 0;
		startRow = 0;
		
		while(startRow < endRow && startColumn < endColumn) {
			for(i = startColumn; i < endColumn; ++i)
				resultList.add(matrix[startRow][i]);
			startRow++;
			
			for(i = startRow; i < endRow; ++i)
				resultList.add(matrix[i][endColumn - 1]);
			endColumn--;
			
			if(startRow < endRow) {
				for(i = endColumn - 1; i >= startColumn; --i)
					resultList.add(matrix[endRow - 1][i]);
				endRow--;
			}
			
			if(startColumn < endColumn) {
				for(i = endRow - 1; i >= startRow; --i)
					resultList.add(matrix[i][startColumn]);
				startColumn++;
			}
		}
		
		return resultList;
	}
}
public class SpiralMatrix {
	public static void main(String args[]) {
		int matrix[][] = {{1,2,3,4,5,6},
							  {7,8,9,10,11,12,},
							  {13,14,15,16,17,18}};
		Matrix m = new Matrix();
		List<Integer> outputList = m.printSpiral(matrix);
		System.out.println(outputList.toString());
	}
}
