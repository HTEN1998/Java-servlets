package assignments.servlets;
import javax.servlet.*;
import java.io.*;

public class Servlet1 extends GenericServlet
{
	public void service (ServletRequest resquest,ServletResponse reponse) throws ServletException, IOException
	{
		reponse.setContentType("text/html");
		PrintWriter pw=reponse.getWriter();
		pw.println("<b>Hello client</b>");
	}
};