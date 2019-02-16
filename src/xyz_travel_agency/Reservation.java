package xyz_travel_agency;

public class Reservation {
	
static int transactionNumber;
String category;
String customerName;

Reservation(String category, String customerName){
	
	this.category = category;
	this.customerName = customerName;
}
public int getTransactionNumber() {
	
	transactionNumber++;
	return transactionNumber;
}

/*public String getCustomerName() {
	
	this.customerName = customerName;
	
	return customerName;
}*/

public boolean validateCategory() {
	
	if(category.equalsIgnoreCase("train") || category.equalsIgnoreCase("flight"))
	
		return true;
	
	else 
		
		return false;
	
}
}
