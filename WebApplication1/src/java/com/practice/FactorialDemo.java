/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;

/**
 *
 * @author magar
 */
public class FactorialDemo extends HttpServlet{
    int f = 1;
    private int n;
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws 
            IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>value of n:="+n+"</h1>");
        int n = Integer.parseInt(req.getParameter("fno"));
        out.println("<h1>value of n:="+n+"</h1>");
        for(int i = 1; i<=n; i++){
            if(n==0)
                break;
            f=f*i;
        }
        out.println("<h1>Factorial of "+n+"="+f+"</h1>");
    }   
}
