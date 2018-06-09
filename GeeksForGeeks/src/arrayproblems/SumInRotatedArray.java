package arrayproblems;
// Question Link : https://www.geeksforgeeks.org/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/
public class SumInRotatedArray {
	int[] sumInRotatedArray(int[] array, int sum) {
		int[] pairs = {0,0};
		int min = 0, max = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > array[i+1]) {
				max = i;
				min = i + 1;
				break;
			}
			max = i;
			min = i + 1;
		}
		System.out.println(max+" "+min);
		while(max >=0 && min <= array.length) {
		if(array[max] + array[min] == sum) {
			pairs[0] = max;
			pairs[1] = min;
			return pairs;
 		}
		else if(array[max] + array[min] > sum)
			max--;
		else 
			min++;
		}	
		pairs[0] = -1;
		pairs[1] = -1;
		return pairs;
	}
	
	public static void main(String args[]) {
		int[] array = {11, 15, 26, 38, 9, 10};
		SumInRotatedArray sumEvaluation = new SumInRotatedArray();
		int sumValue = 35;
		int[] b = sumEvaluation.sumInRotatedArray(array, sumValue);
		if(b[0] == -1 && b[1] == -1)
			System.out.println("The sum pair is not found");
		else
			System.out.println("The pair of the sum "+sumValue+" is ("+array[b[0]]+","+array[b[1]]+")");
	}

}
