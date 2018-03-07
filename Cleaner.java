package asg1;

public class Cleaner extends Employee {

	public Cleaner(String name, String department, String shift, int contact, String status) {
		super(name, department, shift, contact, status);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cleaner [name=" + name + ", department=" + department + ", shift=" + shift + ", contact=" + contact
				+ ", status=" + status + "]";
	}

}
