package doubts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringBuilderExample {
	private boolean isPrime(int n) {
		if(n <= 1) return false;
		if(n <= 3) return true;
		
		if(n % 2 == 0 || n % 3 == 0) return false;
		
		for(int i = 5; i * i <= n; i = i + 6)
			System.out.println(n % i);
			//if(n % i == 0 || n % (i + 2) == 0)
				//return false;
		return true;
	}
	public static void main(String args[]) {
		StringBuilderExample s = new StringBuilderExample();
		
		/*
		StringBuilder sb = new StringBuilder(Integer.toString(1310));
		if(sb.toString().equals(sb.reverse().toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		*/
		String a = "RAMAR";
		String b = "RAMAR";
		//To understand the difference between == and .equals() method
		// https://www.geeksforgeeks.org/difference-equals-method-java/
		//if(a.equals(b))
			//System.out.println("Same");
		//else
			//System.out.println("Not Same");
		/*
		int n = 0;
		while(true) {
			if(n < 10)
				System.out.println(n++);
			else
				return;
		}
		*/
		System.out.println(s.isPrime(121));
		Object o = "String";
		String c = "String";
		//if(o == c)
			//System.out.println(o);
		
		System.out.println((double)2/3);
		System.out.println("0.".length());
		
		String aa = "0.6";
		System.out.println(aa.substring(0,3));
		
		String aVariable = "VRAM";
		String bVariable = "VIJAY";
		
		System.out.println(aVariable.compareTo(bVariable));
		if(aVariable.compareTo(bVariable) > 0)
			System.out.println(aVariable);
		else
			System.out.println(bVariable);
		
	}
}
