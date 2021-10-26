package system.users;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class ValidPassword {

	// regex for password with minimum 8 Characters
	String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}";
				
	Scanner input = new Scanner(System.in);

	//validation of password with regex
	void validatePass() {
					
		System.out.println("Enter user's Password");
		String pass = input.nextLine();
		Pattern pattern = Pattern.compile(regex);
					
		Predicate<String> match = pattern.asPredicate();
		boolean result = match.test(pass);

		if(result) {
			System.out.println(pass + " is Valid password");
		}
		else {
			System.out.println(pass + " is Invalid password");
		}
	}
		public ValidPassword() {
			
		}
}
