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
				System.out.println("Available Doctors:");
				Doctor employee1 = new Doctor("Rafi", "Surgeon", "AM", 8669669, "Available");
				System.out.println(employee1);
				Doctor employee2 = new Doctor("Riley", "Dentist", "AM/PM", 8885555, "Available");
				System.out.println(employee2);
				Doctor employee3 = new Doctor("August", "Gyne", "PM", 8628700, "Busy");
				System.out.println(employee3);
				Doctor employee4 = new Doctor("Ariana", "Out Patient", "AM", 8805325, "Away");
				System.out.println(employee4);
			}
			
//			Nurse
			if(option == 2) {
				System.out.println("Available Nurse:");
				Nurse employee1 = new Nurse("Rafi", "Beranak", "24hrs", 8669669, "Available");
				System.out.println(employee1);
			}
			
//			Pharmacist
			if(option == 3) {
				System.out.println("Available Pharmacist");
				Pharmacist employee1 = new Pharmacist("Adib", "", "AM/PM", 8885555, "Available");
				System.out.println(employee1);
			}
			
//			Cleaner
			if(option == 4) {
				System.out.println("Available Cleaner");
				Cleaner employee1 = new Cleaner("Yana", "", "AM/PM", 8885555, "Available");
				System.out.println(employee1);
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
