package emailApp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int defaultPasswordLength = 10;
	private int mailboxCapacity;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	private String email;
	
	// constructor to receive the first name and last name
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("email created: " + this.firstName + " " + this.lastName );
		
		//call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("your password length is: "+this.password);
		
		//combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("your email is: " + email);
	}
	
	// ask for the department
	private String setDepartment(){
		System.out.println("enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter Department Code: ");
		
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1 ){
			return "sales";
		}
		else if(depChoice == 2){
			//System.out.println("dev");
			return "dev";
			
		}
		else if(depChoice == 3){
			return "acct";
		}
		else{
			return " ";
		}
		
	}
	
	
	// generate random password
	private String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOPQUARE";
		char[] password = new char[length];
		for(int i = 0; i<length; i++){
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand); 
			
		}
		
		return new  String (password);
	}
	
	
	// set the mailbox capacity
	public void setMailBoxCapacity(int capacity){
		this.mailboxCapacity = capacity;
		
	}
	
	// set the alternate email
	
	public void setAlternateEmail(String altEmail){
		this.alternateEmail = altEmail;
		
	}
	
	
	//change the password
	public void changePassword(String password){
		this.password = password;
	}
	
	
	public int getMailboxCampacity (){
		return mailboxCapacity;
	}
	
	public String getAlternateEmail(){
		return alternateEmail;
	}

	private String alternateEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String showInfo(){
		//String maiBoxCapacity;
		return "display name: " + firstName + ""+ lastName + "company email: " + email + " mailbox capacity: "+ mailboxCapacity + "mb";
		
	}
	
}
