package doubts;

public class CompareClass {
	public static void main(String args[]) {
		String a = "VRAM";
		String b = "VIJAY";
		if(a.compareTo(b) < 0)
			System.out.println(a+" is before "+b+":"+a.compareTo(b));
		else
			System.out.println(b+" is before "+a+":"+a.compareTo(b));
		
		System.out.println("R:"+(int)'R');
		System.out.println("I:"+(int)'I');
	}
}
