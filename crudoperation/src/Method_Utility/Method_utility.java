package Method_Utility;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;
import Bean.UserBean;
import DB_Utility.Database_connection;


public class Method_utility
{
	
	//registration method user
	public static void insert_user_records(UserBean Uobj)
	{
		 Connection conn;
		try {
			conn = Database_connection.getConnection();
			PreparedStatement pr = conn.prepareStatement("insert into user_data(`fname`, `email`, `username`, `password`) values(?,?,?,?)");
		pr.setString(1,Uobj.getName());
		pr.setString(2,Uobj.getEmail());
		pr.setString(3,Uobj.getUsername());
		pr.setString(4,Uobj.getPassword());
		
		
			pr.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
	
	public static void update_user_records(UserBean Uobj)
	{
		 Connection conn;
		try {
			conn = Database_connection.getConnection();
			PreparedStatement pr = conn.prepareStatement("update user_data set fname=?,email=?,username=?,password=? where id = ?");
		pr.setString(1,Uobj.getName());
		pr.setString(2,Uobj.getEmail());
		pr.setString(3,Uobj.getUsername());
		pr.setString(4,Uobj.getPassword());
		pr.setInt(5, Uobj.getId());
		
		
			pr.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
	
	
	//Display User List method
		public static ArrayList<UserBean> userList()
		{
			ArrayList<UserBean> UserList = new ArrayList<>();
			
			 Connection conn;
			 ResultSet rs = null;
			 UserBean userObj = null;
			try {
				conn = Database_connection.getConnection();
				PreparedStatement pr = conn.prepareStatement("select * from user_data");
				
				rs = pr.executeQuery();
				while (rs.next())
				{
					userObj = new UserBean();
					userObj.setId(rs.getInt(1));
					userObj.setName(rs.getString(2));
					userObj.setEmail(rs.getString(3));
					userObj.setUsername(rs.getString(4));
					userObj.setPassword(rs.getString(5));
					UserList.add(userObj);
				}
				
				

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			return UserList;
		}


		public static ArrayList<UserBean> userList_by_id(int id)
		{
			ArrayList<UserBean> UserList = new ArrayList<>();
			
			 Connection conn;
			 ResultSet rs = null;
			 UserBean userObj = null;
			try {
				conn = Database_connection.getConnection();
				PreparedStatement pr = conn.prepareStatement("select * from user_data where id = ?");
				pr.setInt(1, id);
				rs = pr.executeQuery();
				while (rs.next())
				{
					userObj = new UserBean();
					userObj.setId(rs.getInt(1));
					userObj.setName(rs.getString(2));
					userObj.setEmail(rs.getString(3));
					userObj.setUsername(rs.getString(4));
					userObj.setPassword(rs.getString(5));
					UserList.add(userObj);
				}
				
				

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			return UserList;
		}

		
		public static void delete_user(int id)
		{
					
			 Connection conn;
			try {
				conn = Database_connection.getConnection();
				PreparedStatement pr = conn.prepareStatement("delete from user_data where id = ?");
				pr.setInt(1, id);
				pr.executeUpdate();
						} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			
		}

	}

