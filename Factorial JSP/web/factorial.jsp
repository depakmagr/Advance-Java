<%-- 
    Document   : factorial
    Created on : Jul 2, 2023, 7:33:18 AM
    Author     : magar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Factorial JSP</title>
    </head>
    <body>
        <%!
            int n, result;
            String str;
            int fact(int n)
            {
                if(n==0)
                    return 1;
                else
                    return n*fact(n-1);
            }
        %>
        <% 
            str = request.getParameter("val");
            n = Integer.parseInt(str);
            result = fact(n);
        %>
        <b>Factorial Calculation !!!
            <b> <%= result %>
        
    </body>
</html>
