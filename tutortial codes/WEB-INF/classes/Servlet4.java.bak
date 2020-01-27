package assignments.servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.*;

public class Servlet4 extends  HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException
	{
		reponse.setContentType("text/html");
		PrintWriter pw=reponse.getWriter();
		
		Cookie c[]=request.getCookies();
		if(c!=null)
		{
			for(Cookie cu:c)
			{
				String s=cu.getName();
				if(s.equals("mycookie"))
				{
					String s1=cu.getValue();
					pw.println("Hi "+s1);
				}
			}
		}
			else
			{ pw.println("No cookies found"); }
	}

}