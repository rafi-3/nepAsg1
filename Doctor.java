package asg1;

public class Doctor extends Employee {

	public Doctor(String name, String department, String shift, int contact, String status) {
		super(name, department, shift, contact, status);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", department=" + department + ", shift=" + shift + ", contact=" + contact
				+ ", status=" + status + "]";
	}

	
}
