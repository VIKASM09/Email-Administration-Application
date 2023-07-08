package EmailApp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String Password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultpasswordlength = 10;
	private String alternateEmail;
	private String CompanySuffix = "Jimcorbett.com" ;
	
	public Email( String firstname, String lastname)
	{
		this.firstname = firstname;
		this.lastname = lastname;
	//	System.out.println(" Email Created : " + this.firstname +" " + this.lastname);
		
		this.department = setdepartment();
		System.out.println("Department :" + this.department);
		
		this.Password = randomPassword(defaultpasswordlength);
		System.out.println("Your password is: "+ this.Password);
		
		email = firstname.toLowerCase() + "." + lastname.toLowerCase()+"@"+department+ "." + CompanySuffix;	
	         System.out.println( "Your Email ID is: " + email );	
	}
	private String setdepartment()
	{
		System.out.println("New Worker: " + firstname + "\nDEPARTMENT CODES\n1 for sales\n2 for development\n3 for Accounting\n0 for None\n Enter Department Code:");
		Scanner sc= new Scanner(System.in);
		int deptchoice = sc.nextInt();
		if(deptchoice == 1 ) { return "sales";}
		else if (deptchoice == 2 ){ return "development";}
		else if (deptchoice == 3 ) { return " Accounting ";}
		else {return" ";} 
	}
	// Generate a Random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&";
		char[] password = new char [length];
		for(int i=0; i<length; i++) {
			int rand = (int) (Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			
		}
		return new String(password);
	}
	
	// set the mail box capacity
	public void setmailboxCapacity( int Capacity){
		this.mailboxCapacity = Capacity;
     }
	
	// set the alternate email
	public void setalernateEmail( String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// change the PasssWord
	public void changePassword (String Password) {
		this.Password = Password;
	}
	public int getmailboxcapacity() { return mailboxCapacity;}
	public String getalternateEmail() { return alternateEmail;}
	public String getPassword() { return Password; }
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstname + " " + lastname +
				"\nCOMPANY EMAIL: " + email +
				"\nmailbox capacity: " + mailboxCapacity + "nb";
		
	}
}