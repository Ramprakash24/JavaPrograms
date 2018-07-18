package stringProblems;
// Question : https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/
class BiCycle{
	String define_me() {
		return "a vehicle with pedals";
	}
}

class Motorcycle extends BiCycle{
	String define_me() {
		return "a cycle with an engine";
	}
	
	public Motorcycle() {
		System.out.println("Hello I am motorcycle, I am "+ define_me());
		String temp = super.define_me();
		System.out.println("My ancestor is a cycle who is " +temp);
	}
}

public class SuperKeyword {
public static void main(String args[]) {
	Motorcycle m = new Motorcycle();
}
}
