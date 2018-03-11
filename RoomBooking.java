package asg1;

public class RoomBooking {
	String name;
	int contact;
	int bedNumber;
	int wardNumber;
	
	public RoomBooking(String name, int contact, int bedNumber, int wardNumber) {
		super();
		this.name = name;
		this.contact = contact;
		this.bedNumber = bedNumber;
		this.wardNumber = wardNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public int getBedNumber() {
		return bedNumber;
	}

	public void setBedNumber(int bedNumber) {
		this.bedNumber = bedNumber;
	}

	public int getWardNumber() {
		return wardNumber;
	}

	public void setWardNumber(int wardNumber) {
		this.wardNumber = wardNumber;
	}
	
}
