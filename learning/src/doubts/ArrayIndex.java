package doubts;

public class ArrayIndex {
public static void main(String args[]) {
	int[] a = new int[122];
	a['A'] = 11;
	a['b'] = 100;
	System.out.println((int)'A');
	System.out.println(((int)'Z' + 3) - 65);
	System.out.println((int)'a');
	System.out.println((int)'z');
	System.out.println(a['A']);
}
}
