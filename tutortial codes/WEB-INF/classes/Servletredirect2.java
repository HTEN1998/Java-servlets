package assignment1.servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.*;

public class Servletredirect2 extends  HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException
	{
		reponse.setContentType("text/html");
		PrintWriter pw=reponse.getWriter();
           
		String s=(String)request.getAttribute("name");
		pw.println("Hello "+s);
	}

};