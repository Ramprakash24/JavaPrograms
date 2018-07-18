package stringProblems;
import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumber {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	BigInteger b = new BigInteger(sc.nextLine());
	if(b.isProbablePrime(1))
		System.out.println("It is prime");
	else
		System.out.println("It is not a prime");
	sc.close();
}
}
