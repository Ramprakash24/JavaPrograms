package mediumhackerrank;
// Question : https://www.hackerrank.com/challenges/java-1d-array/problem
public class ArrayGame {
public static void main(String args[]) {
	int[] inputArray = {0,0,0,0,0};
	System.out.println((canWin(3,inputArray,0)) ? "YES" : "NO");
	}

public static boolean canWin(int leap, int[] game, int i) {
	if(i < 0 || game[i] == 1)
		return false;
	else if(i + 1 >= game.length || i + leap >= game.length)
		return true;
	game[i] = 1;
	return canWin(leap,game,i + leap) || canWin(leap, game, i + 1) || canWin(leap,game, i - 1);
}
}
