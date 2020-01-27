package assignment1.servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.*;

public class Servletforward extends  HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
           
		request.setAttribute("name","mikado");
	    pw.println("Before");
		//request.getRequestDispatcher("/s13").forward(request,response);
		request.getRequestDispatcher("/s13").include(request,response);
        pw.println("After");
	}

};