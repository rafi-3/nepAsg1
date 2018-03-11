package asg1;

import java.util.Scanner;

public class RunProgramRoomM {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
//		while (true) {
			System.out.println("Welcome to Hospital Room Booking Mangement");
			System.out.println("(1)Book ward for patient");
			System.out.println("(2)Show booked room");
			String optionInput = scanner.nextLine();
			int option = Integer.parseInt(optionInput);
			
			if(option == 1) {
				booking();
			}
			
			else if(option == 2) {
				System.out.println(RoomBookingManagement.getRoom());
			}
			else if(option == 3) {
//				break;
			}
			scanner.close();
//		}
	}	
		
		public static void booking() {
			System.out.println("Patient name: ");
			String uname = scanner.nextLine();
			
			System.out.println("Patient contact: ");
			int ucontact	= scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Choose ward number(1-10): ");
			int uward = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("bed");
			int ubed = scanner.nextInt();
			scanner.nextLine();
			
			
			RoomBookingManagement.room.add(new Booking(uname, ucontact, uward, ubed));
			System.out.println(RoomBookingManagement.getRoom());
		}
}
