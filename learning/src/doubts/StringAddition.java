package doubts;

import java.util.Scanner;

public class StringAddition {
public static void main(String args[]) {
	String a,b,c = "";
	Scanner sc = new Scanner(System.in);
	a = sc.nextLine();
	b = sc.nextLine();
	String[] arrA = a.split(" ");
	String[] arrB = b.split(" ");
	for (String stringA : arrA) {
		for (String stringB : arrB) {
			c += stringA + stringB;
		}
	}
//	c = a + " " + b;
	System.out.println(c);
	sc.close();
}
}
