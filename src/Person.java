import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public abstract class  Person {
	
	private  String firstName ;
	private String lastName ;
	private String address ;
	private int phoneNumber ;
	private boolean continueLoop=true;
		

	public Person() {
		   do {
		   try {
			Scanner input = new Scanner(System.in) ;
			System.out.println("Enter First Name= ...");
			firstName=input.nextLine();
			System.out.println("Enter Last Name= ...");
			lastName=input.nextLine();
			System.out.println("Enter Address= ...");
			address=input.nextLine();
			System.out.println("Enter Phone Number= ...");
			phoneNumber=input.nextInt();
			continueLoop=false;
		}
			catch(InputMismatchException InputMismatchException) {
				System.out.println("Error in type!! \nPlease try again.");
			}}while(continueLoop);
		}
	
	
	public Person (String firstName , String lastName , String address , int phoneNumber) {
		this.firstName = firstName ;
		this.lastName = lastName ;
		this.address = address ;
		this.phoneNumber = phoneNumber ;
	}
	
	public String getFirstName () {
		return this.firstName ;
	}
	
	public void setFirstName (String firstName ) {
		this.firstName = firstName ;
	}
	
	public String getLastName () {
		return this.lastName ;
	}
	
	public void setLastName (String lastName) {
		this.lastName = lastName ;
		
	}
	
	public String getAddress () {
		return this.address ;
	}
	
	public void setAddress (String address) {
		this.address = address ;
	}
	
	public int getPhoneNumber () {
		return this.phoneNumber ;
	}
	
	public void setPhoneNumber (int phoneNumber) {
		this.phoneNumber = phoneNumber ;
	}
	
	public String toString () {
		return  (firstName  + "       \t" + lastName  + "       \t" + address +  "        \t" + phoneNumber);
	}
}
 

