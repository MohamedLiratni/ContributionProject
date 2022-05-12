import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Patient_Admit extends Patient_Checkup {
	private double advancePayment;
    private String modeOfPayment;
    private int roomNumber;
    private String dateOfAdmission;
    private String initialCondition;
    private String attendantName;
    private boolean continueLoop=true;
    
    public Patient_Admit() {
    	super();
    	do {
    	try {
    		Scanner input = new Scanner(System.in);
    	
			System.out.println("Enter the advance payment=...");
			advancePayment=input.nextDouble();
			System.out.println("Enter the mode of payment=...");
			modeOfPayment=input.nextLine();
			System.out.println("Enter the room number=...");
			roomNumber=input.nextInt();
			System.out.println("Enter the date of admission=...");
			dateOfAdmission=input.nextLine();
			System.out.println("Enter the initial condition=...");
			initialCondition=input.nextLine();
			System.out.println("Enter the attendant Name=...");
			attendantName=input.nextLine();
			continueLoop=false;
    	}
    	catch(InputMismatchException InputMismatchException) {
    		System.out.println("Error in type!\nPlease try again.");
    	}}while(continueLoop);

    }
    public Patient_Admit(String firstName, String lastName, String address, int phoneNumber, int patientNumber,int age, char sex, String city, String entryDate, 
    String doctorName, String diagnosis,String departmentName,int patientId,int doctorNumber,String treatment,String status ,double advancePayment,
    String modeOfPayment,int roomNumber, String dateOfAdmission,String initialCondition, String attendantName, double AdvancePayment) {
    
		super(firstName, lastName, address, phoneNumber, patientNumber, age, sex, city, entryDate, doctorName, diagnosis,
				departmentName,patientId,doctorNumber,treatment,status);	
		this.advancePayment=advancePayment;
		this.modeOfPayment=modeOfPayment;
		this.roomNumber=roomNumber;
        this.dateOfAdmission=dateOfAdmission;
        this.initialCondition=initialCondition;
        this.attendantName=attendantName;   
    }
    public double getAdvancePayment() {
    	return this.advancePayment;
    }     
    public void setAdvancePayment(double advancePayment) {
    	this.advancePayment=advancePayment;
    }
    public String getModeOfPayment() {
    	return modeOfPayment;
    }
    public void setModeOfPayment(String modeOfPayment) {
    	this.modeOfPayment = modeOfPayment;
    }
    public int getRoomNumber() {
		return roomNumber;
	}
    public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
    public String getDateOfAdmission() {
		return dateOfAdmission;
	}
    public void setDateOfAdmission(String dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
    public String getInitialCondition() {
		return initialCondition;
	}
    public void setInitialCondition(String initialCondition) {
		this.initialCondition = initialCondition;
	}
    public String getAttendantName() {
    	return attendantName;
    }
    public void setAttendantName(String attendantName) {
    	this.attendantName = attendantName;
    }
    @Override
    public String toString() {
    	return super.toString()+"  \t" + advancePayment + "\t\t\t" + modeOfPayment + "\t\t"+ roomNumber + "\t\t" + dateOfAdmission + "\t\t" + initialCondition + " \t\t\t" + attendantName+"\t\t\t"+advancePayment ;
    }
}
