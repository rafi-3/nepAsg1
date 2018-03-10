package asg1;

import java.util.ArrayList;

public class EmployeeManagement {

	ArrayList<Employee> employeeList;
	
	public EmployeeManagement() {
		employeeList = new ArrayList<Employee>();
		
	}
	
	public ArrayList<Employee> getAllAvailableEmployee() {
		return employeeList;
	}
	
}
