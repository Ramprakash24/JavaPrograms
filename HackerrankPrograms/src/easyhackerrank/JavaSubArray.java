package easyhackerrank;

import java.util.Scanner;

public class JavaSubArray {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	//int n = sc.nextInt();
	
	int inputArray[] = {1,-100};
	int len = inputArray.length;
	int count = 0;
	for(int i = 0; i < len; i++) {
		int sum = 0;
		for(int j = i; j < len; j++) {
			sum += inputArray[j];
			if(sum < 0)
				count++;
		}
	}
	System.out.println(count);
	sc.close();
}
}
