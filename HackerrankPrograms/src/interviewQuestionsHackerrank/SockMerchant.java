package interviewQuestionsHackerrank;
// Question :  https://www.hackerrank.com/challenges/sock-merchant/problem
import java.util.HashSet;
import java.util.Set;

public class SockMerchant {
	public static void main(String args[]) {
		int[] sockArray = {10,20,20,10,10,30,50,10,20};
		SockMerchant sm = new SockMerchant();
		System.out.println(sm.sockMerchanFn(sockArray));
	}

	private int sockMerchanFn(int[] sockArray) {
		Set<Integer> colours = new HashSet<Integer>();
		int pairs = 0;
		for(int i = 0; i < sockArray.length; i++) {
			if(!colours.contains(sockArray[i]))
				colours.add(sockArray[i]);
			else {
				pairs++;
				colours.remove(sockArray[i]);
			}
		}
		return pairs;
	}
}
