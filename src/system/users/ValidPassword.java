package system.users;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class ValidPassword {

	// regex for mobile number Country code follow by space and 10 digit number

		String regex = "^[0-9]{1,2}[' '][0-9]{10}";
		
		Scanner input = new Scanner(System.in);

		// validation of mobile number and checking with regex
		void validateMobile() {
			
			System.out.println("Enter user's Mobile Number");
			String numMobile = input.nextLine();
			Pattern pattern = Pattern.compile(regex);
			
			Predicate<String> match = pattern.asPredicate();
			boolean result = match.test(numMobile);
			
			if(result) {
				System.out.println(numMobile + " is Valid mobile number");
			}
			else {
				System.out.println(numMobile + " is Invalid mobile number");
			}
		}
		
		public ValidPassword() {
			
		}
}
