<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    code avec java : <br>
    <%
      out.println("votre nom complet est :" +request.getParameter("tnom"));
      out.print(request.getParameter("tprenom")+"<br>");
      String vs [] = request.getParameterValues("listv");
      for (String x:vs){
    	  out.print(x+",");
      }
    %>
    <br>
    code avec JSTL : <br>
    <b>le nom complet saisir est :<c:out value="${param.tnom }" />
       <c:out value="${param.tprenom }" /></b><br>
       les villes visite sont : <br>
     <c:forEach var ="v1" items="${paramValues.listv }">
           <c:out value="${v1}"/>
     </c:forEach>  
</body>
</html>