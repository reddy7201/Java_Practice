package xyz_travel_agency;

public class RailwayReservation{
	
String trainName;
int numberOfTickets;
String bookingClass;

RailwayReservation(String category, String customerName, String trainName, int numberOfTickets, String bookingClass){
	
	this.trainName = trainName;
	this.numberOfTickets = numberOfTickets;
	this.bookingClass=bookingClass;
}

public String getTrainName() {
	return this.trainName;
}

/*public int getNumberOfTickets() {
	return 1;

}*/

public void calculateAmount() {
	
	float amount=0;
	if(bookingClass.equalsIgnoreCase("AC1")){
		amount = numberOfTickets*1500;
	} 
	if(bookingClass.equalsIgnoreCase("AC2")){
		amount = numberOfTickets*1100;
	}
	if(bookingClass.equalsIgnoreCase("AC3")){
		amount = numberOfTickets*700;
	}
	System.out.println("Amount: "+amount);
	
}


}
