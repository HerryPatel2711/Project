package DB_Utility;
import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database_connection // Database Connection Class
{
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver"); // Driver for connection database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");/
		/connection url connection
		System.out.prrintln("Done");
		return conn; //return connection object
		
	}

}
