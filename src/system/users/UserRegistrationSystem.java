package system.users;

public class UserRegistrationSystem {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to User Registration Program");
	/*	ValidUserName validate = new ValidUserName();
		validate.validateFirstName();
		validate.validateLastName();
		
		ValidEmailID email = new ValidEmailID();
		email.validateEmail();
	
		ValidMobile mobile = new ValidMobile();
		mobile.validateMobile();
	
		ValidPassword pass = new ValidPassword();
		pass.validatePass();
	*/
		SampleEmail emails = new SampleEmail();
		emails.validateEmail();
		
	}

}
