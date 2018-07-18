package stringProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidation {
private Pattern pattern;
private Matcher matcher;
//public static final String username = "^[a-zA-Z][a-zA-Z0-9_-] {8,15}$";
public static final String username = "^[a-z]|[A-Z][a-zA-Z0-9_-]$";
public UsernameValidation() {
	pattern = Pattern.compile(username);
}
public boolean validate(final String userNameInput){
	 
	  matcher = pattern.matcher(userNameInput);
	  return matcher.matches();

}
public static void main(String args[]) {
	UsernameValidation validateUsername = new UsernameValidation();
	String input = "aS";
	if(validateUsername.validate(input))
		System.out.println("Valid");
	else
		System.out.println("Invalid");	
}
}
