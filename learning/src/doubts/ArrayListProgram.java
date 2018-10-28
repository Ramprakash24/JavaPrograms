package doubts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListProgram {
public static void main(String args[]) {
	String a[] = new String[]{"abc","klm","xyz","pqr"};
	String b[] = new String[] {"123","456"};
	List<List<String>> finalList = new ArrayList<>();
	List<String> list1 = Arrays.asList(a);
	List<String> list2 = Arrays.asList(b);
	System.out.println("The list1 is:" + list1);
	System.out.println("The list2 is:" + list2);
	finalList.add(list1);
	finalList.add(list2);
	System.out.println("The finalList is " + finalList.get(0));
	}
}
