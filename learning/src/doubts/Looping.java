package doubts;

import java.util.Scanner;

public class Looping {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number:");
	int n = Integer.parseInt(sc.nextLine());
	String[] a = new String[n];
	System.out.println("Enter values:");
	for(int i = 0; i < n ; i++)
		a[i] = sc.nextLine();
	System.out.println("Printing");
	for(int i = 0; i < n; i++)
		System.out.println(a[i]);
	sc.close();
}
}
