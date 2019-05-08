package mediumhackerrank;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

// Question : https://www.hackerrank.com/challenges/java-dequeue/problem
public class JavaDequeue {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> deck = new ArrayDeque<Integer>();
		HashMap<Integer, Integer> hash= new HashMap<Integer,Integer>();
		int counter = 0;
		int arrNum[] = new int[]{5,3,5,2,3,2};
		for(int i = 0; i < 6; i++) {
			int num = arrNum[i];
			if(i < 3) {
				deck.addLast(num);
				if(hash.get(num) != null)
					hash.put(num, hash.get(num)+1);
				else
					hash.put(num, 1);
			}
			else {
				if(counter < hash.size())
					counter = hash.size();
				int first = deck.removeFirst();
				deck.addLast(num);
				
				if(hash.containsKey(first)) {
					if(hash.get(first) > 1)
						hash.put(first, hash.get(first) - 1);
					else
						hash.remove(first);
				}
				if(hash.containsKey(num))
					hash.put(num, hash.get(num) + 1);
				else
					hash.put(num, 1);
			}
		}
		
		if(counter < hash.size())
			counter = hash.size();
		sc.close();
		System.out.println(counter);
	}
}
