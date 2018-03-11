package asg1;

import java.util.Scanner;

public class RunProgramEmployeeManagement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		
		while(true) {
			
			System.out.println("Welcome to Hospital Management");
			System.out.println("Employee Management");
			System.out.println("Choose to see which employee available today");
			System.out.println("(1)Doctor");
			System.out.println("(2)Nurse");
			System.out.println("(3)Pharmacist");
			System.out.println("(4)Cleaner");
			System.out.println("(5)Quit");
			String optionInput =scanner.nextLine();
			int option = Integer.parseInt(optionInput);
			
//			Doctor
			if(option == 1) {
				System.out.println(EmployeeManagement.getDoc());	
			}
			
//			Nurse
			if(option == 2) {
				System.out.println(EmployeeManagement.getNur());
			}
			
//			pharmacist
			if(option == 3) {
				System.out.println(EmployeeManagement.getPhar());
			}
			
//			Cleaner
			if(option == 4) {
				System.out.println(EmployeeManagement.getCln());
			}
			
//			quit
			if(option == 5) {
				System.out.println("Have a good day!");
				break;
			}
		}

		scanner.close();
	
	}
}
