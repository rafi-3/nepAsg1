package asg1;

public class RunProgramPharmacyInventory {

	public static void main(String[] args) {
		
		Supplier supplier1 = new Supplier();
		supplier1.companyName = "GSK";
		supplier1.companyContact = 2773356;
		
		Supplier supplier2 = new Supplier();
		supplier2.companyName = "Blackmore";
		supplier2.companyContact = 2773366;
		
		Inventory inventory1 = new Inventory();
		inventory1.qty = 100;
		inventory1.bestBefore = 2020;
		
		Inventory inventory2 = new Inventory();
		inventory2.qty = 100;
		inventory2.bestBefore = 2019;
		
		Medicine medicine1 = new Medicine();
		medicine1.name = "Panadol";
		medicine1.dosage = 10;
		medicine1.quantity = 100;
		medicine1.supplier = supplier1;
		medicine1.inventory = inventory1;
		
		Medicine medicine2 = new Medicine();
		medicine2.name = "Fish Oil";
		medicine2.dosage = 3000;
		medicine2.quantity = 1000;
		medicine2.supplier = supplier2;
		medicine2.inventory = inventory2;
		
		Medicine medicine3 = new Medicine();
		medicine3.name = "Garlic";
		medicine3.dosage = 1000;
		medicine3.quantity = 1000;
		medicine3.supplier = supplier2;
		medicine3.inventory = inventory2;
		
		System.out.println(medicine1);
		System.out.println(medicine2);
		System.out.println(medicine3);
	}
}
