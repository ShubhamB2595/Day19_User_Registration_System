package system.users;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class ValidUserName {
	
	// regex for the user Name with 1st char Upper and minimum 3 chars
	String regex = "^[A-Z]{1}[a-zA-Z0-9]{2,}";
	
	Scanner input = new Scanner(System.in);

	// validation of first name and checking with regex
	void validateFirstName() {
		
		System.out.println("Enter user's First Name");
		String firstName = input.nextLine();
		Pattern pattern = Pattern.compile(regex);
		
		Predicate<String> match = pattern.asPredicate();
		boolean result = match.test(firstName);
		
		if(result) {
			System.out.println(firstName + " is Valid first Name");
		}
		else {
			System.out.println(firstName + " is Invalid first Name");
		}
	}
	
	// validation of last name and checking with regex
	void validateLastName() {
		
		System.out.println("Enter user's Last Name");
		String lastName = input.nextLine();
		Pattern pattern = Pattern.compile(regex);
		
		Predicate<String> match = pattern.asPredicate();
		boolean result = match.test(lastName);
		
		if(result) {
			System.out.println(lastName + " is Valid last Name");
		}
		else {
			System.out.println(lastName + " is Invalid last Name");
		}
	}
	
	// Constructor
	public ValidUserName() {

	}
	
	
}
