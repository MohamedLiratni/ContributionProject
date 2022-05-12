import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DoctorOnCall extends Doctor{

	private double feesPerCall ;
	private String paymentDue ;
	private boolean continueLoop=true;
	
	public DoctorOnCall() {
		super();
		do {
		try {
		    Scanner input = new Scanner(System.in);
			System.out.println("Enter the fees per call=...");
			feesPerCall=input.nextDouble();
			System.out.println("Enter the payment due=...");
			paymentDue=input.nextLine();
			continueLoop=false;
    	}
    	catch(InputMismatchException InputMismatchException) {
    		System.out.println("Error in type!\nPlease try again.");
    	}}while(continueLoop);


		
	}
	public DoctorOnCall(String firstName, String lastName, String address, int phoneNumber, String qualification,int doctorNumber, double feesPerCall, String paymentDue) {
		super(firstName, lastName, address, phoneNumber, qualification, doctorNumber);
		this.feesPerCall=feesPerCall;
		this.paymentDue=paymentDue;
	}
	public double getFeesPerCall () {
		return this.feesPerCall ;
	}
	
	public void setFeesPerCall (double feesPerCall) {
		this.feesPerCall = feesPerCall ;
	}
	
	public String getPaymentDue () {
		return this.paymentDue ;
		
	}
	
	public void setPayementDue (String paymentDue) {
		this.paymentDue = paymentDue ;
	}
	
	public String toString () {
		return  super.toString()+"\t\t" + feesPerCall +  "\t\t" + paymentDue  ;
		
	}
 
}
