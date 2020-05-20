package medium;
// https://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/

class Search2D{

	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix.length == 0 || matrix[0].length==0)
			return false;
		int i = 0, j = matrix[0].length - 1;
		while(i < matrix.length && j >= 0) {
			if(matrix[i][j] == target)
				return true;
			if(matrix[i][j] < target)
				i++;
			else
				j--;
		}
		return false;
	}
}

public class Search2DMatrix {
	public static void main(String args[]) {
		Search2D s2d = new Search2D();
		int[][] matrix = {{1,   3,  5,  7},
				{10, 11, 16, 20},
				{23, 30, 34, 50}};
		int target = 31;
		if(s2d.searchMatrix(matrix,target))
			System.out.println("Element Present");
		else
			System.out.println("Element Not Present");
	}
}
