<%@ page import="java.util.*" %>
<%= new java.util.Date() %>
<%-- <%= new Date() %> --%> 
<!-- html comment -->

<%--
<%@ include file="header.html" %>
 <% if(Math.random()<0.5)
      {
		   out.println("Hi");
	  }
	  else
	  {
		  out.println("Bye");
	  }
%>

<% if(Math.random()<0.5) { %>
<b>hi</b>
<% } else { %>
<b>bye</b>
<% } %>

--%>

<%! int count;
  public int getCount()
  {
	  return count++;
  }
  %>
  <br>
  <% out.println("count="+getCount()); %>