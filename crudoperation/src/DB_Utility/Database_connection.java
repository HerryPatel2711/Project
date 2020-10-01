package DB_Utility;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database_connection 
{
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver"); // Driver for connection database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");//connection url connection
		return conn; //return connection object
		
	}

}
