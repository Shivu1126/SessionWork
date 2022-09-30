package flightTicketReservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionClass {

	public Statement jdbcConnection() throws ClassNotFoundException,SQLException
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flightticketreservation"
				+ "?useSSL=false&serverTimezone=Asia/Shanghai","root","0001");
		
		return connection.createStatement();
	}

}
