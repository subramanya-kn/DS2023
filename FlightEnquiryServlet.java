package com.ds;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/flightEnquiry")
public class FlightEnquiryServlet extends HttpServlet {
	
    public FlightEnquiryServlet() {
        super();
		System.out.println("FlightEnquiryServlet() called....");

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() called....");
		
		String sourceCity = request.getParameter("sourceCity");
		String targetCity = request.getParameter("targetCity");
		String journeyDate = request.getParameter("journeyDate");
		
		System.out.println("journey Date :"+journeyDate);
		
//		LocalDate journeyDateConverted = LocalDate.parse(journeyDate)
		
		PrintWriter pw = response.getWriter();
		pw.println("<h1>Searching a flight for you from "+sourceCity+ " to "+targetCity+" on "+journeyDate+"</h1>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() called....");
		doGet(request, response);
	}

}
