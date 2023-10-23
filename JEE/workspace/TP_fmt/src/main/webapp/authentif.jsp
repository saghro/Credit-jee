<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <fmt:setLocale value="${param.listL}" scope="session" />
    <c:set var = "lg_choisie" value="${param.listL}"/>
    <fmt:setBundle basename="com.test.fichier" />
    <fmt:message key="msg1" />
    <br>
    <form>
        <select name="listL" onchange="submit()">
            <option value="fr" ${lg_choisie == 'fr'?'selected' :''}> Français </option>
            <option value="en" ${lg_choisie == 'en'?'selected' :''}> Anglais </option>
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
