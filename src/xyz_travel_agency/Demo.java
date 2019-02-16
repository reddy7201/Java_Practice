package xyz_travel_agency;
import java.util.Scanner;
import java.lang.*;
public class Demo {

	public static void main(String[] args) {
	
		/*RailwayReservation objRailReservation;
		AirticketReservation objAirTicketReservation;*/
		
		String category, customerName, trainName, flightName, bookingClass, confirmation;
		int numberOfTickets;
		bookingClass=null;
		trainName=null;
		flightName=null;

		while(true){

			Scanner s = new Scanner(System.in);
			System.out.println("Please enter the reservation category 1. Train 2. Flight");
			category=s.next();
			
			System.out.println("Enter Customer Name");
				customerName=s.next();
				
		    Reservation objReservation=new Reservation(category, customerName);
			
			if(objReservation.validateCategory()){

				System.out.println("Enter number of tickets");
				numberOfTickets=s.nextInt();

				if (category.equalsIgnoreCase("Train")) {

					System.out.println("Enter Train Name");
					trainName=s.next();

					System.out.println("Enter booking class");
					bookingClass=s.next();

					RailwayReservation objRailReservation = new RailwayReservation(category, customerName, trainName, numberOfTickets, bookingClass);

					objRailReservation.calculateAmount();
					System.out.println("Do you wish to proceed?");
					confirmation=s.next();
					if(!confirmation.equalsIgnoreCase("Y"))
						break;
				
				} else if(category.equalsIgnoreCase("Flight")){

					System.out.println("Enter Flight Name");
					flightName=s.next();

					System.out.println("Enter booking class");
					bookingClass=s.next();

					AirTicketReservation objAirTicketReservation = new AirTicketReservation(category, customerName, flightName, numberOfTickets, bookingClass);

					objAirTicketReservation.calculateAmount();
					System.out.println("Do you wish to proceed?");
					confirmation=s.next();
					if(!confirmation.equalsIgnoreCase("Y"))
						break;
				}
			} 
			else {

				System.out.println("Wrong category selected");
				category=null;
				continue;
			}
			System.out.println("Transaction Number: "+objReservation.getTransactionNumber());
			System.out.println("Ticket Category: "+ bookingClass);
			System.out.println("Customer Name: "+ customerName);
			if (category.equalsIgnoreCase("Train")) {
				System.out.println("Train Name: "+trainName);
			}
			if (category.equalsIgnoreCase("Flight")) {
				System.out.println("Flight Name: "+flightName);
			}
			System.out.println("Number of Tickets: "+ numberOfTickets);
			//s.close();
		}
		
		
	}

}
