package system.users;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class ValidEmailID {

	// regex for validation of email id 
	String regex = "^[a-zA-Z0-9_+.-]+@[a-zA-Z0-9.-]+$";
	
	Scanner input = new Scanner(System.in);
	
	// validation of email id and checking with regex
	void validateEmail() {
			
		System.out.println("Enter user's Email ID");
		String email = input.nextLine();
		Pattern pattern = Pattern.compile(regex);
			
		Predicate<String> match = pattern.asPredicate();
		boolean result = match.test(email);
			
		if(result) {
			System.out.println(email + " is Valid Email ID");
		}
		else {
			System.out.println(email + " is Invalid Email ID");
		}
	}
	
	// Constructor
	public ValidEmailID() {
		
	}
	
}
