import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;
import java.util.InputMismatchException;

public class MainProgram {

	public static void main(String[] args) {
		
		/*ArrayList<PatientEntry> Patient = new ArrayList<PatientEntry>();
		PatientEntry P1=new PatientEntry("Karim","Ben Amar","mednin",20203025, 01,20,'M',"Tunis","11/11/2020","Dr.Belgassem"," CLINICAL","department1");
		PatientEntry P2=new PatientEntry("Salima","Idoudi","beja",20203025, 02,20,'F',"Tunis","14/12/2019","Dr Belgassem"," CLINICAL","Mkj");
		Patient.add(P1);
		Patient.add(P2);
	     for (int i = 0; i < Patient.size(); i++) {
	         System.out.println(Patient.get(i));
	       }
	     ArrayList<Patient_Checkup> checkup=new ArrayList<Patient_Checkup>();
	     Patient_Checkup P3=new Patient_Checkup("Karim","Ben Amar","mednin",20203025, 01,20,'M',"Tunis","11/11/2020","Dr.Belgassem"," CLINICAL","department1",50,121,"Treatment 2","Admit");
	     Patient_Checkup P4=new Patient_Checkup("Sirine","Trabelsi","Nabeul",25202545, 05,50,'F',"Tunis","14/11/2020","Dr.Hassouna"," CLINICAL","department4",80,125,"Treatment 4","OPR");
	     checkup.add(P3);
	     checkup.add(P4);
	     for (int j = 0; j < checkup.size(); j++) {
	         System.out.println(checkup.get(j));
	       }*/
		  String months[] = {
		            "Jan",
		            "Feb",
		            "Mar",
		            "Apr",
		            "May",
		            "Jun",
		            "Jul",
		            "Aug",
		            "Sep",
		            "Oct",
		            "Nov",
		            "Dec"
		        };
		        Calendar calendar = Calendar.getInstance();
		        System.out.println("--------------------------------------------------------------------------------");
		        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
		        System.out.println("\n--------------------------------------------------------------------------------");
		        System.out.println("            *** Welcome to Hospital Management System Project in Java ***");
		        System.out.println("--------------------------------------------------------------------------------");
		        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
		        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
		int m=100;
		int k=200;
        DoctorRegular[] DR = new DoctorRegular[m];
        DoctorOnCall[] DOC = new DoctorOnCall[m];
        Patient_Admit[] PA = new Patient_Admit[k];
        Patient_OPR[] PO = new Patient_OPR[k];
        Patient_Reg[] PR = new Patient_Reg[k];
        
        DR[0]=new DoctorRegular("Ahmed","Aboud","Ariana",20487544,"(MBBS)",290,2100,"june 2011");
        DR[1]=new DoctorRegular("Salma","Ayari","Marsa",51332255,"(BMBS)",211,2400,"December 2007");
        DR[2]=new DoctorRegular("Ahlem","Krim","Tunis",55212222,"(MBBS)",214,2200,"mai 2008");
        DR[3]=new DoctorRegular("Karim","Baccouch","Ariana",28524454,"(BMBS)",215,2200,"june 2008");
        DR[4]=new DoctorRegular("Mostfa","Bouzid","Tunis",46222558,"(MBBS)",311,2000,"september 2015");
        DR[5]=new DoctorRegular("Adil","Ataya","Marsa",92552442,"(MBBS)",150,2800,"april 2002");

        
        DOC[0]=new DoctorOnCall("Amina","Marzouk","Tunis",90885424,"(BMBS)",111,200,"june 2017");
        DOC[1]=new DoctorOnCall("Nejib","Maherzi","Manouba",51332255,"(BMBS)",211,250,"December 2001");
        DOC[2]=new DoctorOnCall("Ahlem","Gharbi","Tunis",20002226,"(MBBS)",250,190,"mai 2014");
        DOC[3]=new DoctorOnCall("Sarah","Attrous","Ariana",46225114,"(BMBS)",215,300,"june 2000");
        DOC[4]=new DoctorOnCall("Khaled","Abassi","Tunis",20214885,"(BMBS)",311,110,"september 2015");
        DOC[5]=new DoctorOnCall("Aziz","Annabi","Aouina",29654445,"(MBBS)",150,200,"april 2002");
        
        PA[0]=new Patient_Admit("Sarra","belhaj","Marsa",23662522,402,22,'F',"Tunis","01 Dec 2020","Dr Amina Marzouk","hypertension","pathology",402,111,"medicines","admitted",120,"check",512,"01 Dec 2020","normal","",50);
        PA[1]=new Patient_Admit("Ala","krim","kram",25444222,301,47,'M',"Tunis","14 Mai 2019","Dr Adil Ataya","Diarrhea","dep1",301,150,"medicines","admitted",80,"liquid",111,"14 mai 2019","normal","Saida",80);
        PA[2]=new Patient_Admit("Hanen","Nebli","Manzah6",55220878,312,35,'F',"Tunis","22 July 2020","Dr Mostfa Bouzid","Infection","pathology",312,311,"medicines","admitted",110,"check",20,"01 Aug 2020","normal","",50);
        PA[3]=new Patient_Admit("Mohamed","Ali","Tunis",99858555,360,45,'M',"Tunis","11 Sep 2020","Dr Ahlem Krim","hypertension","Emergency",360,214,"medicines","admitted",120,"check",501,"11 Sep 2020","normal","",90);
        
        PO[0]=new Patient_OPR("Sarra","belhaj","Marsa",23662522,402,22,'F',"Tunis","01 Dec 2020","Dr Amina Marzouk","hypertension","dep3",402,111,"medicines","OPR", "15 sep 2019",1,"Neurosurgery","tired","normal");
        PO[1]=new Patient_OPR("Ala","krim","kram",25444222,301,47,'M',"Tunis","14 Mai 2019","Dr Adil Ataya","Diarrhea","radiology",301,150,"medicines","OPR", "15 sep 2019",1,"Neurosurgery","tired","normal");
        PO[2]=new Patient_OPR("Hanen","Nebli","Manzah6",55220878,312,35,'F',"Tunis","22 July 2020","Dr Mostfa Bouzid","Infection","Intensive care unit",312,311,"medicines","OPR", "15 sep 2019",1,"Neurosurgery","tired","normal");
        PO[3]=new Patient_OPR("Mohamed","Ali","Tunis",99858555,360,45,'M',"Tunis","11 Sep 2020","Dr Ahlem Krim","hypertension","dep3",360,214,"medicines","OPR", "15 sep 2019",1,"Neurosurgery","tired","normal");
        
        PR[0]=new Patient_Reg("Sarra","belhaj","Marsa",23662522,402,22,'F',"Tunis","01 Dec 2020","Dr Amina Marzouk","hypertension","Emergency",402,111,"medicines","Reg","Monday","Doliprane");
        PR[1]=new Patient_Reg("Ala","krim","kram",25444222,301,47,'M',"Tunis","14 Mai 2019","Dr Adil Ataya","Diarrhea","radiology",301,150,"medicines","Reg","Tuesday","Doliprex");
        PR[2]=new Patient_Reg("Mohamed","Ali","Tunis",99858555,360,45,'M',"Tunis","11 Sep 2020","Dr Ahlem Krim","hypertension","Emergency",360,214,"medicines","Reg","Thursday","Actifed");
        PR[3]=new Patient_Reg("Mohamed","Ali","Tunis",99858555,360,45,'M',"Tunis","11 Sep 2020","Dr Ahlem Krim","hypertension","Emergency",360,214,"medicines","Reg","Saturday","Doliprane");
        
        
        
        //to add a new doctor(move it in the list)
       /* int i;
        for (i = 0; i < DR.length; i++)
            DR[i] = new DoctorRegular();
        for (i = 0; i < DOC.length; i++)
            DOC[i] = new DoctorOnCall();*/
        
        /*for (i = 0; i < P.length; i++)
            P[i] = new PatientEntry();*/

		Scanner input = new Scanner(System.in);
        int choice, j, c1,t,n, status = 1, s1 = 1, s2 = 1;
        while (status == 1) {
        	 System.out.println("\n                                    MAIN MENU");
             System.out.println("-----------------------------------------------------------------------------------");
             System.out.println("1.Doctors  2. Patients ");
             System.out.println("-----------------------------------------------------------------------------------");
             choice = input.nextInt();
             switch (choice)
             {
                 case 1:
                     {
                         System.out.println("--------------------------------------------------------------------------------");
                         System.out.println("                      **DOCTOR SECTION**");
                         System.out.println("--------------------------------------------------------------------------------");
                         s1 = 1;
                         while (s1 == 1)
                         {
                             System.out.println("1.DoctorOnCall\n2.DoctorRegular\n3.Add Doctor");
                             c1 = input.nextInt();
                             switch (c1)
                             {
                                 case 1:
                                     {   System.out.println("--------------------------------------------------------------------------------");
                                         System.out.println("                      **DOCTOR ON CALL**");
                                         System.out.println("--------------------------------------------------------------------------------");
                                         System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                                         System.out.println("firstName \t lastName \t address \t phoneNumber \t doctorNumber \t Qualification \t feesPerCall \t paymentDue.");
                                         System.out.println("---------------------------------------------------------------------------------------------------------------------------");
                                         for(int i = 0;i<6;i++) {
                                        	 
                                             System.out.println(DOC[i].toString());
                                             
                                             }
                                        
                                         break;
                                     }
                                 case 2:
                                     {   System.out.println("--------------------------------------------------------------------------------");
                                         System.out.println("                      **DOCTOR REGULAR**");
                                         System.out.println("--------------------------------------------------------------------------------");
                                         System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                         System.out.println("firstName \t lastName\t address \t phoneNumber \t doctorNumber \t Qualification \t salary \t dateOfJoining.");
                                         System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                         for (j = 0; j < 6; j++)
                                         {
                                            System.out.println( DR[j].toString());
                                         }
                                         break;
                                     }
                                 case 3:
                                 {
                                	  System.out.println("--------------------------------------------------------------------------------");
                                      System.out.println("                      **ADD DOCTOR**");
                                      System.out.println("---------------------------------------------------------------------------------");
                                      try {
                                      System.out.println("Enter the number of doctors to add= ...");
                                      n=input.nextInt();
                                      if(n>m) {
                                    	  throw new ArrayIndexOutOfBoundsException();
                                      }
                                      else {
                                                               
                                      System.out.println("Enter the type of doctor:\n Press 1 for Regular Doctor\n Press 2 for Doctor On Call");
                                      t=input.nextInt();
                                      if(t==1) {
                                                                           
                                         for(j=0;j<n;j++) {
                                        	 DR[j] = new DoctorRegular();
                                         }
                                         System.out.println("--------------------------------------------------------------------------------");
                                         System.out.println("                      **DOCTOR REGULAR**");
                                         System.out.println("--------------------------------------------------------------------------------");
                                         System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                         System.out.println("firstName \t lastName\t address \t phoneNumber \t doctorNumber \t Qualification \t salary \t dateOfJoining.");
                                         System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                         for(j=0;j<n;j++) {
                                        	 System.out.println(DR[j].toString());
                                         }
                                         
                                      }
                                      else if(t==2) {
                                          for(j=0;j<n;j++) {
                                         	 DOC[j] = new DoctorOnCall();
                                          }
                                          System.out.println("--------------------------------------------------------------------------------");
                                          System.out.println("                      **DOCTOR ON CALL**");
                                          System.out.println("--------------------------------------------------------------------------------");
                                          System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                                          System.out.println("firstName \t lastName \t address \t phoneNumber \t doctorNumber \t Qualification \t feesPerCall \t paymentDue.");
                                          System.out.println("---------------------------------------------------------------------------------------------------------------------------");
                                          for(j=0;j<n;j++) {
                                         	 System.out.println(DOC[j].toString());
                                          }
                                      }
                                      }
                                      }
                                      catch(ArrayIndexOutOfBoundsException ArrayIndexOutOfBoundsException) {
                                    	  System.out.println("You can't add doctors more than the array bounds");
                                      }
                                      catch(InputMismatchException InputMismatchException) {
                                   		System.out.println("Error in type!\nPlease try again.");}
                                    break;
                                 }
                             }
                             System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                             s1 = input.nextInt();
                         }
                         break;
                     }
                 case 2:
                 {
                     System.out.println("--------------------------------------------------------------------------------");
                     System.out.println("                     **PATIENT SECTION**");
                     System.out.println("--------------------------------------------------------------------------------");
                     s2 = 1;
                     while (s2 == 1)
                     {
                         System.out.println("1.PatientAdmit\n2.Patient_OPR\n3.Patient_Reg\n4.Add Patient");
                         c1 = input.nextInt();
                         switch (c1)
                         {
                             case 1:
                                {System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                 System.out.println("                      **PATIENT ADMIT**");
                                 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                 System.out.println("firstName \t lastName\t address \t phoneNumber \t PatientNumber \t Age \t Sex \t City \t EntryDate \t DoctorName   \t\t  Diagnosis \t DepartmentName \t PatientID \t DoctorNumber \t Treatment \t Status \t AdvancePayment \t ModeOfPayment \t RoomNumber \t DateOfAdmission \t InitialCondition \t AttendantName \t AdvancePayment.");
                                 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                     for (j = 0; j < count2; j++) {
                                         System.out.println(PA[j].toString());
                                     }
                                     break;
                                 }
                             case 2:
                                 {
                                	 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                     System.out.println("                      **PATIENT OPR**");
                                     System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                     System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                     System.out.println("firstName \t lastName\t address \t phoneNumber \t PatientNumber \t Age \t Sex \t City \t EntryDate \t DoctorName   \t\t  Diagnosis \t DepartmentName \t PatientID \t DoctorNumber \t Treatment \t Status \t DateOfOperation \t NumberOfOperation \t TypeOfOperation \t ConditionBeforeOp \t ConditionAfterOp.");
                                     System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                         for (j = 0; j < count2; j++) {
                                             System.out.println(PO[j].toString());
                                         }
                                     break;
                                 }
                             case 3:
                             {
                            	 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                 System.out.println("                      **PATIENT REG**");
                                 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                 System.out.println("firstName \t lastName\t address \t phoneNumber \t PatientNumber \t Age \t Sex \t City \t EntryDate \t DoctorName   \t\t  Diagnosis \t DepartmentName \t PatientID \t DoctorNumber \t Treatment \t Status \t DateOfVisit \t MedicineRecommended.");
                                 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                     for (j = 0; j < count2; j++) {
                                         System.out.println(PR[j].toString());
                                     }
                                 break;
                             }
                             case 4:
                             {
                            	  System.out.println("--------------------------------------------------------------------------------");
                                  System.out.println("                      **ADD Patient**");
                                  System.out.println("---------------------------------------------------------------------------------");
                                  try {
                                  System.out.println("Enter the number of Patients to add= ...");
                                  n=input.nextInt();
                                  if(n>k) {
                                	  throw new ArrayIndexOutOfBoundsException();
                                  }
                                  else {
                                  System.out.println("Enter the type of patient:\n Press 1 for Patient_Admit\n Press 2 for Patient_Reg\n Press 3 for Patient_OPR");
                                  t=input.nextInt();
                                  if(t==1) {
                                                                       
                                     for(j=0;j<n;j++) {
                                    	 PA[j] = new Patient_Admit();
                                     }
                                     System.out.println("--------------------------------------------------------------------------------");
                                     System.out.println("                      **Patient_Admit**");
                                     System.out.println("--------------------------------------------------------------------------------");
                                     System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                     System.out.println("firstName \t lastName\t address \t phoneNumber \t PatientNumber \t Age \t Sex \t City \t EntryDate \t DoctorName   \t\t  Diagnosis \t DepartmentName \t PatientID \t DoctorNumber \t Treatment \t Status \t AdvancePayment \t ModeOfPayment \t RoomNumber \t DateOfAdmission \t InitialCondition \t AttendantName \t AdvancePayment.");
                                     System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                     for(j=0;j<n;j++) {
                                    	 System.out.println(PA[j].toString());
                                     }
                                     
                                  }
                                  else if(t==2) {
                                      for(j=0;j<n;j++) {
                                     	 PR[j] = new Patient_Reg();
                                      }
                                      System.out.println("--------------------------------------------------------------------------------");
                                      System.out.println("                      **Patient_Regular**");
                                      System.out.println("--------------------------------------------------------------------------------");
                                      System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                                      System.out.println("firstName \t lastName\t address \t phoneNumber \t PatientNumber \t Age \t Sex \t City \t EntryDate \t DoctorName   \t\t  Diagnosis \t DepartmentName \t PatientID \t DoctorNumber \t Treatment \t Status \t DateOfVisit \t MedicineRecommended.");
                                      System.out.println("---------------------------------------------------------------------------------------------------------------------------");
                                      for(j=0;j<n;j++) {
                                     	 System.out.println(PR[j].toString());
                                      }
                                  }
                                  else if(t==3) {
                                      for(j=0;j<n;j++) {
                                     	 PO[j] = new Patient_OPR();
                                      }
                                      System.out.println("--------------------------------------------------------------------------------");
                                      System.out.println("                      **Patient_Operation**");
                                      System.out.println("--------------------------------------------------------------------------------");
                                      System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                                      System.out.println("firstName \t lastName\t address \t phoneNumber \t PatientNumber \t Age \t Sex \t City \t EntryDate \t DoctorName   \t\t  Diagnosis \t DepartmentName \t PatientID \t DoctorNumber \t Treatment \t Status \t DateOfOperation \t NumberOfOperation \t TypeOfOperation \t ConditionBeforeOp \t ConditionAfterOp.");
                                      System.out.println("---------------------------------------------------------------------------------------------------------------------------");
                                      for(j=0;j<n;j++) {
                                     	 System.out.println(PO[j].toString());
                                      }
                                  }
                                  }
                                  }
                                  catch(ArrayIndexOutOfBoundsException ArrayIndexOutOfBoundsException) {
                                	  System.out.println("You can't add doctors more than the array bounds");
                                  }
                                  catch(InputMismatchException InputMismatchException) {
                                		System.out.println("Error in type!\nPlease try again.");}
                                break;
                             }
                         }
                         System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                         s2 = input.nextInt();
                     }
                     break;
                 }
                   
             }
      
        }
        
	}

}
