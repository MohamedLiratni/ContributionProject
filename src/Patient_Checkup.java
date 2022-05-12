import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Patient_Checkup extends PatientEntry {
    private int patientId;
    private int doctorNumber;
    private String treatment;
    private String status;
    private PatientEntry patient;
    private boolean continueLoop=true;
    
    public Patient_Checkup() {
    	super();
    	do {
    	try {
    		Scanner input = new Scanner(System.in);
    	
			System.out.println("Enter the patient's ID=...");
			patientId=input.nextInt();
			System.out.println("Enter the doctor number=...");
			doctorNumber=input.nextInt();
			System.out.println("Enter the treatment=...");
			treatment=input.nextLine();
			System.out.println("Enter the status=...");
			status=input.nextLine();
			continueLoop=false;
    	}
    	catch(InputMismatchException InputMismatchException) {
    		System.out.println("Error in type!\nPlease try again.");
    	}}while(continueLoop);
    }
	public Patient_Checkup(String firstName, String lastName, String address, int phoneNumber, int patientNumber,
			int age, char sex, String city, String entryDate, String doctorName, String diagnosis,
			String departmentName,int patientId,int doctorNumber,String treatment,String status) {
		super(firstName, lastName, address, phoneNumber, patientNumber, age, sex, city, entryDate, doctorName, diagnosis,
				departmentName);
		this.patientId=patientId;
		this.doctorNumber=doctorNumber;
		this.treatment=treatment;
		this.status=status;		
	}
	public int getDoctorNumber() {
		return doctorNumber;
	}
	public void setDoctorNumber(int doctorNumber) {
		this.doctorNumber=doctorNumber;
	}
	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus( String status) {
		this.status = status;
	} 
	@Override
	public String toString() {
		return super.toString()+"\t\t"+patientId+"    \t\t"+doctorNumber+"\t\t" + treatment + "\t" + status ;
	}


}
