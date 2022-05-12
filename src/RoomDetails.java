
	public class RoomDetails  {
		
	private  int  roomNumber ; 
	private String roomType ; 
	private boolean status ; 
	private PatientEntry patient ;

		

	public RoomDetails(int roomNumber,  String roomType, boolean status) {
		
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.status = status;
		
	}
	



	public PatientEntry getPatient() {
		return patient;
	}
	public void setPatient(PatientEntry patient) {
		this.patient = patient;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public boolean getStaus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}


	
	
	@Override
	public String toString() {
		return "RoomDetails [number=" + roomNumber  + " type=" + roomType  +" status= "+status+" patient=" + patient + "]";
	}


}
