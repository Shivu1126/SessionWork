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
	private Scanner scanner = new Scanner(System.in);
	protected void flightTicketBooking() 
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
			
			switch(choice)
			{
			case 1:
				try {
					viewFlightDetails();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					bookFlightTicket();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
				break;
			case 3:
				cancelTicket();
				break;
			case 4:
				showPassengerDetails();
				break;
			case 5:
				waitingListDeatils();
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