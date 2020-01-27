package cart;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class FetchItemsServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException
	{
		reponse.setContentType("text/html");
		PrintWriter pw=reponse.getWriter();
		try
		{
			ItemDAO dao=new ItemDAO();
			Collection items=dao.getAllItems();
			request.setAttribute("items",items);
			request.getRequestDispatcher("Cataloq.jsp").forward(request,reponse);
		}
		catch(Exception e)
		{
			pw.println(e);
		}
	}
};