package system.users;

public class UserRegistrationSystem {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to User Registration Program");
	/*	ValidUserName validate = new ValidUserName();
		validate.validateFirstName();
		validate.validateLastName();
	*/	
		ValidEmailID email = new ValidEmailID();
		email.validateEmail();
		
	}

}
