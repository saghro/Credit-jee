<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>
    <body>

        <c:if test="${ !empty nom }"><p><c:out value="Bonjour, vous vous appelez ${ nom }" /></p></c:if>
        
        <form method="post" action="bonjour">
            <p>
                 <label for="login">Nom : </label>
                 <input type="text" name="login" id="login" />
            </p>
            <p>
                 <label for="pass">Mot de Passe : </label>
                 <input type="password" name="pass" id="pass" />
            </p>
             
            <input type="submit" />
        </form>
        
    </body>
</html>