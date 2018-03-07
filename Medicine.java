package asg1;

public class Medicine {

	String name;
	int dosage;
	int quantity;
	Supplier supplier;
	
	
	@Override
	public String toString() {
		return "Medicine [name=" + name + ", dosage=" + dosage + "mg , quantity=" + quantity +"tablets " + supplier;
	}
	
	
}
