package assignments.servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.*;

public class Servletsession extends  HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException
	{
		reponse.setContentType("text/html");
		PrintWriter pw=reponse.getWriter();
		
		HttpSession hs=request.getSession();
		String s=(String)hs.getAttribute("count");
		
		if(s==null)
		{
			pw.println("This your first vist");
			hs.setAttribute("count","1");
			hs.setAttribute("date",new Date());
		}
		else
		{
           int i =Integer.parseInt(s);
		   i++;
		   pw.println("This is your vist no:"+i);
		   Date d=(Date)hs.getAttribute("date");
		   pw.println("Your last vist was on "+d);
		   hs.setAttribute("count",String.valueOf(i));
		   hs.setAttribute("date",new Date());
		}
	}

};