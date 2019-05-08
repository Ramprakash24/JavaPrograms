package doubts;

public class NPrimeNumbers {
	public static void main(String args[]) {
		boolean flag = true;
		for(int i = 2; i<=10; i++) {
			flag = isPrimeNumber(i);
			if(flag)
				System.out.println(i);
		}
			
		
	}

	public static boolean isPrimeNumber(int num) {
		boolean flag1 = true;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				flag1 = false;
				break;
			}
		}
		return flag1;
	}
}
