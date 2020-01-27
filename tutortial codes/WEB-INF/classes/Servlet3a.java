package assignments.servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.*;

public class Servlet3a extends  HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException
	{
		reponse.setContentType("text/html");
		PrintWriter pw=reponse.getWriter();
		String s=request.getParameter("name");
		Cookie c=new Cookie("Mycookie",s);
		c.setMaxAge(1000);
		reponse.addCookie(c);
		pw.println("Cookie added to your machine");
	}

};