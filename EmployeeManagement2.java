package asg1;

import java.util.ArrayList;

public class EmployeeManagement2 {

	static ArrayList<Doctor> doc = new ArrayList<Doctor>();
	static ArrayList<Nurse> nur = new ArrayList<Nurse>();
	static ArrayList<Pharmacist> phar = new ArrayList<Pharmacist>();
	static ArrayList<Cleaner> cln = new ArrayList<Cleaner>();
	
	public static void list() {
		
		
		doc.add(new Doctor("Rafi", "Surgeon", "AM", 8669669, "Available"));
		doc.add(new Doctor("Ariana", "Out Patient", "AM", 8805325, "Away"));
	
		nur.add(new Nurse("Rafi", "Beranak", "24hrs", 8669669, "Available"));
		nur.add(new Nurse("Anastasia", "12", "24hrs", 8669669, "Available"));		
		
		phar.add(new Pharmacist("Hidah", "", "AM/PM", 8885666, "Busy"));
		phar.add(new Pharmacist("Adib", "", "AM/PM", 8885555, "Available"));
		
		cln.add(new Cleaner("Yana", "", "AM/PM", 8885555, "Available"));
		
		
		 
	}
	
	public static ArrayList<Doctor> getDoc() {
		list();
		return doc;
	}
	public static ArrayList<Nurse> getNur() {
		list();
		return nur;
	}
	public static ArrayList<Pharmacist> getPhar() {
		list();
		return phar;
	}
	public static ArrayList<Cleaner> getCln() {
		list();
		return cln;
	}
	
	
}
