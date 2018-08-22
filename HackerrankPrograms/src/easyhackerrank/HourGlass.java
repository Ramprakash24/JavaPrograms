package easyhackerrank;

import java.util.Random;

public class HourGlass {
public static void main(String args[]) {
	int[][] inputArray = {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,9,2,-4,-4,0},{0,0,0,-2,0,0},{0,0,-1,-2,-4,0}};
	int[][] resultArray = new int[3][3];
	int i,j,sum = 0, maxSum = Integer.MIN_VALUE;
	/*
	Random rand = new Random();
	for(i = 0; i < 6; i++)
		for(j = 0; j < 6; j++)
			inputArray[i][j] = rand.nextInt(9+9) - 9;
	*/
	i = 1;
	while(i - 1 >= 0 &&  i + 1 < 6) {
		j=1;
		while(j - 1 >=0 && j + 1 < 6){
	sum = inputArray[i - 1][j - 1] +
			inputArray[i - 1][j] +
			inputArray[i - 1][j + 1] +
			inputArray[i][j] +
			inputArray[i + 1][j - 1] +
			inputArray[i + 1][j] +
			inputArray[i + 1][j + 1];
	if(sum > maxSum) {
		maxSum = sum;
		resultArray[0][0] = inputArray[i - 1][j - 1];
		resultArray[0][1] = inputArray[i - 1][j];
		resultArray[0][2] = inputArray[i - 1][j + 1];
		resultArray[1][0] = 0;
		resultArray[1][1] = inputArray[i][j];
		resultArray[1][2] = 0;
		resultArray[2][0] = inputArray[i + 1][j - 1];
		resultArray[2][1] = inputArray[i + 1][j];
		resultArray[2][2] = inputArray[i + 1][j + 1];
	}
	j++;
	}
	i++;
	}
	System.out.println("The Input Array is:");
	for(i = 0; i < 6; i++) {
		for(j = 0; j < 6; j++)
			System.out.print(inputArray[i][j]+"\t");
		System.out.println();
	}
	
	System.out.println("The array with maxSum "+maxSum+" is:");
	for(i = 0; i < 3; i++) {
		for(j = 0; j < 3; j++) 
			System.out.print(resultArray[i][j]+"\t");
		System.out.println();
		}
}
}
