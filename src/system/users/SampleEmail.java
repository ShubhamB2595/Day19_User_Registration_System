package system.users;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class SampleEmail {
	
	List<String> emails = new ArrayList<String>();

	void validateEmail() {
		
		// Valid emails
		emails.add("abc@yahoo.com");
		emails.add("abc-100@yahoo.com");
		emails.add("abc.100@yahoo.com");
		emails.add("abc111@abc.com");
		emails.add("abc-100@abc.net");
		emails.add("abc.100@abc.com.au");
		emails.add("abc@1.com");
		emails.add("abc@gmail.com.com");
		emails.add("abc+100@gmail.com");
	 
		//	Invalid emails
		emails.add("abc");
		emails.add("abc@.com.my");
		emails.add("abc123@gmail.a");
		emails.add("abc123@.com");
		emails.add("abc123@.com.com");
		emails.add(".abc@abc.com");
		emails.add("abc()*@gmail.com");
		emails.add("abc@%*.com");
		emails.add("abc..2002@gmail.com"); 
		emails.add("abc.@gmail.com");
		emails.add("abc@abc@gmail.com");
		emails.add("abc@gmail.com.1a");
		emails.add("abc@gmail.com.aa.au");
		 
		String regex = "^[a-zA-Z0-9_+.-]+(?:\\.[a-zA-Z0-9_+.-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	 
		Pattern pattern = Pattern.compile(regex);
		
		int length = emails.size();
		for(int i=0; i<length; i++) {
			Predicate<String> match = pattern.asPredicate();
			boolean result = match.test(emails.get(i));
	 
	    	System.out.println(emails.get(i) + " : " + result);
		}
	}
	
	public SampleEmail() {
		
	}

}
