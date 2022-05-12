import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public  class PatientEntry extends Person {
	private int patientNumber;
	private int age;
	private char sex;
	private String city;
	private String entryDate;
	private String doctorName;
	private String diagnosis;
	private String departmentName;
	private boolean continueLoop=true;
	public PatientEntry() {
		do {
		try {
			Scanner input = new Scanner(System.in);
		
			System.out.println("Enter the patient's number=...");
			patientNumber=input.nextInt();
			System.out.println("Enter the patient's age=...");
			age=input.nextInt();
			System.out.println("Enter the patient's sex=...");
			sex=(char) input.nextInt();
			System.out.println("Enter the patient's city=...");
			city=input.nextLine();
			System.out.println("Enter the patient's entry Date=...");
			entryDate=input.nextLine();
			System.out.println("Enter the doctor name=...");
			doctorName=input.nextLine();
			System.out.println("Enter the diagnosis=...");
			diagnosis=input.nextLine();
			System.out.println("Enter the department name=...");
			departmentName=input.nextLine();
			continueLoop=false;
    	}
    	catch(InputMismatchException InputMismatchException) {
    		System.out.println("Error in type!\nPlease try again.");
    	}}while(continueLoop);

		
	}
	//Any patient
	public PatientEntry(String firstName , String lastName , String address , int phoneNumber,int patientNumber, 
		int age,char sex, String city, String entryDate, String doctorName, String diagnosis, String departmentName ) {
		super(firstName,lastName,address,phoneNumber);
		
		this.patientNumber=patientNumber;
		this.age=age;
		this.sex=sex;
		this.city=city;
		this.entryDate=entryDate;
		this.doctorName=doctorName;
		this.diagnosis=diagnosis;
		this.departmentName=departmentName;
	}
	
	public void setPatientNumber( int patientNumber) {
		this.patientNumber=patientNumber;
	}
	public int getPatientNumber() {
		return patientNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge (int age) {
		this.age=age;
	}
	public void setSex(char sex) {
		this.sex=sex;
	}
	public int getSex() {
		return sex;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
    public String getEntryDate() {
    	return entryDate;
    }
    public void setEntryDate(String entryDate) {
    	this.entryDate=entryDate;
    }
   public String getDoctorName() {
	   return doctorName;
   }
   public void setDoctorName(String doctorName) {
	   this.doctorName=doctorName;
   }
   public String getDiagnosis() {
	   return diagnosis;
   }
   public void setDiagnosis(String diagnosis) {
	   this.diagnosis=diagnosis;
   }
   public String getDepartmentName() {
	   return departmentName;
   }
   public void setDepartmentName(String departmentName) {
	   this.departmentName=departmentName;
   }
   @Override
	public String toString() {
		return super.toString()+"    \t\t"+patientNumber+"\t"+age+"   \t"+sex+"\t"+city+"\t"+entryDate+"\t"+doctorName+"   \t"+diagnosis+"  \t\t"+departmentName;
	   }
	

}
