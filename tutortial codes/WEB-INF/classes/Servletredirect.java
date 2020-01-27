package assignment1.servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.*;

public class Servletredirect extends  HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException
	{
		reponse.setContentType("text/html");
		PrintWriter pw=reponse.getWriter();
           
		request.setAttribute("name","mikado");
		reponse.sendRedirect("http://localhost:8080/harish/s13");
	}

};