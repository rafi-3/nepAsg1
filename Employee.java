package asg1;

public abstract class Employee {

	String name;
	String department;
	String shift;
	public int contact;
	String status;
	
	public Employee(String name, String department, String shift, int contact, String status) {
		super();
		this.name = name;
		this.department = department;
		this.shift = shift;
		this.contact = contact;
		this.status = status;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
