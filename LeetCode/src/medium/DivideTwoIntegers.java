package medium;
// Question : https://leetcode.com/problems/divide-two-integers/
public class DivideTwoIntegers {
	public static void main(String args[]) {
		DivideTwoIntegers d = new DivideTwoIntegers();
		//d.divideFn(7,-3);
		//System.out.println(d.divideFn(-1,1));
		System.out.println(d.divideAdvFn(7,-3));
		//int a = Integer.MIN_VALUE / -1;
		//System.out.println(a);
	}

	private int divideAdvFn(int dividend, int divisor) {
		
		if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE; // deal with edge case I couldn't understand the reason why Integer.MIN_VALUE / -1 returns Integer.MIN_VALUE
        boolean flag = dividend >= 0 && divisor > 0 || dividend < 0 && divisor < 0;
        int count = 0;
        int x = Math.abs(dividend);
        int y = Math.abs(divisor);
        while (x >= y) {
            x -= y;
            count++;
        }
        return flag ? count : -count;
	}

	private int divideFn(int dividend, int divisor) {
		int count = 0;
		int tempDividend = dividend;
		if(divisor != 0) {
			while(Math.abs(dividend) >= Math.abs(divisor)) {
				dividend = Math.abs(dividend) - Math.abs(divisor);
				count++;
			}
		}
		if((tempDividend < 0 && divisor > 0) || (tempDividend > 0 && divisor < 0 ))
			return -count;
		return count;
	}
	
	
}
