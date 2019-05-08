package doubts;

class BaseClass{
	void printFunction() {
		System.out.println("Inside base class function");
	}
}
class SubClass extends BaseClass{
	void printFunction() {
		System.out.println("Inside sub class");
		//super.printFunction();
	}
	
}

public class InheritanceDoubt {
	public static void main(String args[]) {
		SubClass s = new SubClass();
		s.printFunction();
	}
}
