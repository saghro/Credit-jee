<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <fmt:setLocale value="${param.listL}" scope="session" />
    <fmt:setBundle basename="com.test.fichier" />
    <fmt:message key="msg1" />
    <br>
    <form>
        <select name="listL" onchange="submit()">
            <option value="fr"> Français </option>
            <option value="en"> Anglais </option>
        </select>
    </form>
    <br>
    <br>
    <form action="accueil.jsp">
        <input type="submit" value="<fmt:message key='msg2' />" />
        <input type="reset" value="<fmt:message key='msg3' />" />
    </form>
</body>
</html>
