<%@page import="Bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Method_Utility.Method_utility"%>
<%@include file="header.jsp" %>

    <div class="content">
        <div class="header">
                    <ul class="breadcrumb">
            <li><a href="index.html">Home</a> </li>
            <li class="active">Dashboard</li>
        </ul>

        </div>
        <div class="main-content">
        <div class="dialog">
         <div class="panel panel-default">
        <p class="panel-heading no-collapse">Update Record</p>
        <div class="panel-body">
            <form action="UserControler">
            <%
            int id =Integer.parseInt( request.getParameter("id"));
            
           // ArrayList<UserBean> u1 = (ArrayList<UserBean>) request.getAttribute("udata");
            //System.out.println(u1);
            ArrayList<UserBean> u1 = Method_utility.userList_by_id(id);
  for(UserBean u : u1)
  {  
  %> 
                <div class="form-group">
                    <label>Id</label>
                    <input type="text"  value="<%=u.getId() %>" class="form-control span12" name="id">
                </div>
                <div class="form-group">
                    <label>Name</label>
                    <input type="text" value="<%=u.getName() %>" class="form-control span12" name="fname">
                </div>
                <div class="form-group">
                    <label>Email</label>
                    <input type="text" value="<%=u.getEmail() %>" class="form-control span12" name="email">
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" value="<%=u.getUsername() %>" class="form-control span12" name="username">
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" value="<%=u.getPassword() %>" class="form-control span12" name="password">
                </div>
                <div class="form-group">
                    <button type="submit" name="update" class="btn btn-primary pull-right" >Update</button>
                  </div>
                </div>
                    <div class="clearfix"></div>
                    <%} %>
            </form>
        </div>
    </div>
    </div>

<%@include file="footer.jsp" %>