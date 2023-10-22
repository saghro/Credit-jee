<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%
      out.println("votre nom complet est :" +request.getParameter("tnom"));
      out.print(request.getParameter("tprenom")+"<br>");
      String vs [] = request.getParameterValues("listv");
      for (String x:vs){
    	  out.print(x+",");
      }

    
    %>
</body>
</html>