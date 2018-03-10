package asg1;

import java.util.ArrayList;

public class EmployeeManagement2 {

	public static void main(String[] args) {
		
		ArrayList<Doctor> doc = new ArrayList<Doctor>();
		doc.add(new Doctor("Rafi", "Surgeon", "AM", 8669669, "Available"));
		doc.add(new Doctor("Riley", "Dentist", "AM/PM", 8885555, "Available"));
		doc.add(new Doctor("August", "Gyne", "PM", 8628700, "Busy"));
		doc.add(new Doctor("Ariana", "Out Patient", "AM", 8805325, "Away"));
	
		ArrayList<Nurse> nur = new ArrayList<Nurse>();
		nur.add(new Nurse("Rafi", "Beranak", "24hrs", 8669669, "Available"));
		nur.add(new Nurse("Anastasia", "12", "24hrs", 8669669, "Available"));
		nur.add(new Nurse("Tori", "10", "24hrs", 8669669, "Available"));
		
		ArrayList<Pharmacist> phar = new ArrayList<Pharmacist>();
		phar.add(new Pharmacist("Hidah", "", "AM/PM", 8885666, "Busy"));
		phar.add(new Pharmacist("Adib", "", "AM/PM", 8885555, "Available"));
		
		ArrayList<Cleaner> cln = new ArrayList<Cleaner>();
		cln.add(new Cleaner("Yana", "", "AM/PM", 8885555, "Available"));
		
		
		 for (Doctor tmp: doc){
             System.out.println(tmp);
         }
		 for (Nurse tmp: nur){
             System.out.println(tmp);
         }
		 for (Pharmacist tmp: phar){
             System.out.println(tmp);
         }
		 for (Cleaner tmp: cln){
             System.out.println(tmp);
         }
	}
	
	
}
