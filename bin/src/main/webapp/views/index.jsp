<%@ page isELIgnored="false" %><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Marhabane bik</h3>
	<c:forEach items="${nongos}" var="nongo" varStatus="Status">

	 	${nongo.getPrenomNom()}
	 	${nongo.getAdress}
	</c:forEach>



	<form action="/addPerson" method="post">
		<label for="prenomNom" >Nom Prenom</label>
		<input type="text" name="prenomNom" id="prenomNom">
		<label for="adress" >Mot de passe</label>
		<input type="text" name="adress" id="adress">
		<label for="phoneNumber" >Telephone</label>
        <input type="number" name="phoneNumber" id="phoneNumber">
		<button type="submit" > Soumettre</button>
	</form>
</body>
</html>