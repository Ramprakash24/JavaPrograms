package doubts;

public class PlusOperator {
	public static void main(String args[]) {
		int c = 0;
		for(int i = 1 ;i <= 5; i++) {
			c += c + i;
			System.out.println("c: "+c+" i:"+i);
		}
		
		int d = 0;
		for(int i = 1 ;i <= 5; i++) {
			d = d + d + i;
			System.out.println("d: "+d+" i: "+i);
		}
		
		StringBuilder s = new StringBuilder("Hello Ram");
		System.out.println(s.length());
		s.append('P');
		System.out.println(s.toString());
		
		int[] a = {1,2,3,5,6,7,99,10};
		System.out.println(a.length);
	}
}
