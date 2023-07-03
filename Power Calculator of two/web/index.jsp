<%-- 
    Document   : index
    Created on : Jul 3, 2023, 7:32:34 AM
    Author     : magar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Power of 2</title>
    </head>
    <body>
        <table border="2" align="center">
            <th>Exponent</th>
            <th>2^Exponent</th>
            <%for(int i=0; i<=10; i++){ %>
            <tr>
                <td><%=i%></td>
                <td><%=Math.pow(2,i)%></td>
            </tr>
            <%} %>
        </table>
    </body>
</html>
