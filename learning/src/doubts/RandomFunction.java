package doubts;
import java.util.Random;
public class RandomFunction{
	public static void main(String args[]) {
		Random rd = null;
		for(int i = 0; i < 10; i++)
			System.out.println(rd.ints(0, 10).distinct());
	}
}
