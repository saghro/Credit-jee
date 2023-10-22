<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> JSP Pages</title>
</head>
<body>
    <form>
      Entrez Votre Nom:<input type="text" name ="tnom"/><br>
      Entrez Votre prenom:<input type="text" name ="tprenom"/><br>
      Quelles sont les villes que vous avez visite? <br>
       <select multiple size="6" name="listv">
           <option value= "Rabat">Rabat</option>
           <option value = "casablanca">casablanca</option>
           <option value = "Fes">Fes</option>
           <option value = "Tanger">Tanger</option>
           <option value = "Tinghir">Tinghir</option>
       </select><br>
       s'il ya d'autre villes , merci de les indique :
       <br>
       <textarea name = "listv2" rows = "4" cols = "50"></textarea>

    </form>
</body>
</html>