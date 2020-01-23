/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Phillip Obiora
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String calc = request.getParameter("calc");
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        // check if text boxes are null or empty
        if(first == null || first.equals("") ||
                second == null || second.equals("")){
            request.setAttribute("result", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        }
        // check if textboxes contains characters
        try {
            int f = Integer.parseInt(first);
            int s = Integer.parseInt(second);
        } catch (NumberFormatException nfe) {
             request.setAttribute("message", "Invalid");
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        }
        // check for button clicked and calculate accordingly
        int f = Integer.parseInt(first);
        int s = Integer.parseInt(second);
        
        int total = 0;
        if(calc.equals("+")){
            total = f + s;
            request.setAttribute("result", total);
        }else if(calc.equals("-")){
            total = f - s;
            request.setAttribute("result", total);
        }else if(calc.equals("*")){
            total = f * s;
            request.setAttribute("result", total);
        }else if(calc.equals("%")){
            total = f % s;
            request.setAttribute("result", total);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

}
