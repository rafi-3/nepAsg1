package asg1;

public class Nurse extends Employee {

	public Nurse(String name, String department, String shift, int contact, String status) {
		super(name, department, shift, contact, status);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Nurse [name=" + name + ", ward=" + department + ", shift=" + shift + ", contact=" + contact
				+ ", status=" + status + "]";
	}

}
