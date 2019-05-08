package coding;
/* 
 * Question : to check if the given word or sentence has all alphabets in it, 
 * question from internetbrands
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Panagram {
	public static void main(String args[]) {
		Panagram p = new Panagram();
		List<String> inputList = new ArrayList<String>();
		inputList.add("qwertyuiopasdfghjklzxcvbnm");
		inputList.add("poiuytrewwqmnbvcxzlkjhgfdsa");
		inputList.add("qwertyuiop");
		System.out.println(p.isPanagram(inputList));
	}

	private String isPanagram(List<String> strings) {
		StringBuilder returnValue = new StringBuilder();
		for (String test : strings) {
			Set<Character> charSet = new HashSet<Character>();
			for (char charValue : test.toCharArray()) {
				if(charValue != ' ')
					charSet.add(charValue);
			}
			
			if(charSet.size() == 26)
				returnValue.append("1");
			else
				returnValue.append("0");
		}
		return returnValue.toString();
	}
}
