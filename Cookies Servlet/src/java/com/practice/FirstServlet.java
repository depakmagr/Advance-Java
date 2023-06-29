/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice;

/**
 *
 * @author magar
 */
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;  

  
  
public class FirstServlet extends HttpServlet {  
  
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response){  
    try{  
  
    response.setContentType("text/html");  
        try (PrintWriter out = response.getWriter()) {
            String n=request.getParameter("userName");
            out.print("Welcome "+n);
            
            Cookie ck=new Cookie("uname",n);//creating cookie object
            response.addCookie(ck);//adding cookie in the response
            
            //creating submit button
            out.print("<form action='servlet2'>");
            out.print("<input type='submit' value='go'>");
            out.print("</form>");
        }  
  
        }catch(Exception e){System.out.println(e);}  
  }  
}  
