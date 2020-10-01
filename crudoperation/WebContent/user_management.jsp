<%@page import="Method_Utility.Method_utility"%>
<%@page import="Bean.UserBean"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>

<div class="content">
        <div class="header">
            
            <h1 class="page-title">Users</h1>
                    <ul class="breadcrumb">
            <li><a href="index.html">Home</a> </li>
            <li class="active">Users</li>
        </ul>

        </div>
        <div class="main-content">
            
<div class="btn-toolbar list-toolbar">
    <a href="add_new.jsp" class="btn btn-primary"><i class="fa fa-plus"></i> New User</a>
   <div class="btn-group">
  </div>
</div>
<table class="table">
  <thead>
    <tr>
      <th style="width: 5dp;">ID</th>
      <th style="width: 10dp;">First Name</th>
      <th style="width: 10dp;">Last Name</th>
      <th style="width: 10dp;">Username</th>
      <th style="width: 10dp;">Password</th>
      <th style="width: 15dp;">Operation</th>
    </tr>
  </thead>
  <tbody>
  <form  name="frm">
  <%ArrayList<UserBean> uobj = Method_utility.userList();
  for(UserBean u : uobj)
  {  
  %>
    <tr>
      <td><%=u.getId() %></td>
      <td><%=u.getName() %></td>
      <td><%=u.getEmail() %></td>
      <td><%=u.getUsername() %></td>
      <td><%=u.getPassword() %></td>
      
          <td>
         <button type="submit" name="update" onclick="updateRecord('<%=u.getId() %>')" >Update</button>
          <button type="submit" name="delete" onclick="deleteRecord('<%=u.getId() %>')">Delete</button>
      </td>
    </tr>
    <%} %>
  </tbody>
  </form>
</table>


    </div>
    
</div>
<script type="text/javascript">

function deleteRecord(no)
{
	var f=document.frm;
	alert(no);  
	f.method="post";
	f.action='/crudoperation/UserControler?id='+no;
	f.submit();
}

function updateRecord(no)
{
	var f=document.frm;
	alert(no);  
	f.method="post";
	f.action='/crudoperation/update_data.jsp?id='+no;
	f.submit();
}

</script>

<%@include file="footer.jsp" %>