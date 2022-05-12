
public class Patient_Dis extends Patient_Admit {
	  private String treatmentGiven;
	     private String treatementAdvice;
	     private String paymentMade;
	     private String dateOfDischarge;
	     
	    public Patient_Dis(String firstName, String lastName, String address, int phoneNumber, int patientNumber, 
	    		int age,char sex, String city, String entryDate, String doctorName, String diagnosis, String departmentName,int patientId, 
	    		int doctorNumber, String treatment, String status, double advancePayment,String modeOfPayment, int roomNumber, 
	    		String dateOfAdmission, String initialCondition, String attendantName,double AdvancePayment,String treatmentGiven,
	    		String treatementAdvice,String paymentMade,String dateOfDischarge) {
		super(firstName, lastName, address, phoneNumber, patientNumber, age, sex, city, entryDate, doctorName, diagnosis,
				departmentName, patientId, doctorNumber, treatment, status, advancePayment, modeOfPayment, roomNumber,
				dateOfAdmission, initialCondition, attendantName, AdvancePayment);
		this.treatmentGiven=treatmentGiven;
		this.treatementAdvice=treatementAdvice;
		this.paymentMade=paymentMade;
		this.dateOfDischarge=dateOfDischarge;	
	}
	public String getTreatementGiven() {
		return treatmentGiven;
	}
    public void setTreatementGiven(String treatmentGiven) {
		this.treatmentGiven = treatmentGiven;
	}
	public String getTreatementAdvice() {
	 return treatementAdvice;
		}
     
    public void setTreatementAdvice(String treatmentAdvice) {
		this.treatementAdvice = treatmentAdvice;
        }
		public String getPaymentMade() {
	   return paymentMade;
		}
	     
    public void setPaymentMade(String paymentMade) {
	 this.paymentMade = paymentMade; 
		}
    public String getDateOfDistcharge() {
	  return dateOfDischarge;
        }
    public void setDateOfDistcharge(String dateOfDischarge) {
	  this.dateOfDischarge = dateOfDischarge;
         }
    @Override
	public String toString() {
		return "Patient_Dis [ "+super.toString()+" , treatmentGiven=" +  treatmentGiven +  " , treatementAdvice=" + treatementAdvice +" , paymentMade=" + paymentMade+    " , dateOfDischarge=" +  dateOfDischarge +  "]";
	}
}
