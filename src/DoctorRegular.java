import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class DoctorRegular extends Doctor {
    private double salary;
    private String dateOfJoining;
    private boolean continueLoop=true;
    public DoctorRegular() {
    	super();
    	do {
    	 try {
    	    Scanner input = new Scanner(System.in);
			System.out.println("Enter the salary=...");
			 salary=input.nextDouble();
			 System.out.println("Enter the date of joining=...");
			 dateOfJoining=input.nextLine();
				continueLoop=false;
     	}
     	catch(InputMismatchException InputMismatchException) {
     		System.out.println("Error in type!\nPlease try again.");
     	}}while(continueLoop);
    }
	public DoctorRegular(String firstName, String lastName, String address, int phoneNumber, String qualification,int doctorNumber,double salary,String dateOfJoining) {
		super(firstName, lastName, address, phoneNumber, qualification, doctorNumber);
		this.dateOfJoining=dateOfJoining;
		this.salary=salary;}
	public void setSalary(double salary) {
	    this.salary=salary;}
	public double getSalary() {
	    return salary;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining=dateOfJoining;
	}
	@Override
	public String toString() {
	    return super.toString()+" \t" + salary + "\t\t" + dateOfJoining ;
	}
}
