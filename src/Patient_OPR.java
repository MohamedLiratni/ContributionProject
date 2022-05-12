import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Patient_OPR extends Patient_Checkup {
	   private String dateOp;
	   private int numberOfOp;
	   private String typeOfOp;
	   private String conditonBeforeOp;
	   private String conditionAfterOp;
	   private boolean continueLoop=true;
    public Patient_OPR() {
		   super();
		   do {
	    	try {
	    		Scanner input = new Scanner(System.in);
	    	    System.out.println("Enter the operation date=...");
				dateOp=input.nextLine();
				System.out.println("Enter the number Of Operations=...");
				numberOfOp=input.nextInt();
				System.out.println("Enter the type Of Operation=...");
				typeOfOp=input.nextLine();
				System.out.println("Enter the conditon Before Operation=...");
				conditonBeforeOp=input.nextLine();
				System.out.println("Enter the conditon after Operation=...");
				conditionAfterOp=input.nextLine();
				continueLoop=false;
	    	}
	    	catch(InputMismatchException InputMismatchException) {
	    		System.out.println("Error in type!\nPlease try again.");
	    	}}while(continueLoop);
	}
	   public Patient_OPR(String firstName, String lastName, String address, int phoneNumber, int patientNumber, int age,char sex, String city, String entryDate, String doctorName, String diagnosis, String departmentName,int patientId, int doctorNumber, String treatment, String status,String dateOp,int numberOfOp,String typeOfOp,String conditonBeforeOp,String conditionAfterOp) {
		super(firstName, lastName, address, phoneNumber, patientNumber, age, sex, city, entryDate, doctorName, diagnosis,
				departmentName, patientId, doctorNumber, treatment, status);
		   this.dateOp = dateOp;
		   this.numberOfOp = numberOfOp;
		   this.typeOfOp = typeOfOp;
		   this.conditonBeforeOp = conditonBeforeOp;
		   this.conditionAfterOp = conditionAfterOp;
	}
	
	public String getDateOp() {
		return dateOp;
	}
	   
	public void setDateOp(String dateOp) {
		this.dateOp= dateOp;
	}
	
	public int  getNumberOfOp() {
		return  numberOfOp;
	}
	
	public void setNumberOfOp(int numberOfOp) {
		this.numberOfOp = numberOfOp;
	}
	
	public String  getTypeOfOp() {
		return  typeOfOp;
	}
	
	public void setTypeOfOp(String typeOfOp) {
		this.typeOfOp = typeOfOp;
	}
	
	public String getPatientConditionAfterOp() {
		return conditionAfterOp;
	}
	
	public String getConditionBeforeOp() {
		return conditonBeforeOp;
	}
	
	public void setConditionAfterOp(String conditionAfterOp) {
		this.conditionAfterOp = conditionAfterOp;
	}
	
	public void setConditonBeforeOp(String conditonBeforeOp) {
		this.conditonBeforeOp = conditonBeforeOp;
	}
	
	@Override
	public String toString() {
		return  super.toString () + "\t\t" + dateOp + "\t\t\t" + numberOfOp +"\t\t\t" + typeOfOp +	"\t\t\t" + conditonBeforeOp	+ "\t\t\t" +conditionAfterOp+"]";
	}
	

}
