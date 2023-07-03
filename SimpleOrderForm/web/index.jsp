<%-- 
    Document   : index
    Created on : Jul 3, 2023, 7:48:07 AM
    Author     : magar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>A Catalog Order Form</title>
    </head>
    <body>
        <h1 align="center">A Simple Order Form</h1>
        <%! 
            String item[] = {"DVD", "CD", "Diskette"};
            double price[] = {19.99, 12,99, 1.99};
            int quantity[] = {2, 9, 24};
        %>
        
        
        <table align="center" bgcolor="lightgray" border="1" width="75%">
            <tr>
                <td>Item</td>
                <td>Price</td>
                <td>Quantity</td>
                <td>Total Price</td>
            </tr>
            
            <% for(int i=0; i<3; i++) { %>
            <tr>
                <td><%= item[i] %></td>
                <td><%= price[i] %></td>
                <td><%= quantity[i] %></td>
                <td><%= price[i]*quantity[i] %></td>
            </tr>
            <% }%>
        </table>
    </body>
</html>
