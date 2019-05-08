package mediumhackerrank;

import java.util.Scanner;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

// Question : https://www.hackerrank.com/challenges/java-comparator/problem
class Player{
	String name;
	int score;
	Player(String name, int score){
		this.name = name;
		this.score = score;
	}
}

class Checker implements Comparator<Player>{
	public int compare(Player first, Player second) {
		if(first.score == second.score)
			return first.name.compareTo(second.name);
		else
			return (second.score - first.score);
			
	}
}

public class JavaComparator {
	public static void main (String args[]) {
		Checker checker = new Checker();
		LinkedList<Player> lPlayer = new LinkedList<Player>();
		lPlayer.add(new Player("amy", 100));
		lPlayer.add(new Player("david", 100));
		lPlayer.add(new Player("heraldo", 50));
		lPlayer.add(new Player("aakaansha", 70));
		lPlayer.add(new Player("alekha", 150));
		for(Player temp : lPlayer)
			System.out.println(temp.name +" "+ temp.score);
		Collections.sort(lPlayer, checker);
		System.out.println("After sort\n");
		for(Player temp : lPlayer)
			System.out.println(temp.name +" "+ temp.score);
		
	}
}
