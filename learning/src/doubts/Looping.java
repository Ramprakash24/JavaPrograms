package doubts;

import java.util.Scanner;

public class Looping {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number:");
	for(int i = 0; i < 10; i++) {
		if(i == 5)
			continue;
		else
			System.out.println(i);
	}
	sc.close();
}
}
