package flightTicketReservation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewFlightDetails extends BookTicket
{
	protected void viewFlightDetails() throws ClassNotFoundException, SQLException
	{
		Statement statement = jdbcConnection();

		ResultSet rs =  statement.executeQuery("select *from flightdetails");
		
		System.out.println("FligtId\tFlightName\tBookedTickets\tAvailableTicket\t\tFrom - To\t\tDate and Time\t\tTicketPrice");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getInt(3)+"\t\t"+(50 -rs.getInt(3))+"\t\t"
					+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6));
		}	
		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
	}
}
