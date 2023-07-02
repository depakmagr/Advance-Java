<!-- 
    Document   : Welcome
    Created on : Jun 27, 2023, 7:27:52 AM
    Author     : magar
-->


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- Scriptlet Tag -->
        <% 
            String name = request.getParameter("uname");
            out.print("Welcome " + name);
        %>

        <!-- Expression Tag -->
        <%=
            "Welcome" + request.getParameter("uname")
        %>
        
        <!--Declarative Tag --> 
        <%! int data=50; %>
        <%= "value of variable is :" + data %>
        
        
        <%!
            int cube(int n){
            return n*n*n;
        }
        <%= 
            "Cube of 3 is:"+ cube(3)
        %>
        %>

 
    </body>
</html>


       
        
        