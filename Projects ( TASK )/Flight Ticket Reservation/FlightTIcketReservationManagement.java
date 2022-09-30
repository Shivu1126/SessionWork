package flightTicketReservation;

import java.sql.SQLException;
import java.util.Scanner;


public class FlightTIcketReservationManagement{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		BookFlightTicket bookTicket = new BookFlightTicket();
		bookTicket.flightTicketBooking();
	}

}
class BookFlightTicket extends ViewFlightDetails 
{
	Scanner scanner = new Scanner(System.in);
	protected void flightTicketBooking() throws ClassNotFoundException, SQLException
	{
		System.out.println("Welcome to Booking Flight Ticket");
		System.out.println("--------------------------------");
		while(true)
		{
			System.out.println("1. View Flight Details");
			System.out.println("2. Book Ticket");
			System.out.println("3. Cancel Ticket");
			System.out.println("4. Show Passenger Ticket Details");
			System.out.println("5. Waiting List Details");
			System.out.println("6. Exit");

			System.out.println("Enter your option");
			int choice = scanner.nextInt();
			
			BookFlightTicket bookFlightDetails = new BookFlightTicket();
			switch(choice)
			{
			case 1:
				bookFlightDetails.viewFlightDetails();
				break;
			case 2:
				bookFlightDetails.bookFlightTicket();
				break;
			case 3:
				bookFlightDetails.cancelTicket();
				break;
			case 4:
				bookFlightDetails.showPassengerDetails();
				break;
			case 5:
				bookFlightDetails.waitingListDeatils();
				break;
			case 6:
				return;
			default:
				System.out.println("Enter proper input");
				break;
			}
		}
			
	}
}