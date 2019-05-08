package medium;
// Question : https://leetcode.com/problems/prime-palindrome/
public class PrimePalindrome {
	public static void main(String args[]) {
		PrimePalindrome pp = new PrimePalindrome();
		System.out.println(pp.greaterPrimePalindrome(102));
	}

	private int greaterPrimePalindrome(int n) {
		while(true) {
			if(isPrime(n) && reverseOf(n))
				return n;
			n++;
		}
	}

	private boolean reverseOf(int n) {
		StringBuilder sb = new StringBuilder(Integer.toString(n));
		if(sb.toString().equals(sb.reverse().toString()))
			return true;
		return false;
	}

	private boolean isPrime(int n) {
		if(n <= 1) return false;
		if(n <= 3) return true;
		
		if(n % 2 == 0 || n % 3 == 0) return false;
		
		for(int i = 5; i * i <= n; i = i + 6)
			if(n % i == 0 || n % (i + 2) == 0)
				return false;
		return true;
	}	
	
}
