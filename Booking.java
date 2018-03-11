package asg1;

public class Booking extends RoomBooking{
	public Booking(String name, int contact, int bedNumber, int wardNumber) {
		super(name, contact, bedNumber, wardNumber);
		
	}

	@Override
	public String toString() {
		return "Test [name=" + name + ", contact=" + contact + ", bedNumber=" + bedNumber + ", wardNumber=" + wardNumber
				+ "]";
	}

	
	
	
}
