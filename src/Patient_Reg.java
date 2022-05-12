import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Patient_Reg extends Patient_Checkup {
		
	       private String medecineRecommended;
	       private String  dateOfVisit ;
	       private boolean continueLoop=true;
	       
	    
	   public Patient_Reg() {
		   super();
		   do {
	    	try {
	    		Scanner input = new Scanner(System.in);
	   
				System.out.println("Enter the medecine Recommended=...");
				medecineRecommended=input.nextLine();
				System.out.println("Enter the date Of Visit=...");
				dateOfVisit=input.nextLine();
				continueLoop=false;
	    	}
	    	catch(InputMismatchException InputMismatchException) {
	    		System.out.println("Error in type!\nPlease try again.");
	    	}}while(continueLoop);


	   }
	       
		public String getMedecineRecommended() {
			return medecineRecommended;
		}
		
		
		public void setMedecineRecommended(String medecineRecommended) {
			this.medecineRecommended = medecineRecommended;
		}
		
		public String getDateOfVisit() {
			return dateOfVisit;
		}
		
		
		public void setDateOfVisit(String dateOfVisit ) {
			this.dateOfVisit = dateOfVisit;
		}
		
		

	public Patient_Reg(String firstName, String lastName, String address, int phoneNumber, int patientNumber,int age, char sex, String city, String entryDate, String doctorName, String diagnosis,String departmentName,int patientId,int doctorNumber,String treatment,String status , String dateOfVisit,   String medecineRecommended) {
		super(firstName, lastName, address, phoneNumber, patientNumber, age, sex, city, entryDate, doctorName, diagnosis,departmentName,patientId,doctorNumber,treatment,status);
	    this.medecineRecommended = medecineRecommended;
	    this.dateOfVisit = dateOfVisit;     			
	}
	
	
	@Override
	public String toString() {
		return  super.toString() +  "  \t\t" +   dateOfVisit + "  \t\t" + medecineRecommended  ;
		
	}


}

