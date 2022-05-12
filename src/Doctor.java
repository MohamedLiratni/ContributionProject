import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Doctor extends Person {
	  String qualification ;
	   int doctorNumber;
	   private boolean continueLoop=true;
	   
    public Doctor() {
    	super();
    	do {
    	try {
    	    Scanner input = new Scanner(System.in) ;
			System.out.print("Enter the doctor's qualification=...");
			qualification=input.nextLine();
			System.out.print("Enter the doctor number=...");
			doctorNumber=input.nextInt();
			continueLoop=false;
    	}
    	catch(InputMismatchException InputMismatchException) {
    		System.out.println("Error in type!\nPlease try again.");
    	}}while(continueLoop);

    	
    }
	    
	public Doctor(String firstName, String lastName, String address , int phoneNumber ,  String qualification, int doctorNumber) {
		super(firstName, lastName, address , phoneNumber);
		this.qualification=qualification;
		this.doctorNumber = doctorNumber ;
	}
    
	    public String getQualification () {
	    	return qualification ;
	    }
	    
	    public void setQualification (String qualification) {
	    	this.qualification = qualification ;
	    }
	    
	    public int getDoctorNumber () {
	    	return doctorNumber ;
	    }

	    public void setDoctorNumber (int doctorNumber) {
	    	this.doctorNumber = doctorNumber ;
	    }
	    public String toString() {
	    return super.toString()+"     \t\t"+doctorNumber+"  \t\t"+qualification;
	    }
	}


