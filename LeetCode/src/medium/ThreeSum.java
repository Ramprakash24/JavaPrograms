package medium;
//Question : https://leetcode.com/problems/3sum/description/
public class ThreeSum {
public static int[][] threeSum(int array[]){
	int i = 0,j = 1 ,k = 2,l = 0,sum = 0, n = array.length;
	int[][] outPut = new int[n][3];
	while(i < n) {
		sum = array[i] + array[j] + array[k];
		if(sum == 0) {
			outPut[l][0] = array[i];
			outPut[l][1] = array[j];
			outPut[l][2] = array[k];
		}
		else {
			outPut[l][0] = Integer.MIN_VALUE;
			outPut[l][1] = Integer.MIN_VALUE;
			outPut[l][2] = Integer.MIN_VALUE;
		}
		i++;
		j = (i + 1) % n;
		k = (i + 2) % n;
		l++;
}
	return outPut;
}

public static void main(String args[]) {
	int input[] = {-1, 0, 1, 2, -1, -4};
	int out[][] = threeSum(input);
	for(int i = 0; i < input.length; i++) {
		for(int j = 0; j < 3; j++)
			if(out[i][j] != Integer.MIN_VALUE)
				System.out.print(out[i][j]+"\t");
		System.out.println();
	}
}
}
