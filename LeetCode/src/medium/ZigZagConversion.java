package medium;

import java.util.Arrays;

//Question : https://leetcode.com/problems/zigzag-conversion/
class ZigZag{

	public String convert(String str, int n) {
		if(n == 1)
			return str;
		
		char[] strArray = str.toCharArray();
		int len = str.length();
		String[] tempArray = new String[n];
		Arrays.fill(tempArray, "");
		boolean down = true;
		int row = 0;
		String outValue = "";
		
		for(int i = 0; i < len; ++i) {
			tempArray[row] += (strArray[i]);
			if(row == n - 1)
				down = false;
			else if(row == 0)
				down = true;
			
			if(down)
				row++;
			else
				row --;
		}
		
		for(int i = 0; i < n ; ++i)
			outValue += tempArray[i];
		return outValue;
	}
	
}
public class ZigZagConversion {
	public static void main(String args[]) {
		ZigZag z = new ZigZag();
		String input = "PAYPALISHIRING";
		
		String output = z.convert(input,4);
		System.out.println("Input : "+input);
		System.out.println("Output: "+output);
	}
}
