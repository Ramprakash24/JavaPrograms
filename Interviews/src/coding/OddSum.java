package coding;

import java.util.ArrayList;

public class OddSum {
	public static void main(String args[]) {
		OddSum os = new OddSum();
		ArrayList<Integer> inputValue = new ArrayList<>();
		inputValue.add(4);
		inputValue.add(5);
		//inputValue.add(3);
		os.calculateOddSum(inputValue);	
	}

	private void calculateOddSum(ArrayList<Integer> inputArray) {
		for(int num : inputArray) {
			System.out.println("number is : "+num);
			if(num % 2 == 0)
				num = num / 2;
			else
				num = (num / 2) + 1;
			System.out.println(num * num);
		}
	}
}
