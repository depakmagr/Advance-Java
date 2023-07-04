<%-- 
    Document   : index
    Created on : Jul 4, 2023, 7:40:46 AM
    Author     : magar
--%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sine Table</title>
    </head>
    <body>
        
    <center> 
        <%!
            int degrees[] = {0, 15, 30, 45, 60, 75, 90};
            double sin_number;
            double cos_number;
            String sinresult, cosresult;
            %>
            <table border="2"align="center">
                   <th>Degree</th>
                   <th>Sine Value</th>
                   <th>Cos Value</th>
                <%
                    for(int i=0;i<degrees.length;i++){
                    sin_number = Math.sin(Math.toRadians(degrees[i]));
                    cos_number = Math.cos(Math.toRadians(degrees[i]));
                    sinresult = String.format("%.2f", sin_number);
                    cosresult = String.format("%.2f", cos_number);
                    %>
                <tr>
                    <td><%=degrees[i]%></td>
                    <td><%=sinresult%></td>
                    <td><%=cosresult%></td>
                </tr>
                <%}%>
            </table>
    </center>
    </body>
   
</html>