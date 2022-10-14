package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.*;

public class ViewFlightDetails 
{
	protected void viewFlightDetails() 
	{
		Statement statement;
		try {
			statement = JdbcConnectionClass.getInstance().createStatement();
			ResultSet flightInfo =  statement.executeQuery("select *from flightdetails");

			System.out.println("FligtId\tFlightName\tBookedTickets\tAvailableTicket\t\tFrom - To\t\tDate and Time\t\tTicketPrice");
			System.out.println("--------------------------------------------------------------------------------------------------------------------------");
			
			while(flightInfo.next())
			{
				System.out.println(flightInfo.getInt(1)+"\t"+flightInfo.getString(2)+"\t\t"+flightInfo.getInt(3)+"\t\t"+(50 -flightInfo.getInt(3))+"\t\t"
						+flightInfo.getString(4)+"\t"+flightInfo.getString(5)+"\t"+flightInfo.getInt(6));
			}	
			System.out.println("--------------------------------------------------------------------------------------------------------------------------");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
