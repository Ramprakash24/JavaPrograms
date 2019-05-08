package medium;

import java.util.HashMap;

// Question : https://leetcode.com/problems/fraction-to-recurring-decimal/
public class RecurringDecimal {
	public static void main(String args[]) {
		RecurringDecimal rd = new RecurringDecimal();
		System.out.println(rd.fractionalToDecimal(2,3));
	}

	private String fractionalToDecimal(int numerator, int denomenator) {
		if(numerator == 0 ) return "0";
		if(denomenator == 0) return "";
		String result = "";
		if((numerator < 0) ^ (denomenator < 0))
				result += "-";
		
		long num = numerator;
		long den = denomenator;
		num = Math.abs(numerator);
		den = Math.abs(denomenator);
		
		long res = num / den;
		result = String.valueOf(res);
		
		long remainder = (num % den) * 10;
		System.out.println(remainder);
		if(remainder == 0)
			return result;
		
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		result += ".";
		while(remainder != 0) {
			if(map.containsKey(remainder)) {
				int beginning = map.get(remainder);
				String part1 = result.substring(0, beginning);
				String part2 = result.substring(beginning,result.length());
				result = part1 + "(" + part2 + ")";
				return result;
			}
			map.put(remainder, result.length());
			res = remainder / den;
			result += String.valueOf(res);
			remainder = (remainder % den) * 10;
		}
		return "0";
	}
}
