package coding;

import java.util.Scanner;

public class SubMatrixPrime {
public static boolean isPrime(int number) {
	if(number < 2)
		return false;
	for(int i = 2; i < Math.sqrt(number);i++)
		if(number%i == 0)
			return false;
	return true;
}
public static boolean scanMatrix(boolean a[][], int i_start, int j_start, int n) {
	for(int i = i_start; i < i_start + n; i++)
		for(int j = j_start; j < j_start + n; j++)
			if(!a[i][j])
				return false;
	return true;
}
public static int countValid(boolean a[][], int n, int N) {
	int res = 0;
	for(int i_start = 0; i_start <= N - n; i_start++) 
		for(int j_start = 0; j_start <= N - n; j_start++)
			if(scanMatrix(a,i_start,j_start,n))
				res += 1;
	return res;
}
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int result = 0;
	boolean a[][] = new boolean[N][N];
	for(int i = 0; i < N; i++) {
		for(int j = 0; j < N; j++){
			int num = sc.nextInt();
			a[i][j] = isPrime(num);
			if(a[i][j])
				result += 1;
		}
	}
	int n = 2;
	while(n < N) {
		result += countValid(a,n,N);
		n++;
	}
	System.out.println(result);
	sc.close();
}
}
