<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>

    <div class="content">
        <div class="header">
           
<!-- dashbord page-->
           
                    <ul class="breadcrumb">
            <li><a href="index.html">Home</a> </li>
            <li class="active">Dashboard</li>
        </ul>

        </div>
        <div class="main-content">
        <div class="dialog">
         <div class="panel panel-default">
        <p class="panel-heading no-collapse">Add New User</p>
        <div class="panel-body">
            <form action="UserControler">
                <div class="form-group">
                    <label>First Name</label>
                    <input type="text" class="form-control span12" name="fname">
                </div>
                <div class="form-group">
                    <label>Email Address</label>
                    <input type="text" class="form-control span12" name="email">
                </div>
                <div class="form-group">
                    <label>Username</label>
                    <input type="text" class="form-control span12" name="username">
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" class="form-control span12" name="password">
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-primary pull-right" name="adddata"></a>
                  </div>
                </div>
                    <div class="clearfix"></div>
            </form>
        </div>
    </div>

</div>
<%@include file="footer.jsp" %>
