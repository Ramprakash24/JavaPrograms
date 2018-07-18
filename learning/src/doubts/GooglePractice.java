package doubts;

public class GooglePractice {
	
	public static String Solution(String s, int k) {
		int n = s.length();
		int count = 0;
		String temp ="";
		String outPut ="";
		for(int i = n-1; i >= 0; i--) {
			if(count != k && s.charAt(i) != '-') {
				temp = s.charAt(i) + temp;
				count++;
			}
			if(count == k) {
				outPut = (i == 0) ? temp + outPut : "-" + temp +outPut;
				temp="";
				count = 0;
			}
		}
		if(count < k)
			outPut = temp + outPut;
		return outPut.toUpperCase();
	}
	
	public static void main(String args[]) {
	String a = "asd7-093244-ew2";
	String b = Solution(a,5);
	System.out.println(b);
}
}
