package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Bean.UserBean;
import Bean.employeebean;
import Method_Utility.Method_utility;

/**
 * Servlet implementation class UserControler
 */
@WebServlet("/UserControler")
public class UserControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	// Handling GET request from HTTP
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		if(request.getParameter("adddata")!=null)
		{
			
			UserBean Uobj = new UserBean(request.getParameter("fname"),request.getParameter("email"),request.getParameter("username"),request.getParameter("password"));
			
			Method_utility.insert_user_records(Uobj);
			response.sendRedirect("user_management.jsp");
		}
	
		if(request.getParameter("delete")!=null)
		{
			System.out.println( request.getParameter("id"));
			Method_utility.delete_user(Integer.parseInt(  request.getParameter("id")));
			response.sendRedirect("user_management.jsp");
		}
	
		if(request.getParameter("update")!=null)
		{
	
			UserBean Uobj = new UserBean(Integer.parseInt(request.getParameter("id")),request.getParameter("fname"),request.getParameter("email"),request.getParameter("username"),request.getParameter("password"));
			Method_utility.update_user_records(Uobj);
			response.sendRedirect("user_management.jsp");
		}
	
	
		
		if(request.getParameter("update_data")!=null)
		{
			int id= Integer.parseInt( request.getParameter("id"));
			//Method_utility.delete_user(Integer.parseInt(  request.getParameter("id")));
			ArrayList<UserBean> u1 = Method_utility.userList_by_id(id);
			request.setAttribute("udata", u1);
			 RequestDispatcher rs = request.getRequestDispatcher("/update_data.jsp");
			 rs.forward(request, response);
			//response.sendRedirect("update_data.jsp");
		}
	
	}

		
		
		
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
