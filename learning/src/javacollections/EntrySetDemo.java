package javacollections;
import java.util.HashMap;
import java.util.Map;
public class EntrySetDemo {
	public static void main(String args[]) {
		int arr[] = {17, 2, 1, 15, 30}; 
		Map<Integer, Integer> m = new HashMap<>(); 
		for (int i = 0; i < arr.length; i++)  
        { 
            if (m.containsKey(arr[i]))  
            { 
                m.put(arr[i], m.get(arr[i]) + 1); 
            }  
            else 
            { 
                m.put(arr[i], m.get(arr[i])); 
            } 
        } 
		System.out.println(m);
	}
}
