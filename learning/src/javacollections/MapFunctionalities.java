package javacollections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
public class MapFunctionalities {
	public static void main(String args[]) {
		Map<Integer,Integer> countMap = new LinkedHashMap<>();
		countMap.put(8, 3);
		countMap.put(2, 2);
		countMap.put(5, 1);
		countMap.put(10, 5);
		
		countMap.forEach(action);
	}
}
