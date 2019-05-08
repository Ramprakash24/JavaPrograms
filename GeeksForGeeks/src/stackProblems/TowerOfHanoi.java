package stackProblems;
// Question : https://www.geeksforgeeks.org/c-program-for-tower-of-hanoi/ 
public class TowerOfHanoi {
	public static void main (String args[]) {
		towerOfHanoi(4,'A','C','B');
	}

	private static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
		if(n == 1) {
			System.out.println("Move Disk 1 from rod "+ fromRod +" to rod "+ toRod);
			return;
		}
		towerOfHanoi(n-1, fromRod, auxRod, toRod);
		System.out.println("Move Disk " + n + " from rod " + fromRod + " to rod " + toRod);
		towerOfHanoi(n-1, auxRod, toRod, fromRod);
	}
}
