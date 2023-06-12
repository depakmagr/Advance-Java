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
public class CalcServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        int x,y;
        String str="";
        x = Integer.parseInt(req.getParameter("txtfno"));
        y = Integer.parseInt(req.getParameter("txtsno"));
        
        str = req.getParameter("operation");
        if(str.equals("add"))
            out.println("<h1>Result of Addition:"+(x+y)+"</h1>");
        else if(str.equals("sub"))
            out.println("<h1>Result of Subtraction:"+(x-y)+"</h1>");
        else if(str.equals("div"))
            out.println("<h1>Result of Division:"+(x/y)+"</h1>");
        else if(str.equals("mul"))
            out.println("<h1>Result of Multiplication:"+(x*y)+"</h1>");
        else
            out.println("<h1>Result of Modulation:"+(x%y)+"</h1>");
    }
    
}
