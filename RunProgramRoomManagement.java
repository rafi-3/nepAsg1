package asg1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunProgramRoomManagement {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
//		System.out.println("Welcome to Hospital Room Booking Management");
//		System.out.println("Book ward for patient");
//		
//		System.out.println("Patient name: ");
//		String uname = scanner.nextLine();
//		
//		System.out.println("Patient contact: ");
//		int ucontact	= scanner.nextInt();
//		scanner.nextLine();
//		
//		System.out.println("Choose ward number(1-10): ");
//		int uward = scanner.nextInt();
//		scanner.nextLine();
//		
//		System.out.println("bed");
//		int ubed = scanner.nextInt();
//		scanner.nextLine();
//		
//		
//		RoomBookingManagement.room.add(new Booking(uname, ucontact, uward, ubed));
//		System.out.println(RoomBookingManagement.getRoom());
//		
		
		for(int i = 0; i < 1000; i++) {
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
				break;
			}
			scanner.close();
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
}
		

//		System.out.println("Name");
//		String userName = scanner.nextLine();
//		System.out.println("Contact");
//		int userContact = scanner.nextInt();
//		System.out.println("Ward");
//		int userWard = scanner.nextInt();
//		System.out.println("Bed");
//		int userBed	=	scanner.nextInt();
//		
//		
//		RoomBooking room = new RoomBooking(userName, userContact, userWard, userBed);
//		
//		System.out.println("Name: " +room.getName());
//		System.out.println("Contact: " +room.getContact());
//		System.out.println("Ward:" +room.getWardNumber());
//		System.out.println("Bed:" +room.getBedNumber());
//		
//		while(true) {
//			try {
//				
//				System.out.println("Welcome to Hospital Room Booking Mangement");
//				System.out.println("(1)Book ward for patient");
//				System.out.println("(2)Show booked room");
//				String optionInput = scanner.nextLine();
//				int option = Integer.parseInt(optionInput);
//				
//				if(option == 1) {
//					booking();
//				}
//				
//				else if(option == 2) {
//					System.out.println(RoomBookingManagement.getRoom());
//				}
//				else if(option == 3) {
//					break;
//				}
//				
//			} catch (InputMismatchException e) {
//				
//			}
//			scanner.close();
//		}
//		
//	}
//	

