package doubts;

public class Dna {
public static void main(String args[]) {
	String userInput = "GACTTTTTTTTTTTTTCCTTTGGGAAAGGTAGGGAGGTGTTCGTACGGGAGCAGCCTCGG";
	System.out.println(userInput);
	int[] alphabetArray = new int[26];
	for(int i = 0; i < userInput.length(); i++) {
		int ch = userInput.charAt(i);
		int val = (int) ch;
		if (val >= 97 && val <= 122){
	         alphabetArray[val-97]++;
	}
	for(int j = 0; j < alphabetArray.length; j++) {
		if(alphabetArray[j]>0){
	        char cha = (char) (i+97);
	        System.out.println(cha +"  : "+alphabetArray[i]);   //Show the result.
  }
}
}
}
}
