package stringProblems;

import java.util.Scanner;

//Question Link : https://www.hackerrank.com/challenges/duplicate-word/problem
public class JavaRegexDuplicateWords {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int numberOfLines = Integer.parseInt(sc.nextLine());
	String[] finalOutput = new String[numberOfLines];
	String[] finalInput = new String[numberOfLines];
	for(int i = 0; i < numberOfLines; i++)
		finalInput[i] = sc.nextLine();
	for(int n = 0; n < numberOfLines;n++) {
		String output = "";
		String[] arrayInput = finalInput[n].split(" ");
		int length = arrayInput.length;
		for(int i = 0; i < length; i++) {
			if(!arrayInput[i].isEmpty()) {
				for(int j = i + 1; j < length; j++)
					if(arrayInput[i].equalsIgnoreCase(arrayInput[j]) && !arrayInput[j].isEmpty())
						arrayInput[j] = "";
			}
			
		}
		for(int i = 0; i < length; i++)
			if(!arrayInput[i].isEmpty())
				output += arrayInput[i] + " ";
		finalOutput[n] = output;
	}
	for(int i = 0; i < numberOfLines; i++)
		System.out.println(finalOutput[i]);
	sc.close();
}
}
