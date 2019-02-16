package xyz_travel_agency;

public class AirTicketReservation {

	String flightName;
	int numberOfTickets;
	String bookingClass;
	String category;
	String customerName;
	
	AirTicketReservation(String category, String customerName, String flightName, int numberOfTickets, String bookingClass){
	
		this.category=category;
		this.customerName=customerName;
		this.flightName=flightName;
		this.numberOfTickets=numberOfTickets;
		this.bookingClass=bookingClass;
	}
	
	public String getFlightName() {
		return this.flightName;
	}
	
	public int getNumberOfTickets() {
		return this.numberOfTickets;
	}
	
	public void calculateAmount() {
		
		float amount=0;
		if(this.bookingClass.equalsIgnoreCase("Business")){
			amount = numberOfTickets*4500;
		} 
		if(this.bookingClass.equalsIgnoreCase("Economy")){
			amount = numberOfTickets*3500;
		}
		System.out.println("Amount: "+amount);
		
	}
}
