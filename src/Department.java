import java.util.*;

public abstract class Department {
	private String departmentName ; 
	private String departmentLocation;
	private String facilities ;
	private List<Doctor> doctors ;
	private List<PatientEntry> patients ;
	
	
	
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentLocation() {
		return departmentLocation;
	}

	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}

	public String getFacilities() {
		return facilities;
	}

	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public List<PatientEntry> getPatients() {
		return patients;
	}

	public void setPatients(List<PatientEntry> patients) {
		this.patients = patients;
	}

	public Department(String departmentName , String departmentLocation,String facilities){
		this.facilities= facilities;
		this.doctors = new ArrayList<>();
		this.patients = new ArrayList<>();
		this.departmentLocation=departmentLocation;
		this.departmentName=departmentName;
	    	 }

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", departmentLocation=" + departmentLocation
				+ ", facilities=" + facilities + ", doctors=" + doctors + ", patients=" + patients + "]";
	}

	

	
	
	

}
