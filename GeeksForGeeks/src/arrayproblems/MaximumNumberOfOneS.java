package arrayproblems;
// Question : https://www.geeksforgeeks.org/find-the-row-with-maximum-number-1s/
public class MaximumNumberOfOneS {
public static void main(String args[]) {
	int matrix[][] = {
						{ 0, 0, 0, 1 },
						{ 0, 1, 1, 1 },
						{ 1, 1, 1, 1 },
						{ 0, 0, 0, 0 }
	};
	int a = rowWithMax1s(matrix);
	for(int j = 0; j < matrix[a].length; j++)
		System.out.print(matrix[a][j]);
	System.out.println();
}

static int first(int arr[], int low, int high) 
{ 
    if (high >= low) { 
        // Get the middle index 
        int mid = low + (high - low) / 2; 

        // Check if the element at middle index is first 1 
        if ((mid == 0 || (arr[mid - 1] == 0)) && arr[mid] == 1) 
            return mid; 

        // If the element is 0, recur for right side 
        else if (arr[mid] == 0) 
            return first(arr, (mid + 1), high); 
              
        // If element is not first 1, recur for left side 
        else 
            return first(arr, low, (mid - 1)); 
    } 
    return -1; 
} 

static int rowWithMax1s(int mat[][]) 
{ 
    // Initialize max values 
    int max_row_index = 0, max = -1;  

    // Traverse for each row and count number of  
    // 1s by finding the index of first 1 
    int i, index; 
    for (i = 0; i < mat.length; i++) { 
        index = first(mat[i], 0, mat[0].length - 1); 
        if (index != -1 && mat[0].length - index > max) { 
            max = mat[0].length - index; 
            max_row_index = i; 
        } 
    } 

    return max_row_index; 
} }
