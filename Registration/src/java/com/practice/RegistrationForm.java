/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author magar
 */
public class RegistrationForm extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name="", password="", email="", gender="", course="", terms="";
        
        name = req.getParameter("name");
        password = req.getParameter("pwd");
        email = req.getParameter("email");
        gender = req.getParameter("gender");
        course = req.getParameter("course");
        terms = req.getParameter("terms");
        
        if ("true".equals(terms)){
            out.println("<h1>Name: "+name+"</h1>");
            out.println("<h1>Password: "+password+"</h1>");
            out.println("<h1>Email: "+email+"</h1>");
            out.println("<h1>Gender: "+gender+"</h1>");
            out.println("<h1>Course: "+course+"</h1>"); 
            out.println("<h1>Terms & Condition: True</h1>");

        }else{
            out.println("<h1>Please check your requirement!!</h1>");
        }
    }
}
