<%@ page isELIgnored="false" %><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet">

<title>NongoYiApp</title>
</head>
<body>

	<h3>Liste des Nongos </h3>
	
<div class="container">


<table class="table table-hover">
    <thead class="thead-dark">
        <tr>
            <th>Prenom & nom </th>
            <th>Adresse </th>
            <th>Telephone </th>
            <th>Action </th>
        </tr>
    </thead>
    <tbody>
    <c:if test="${!empty nongos}">
    	<c:forEach items="${nongos}" var="nongo" varStatus="Status">
        <tr>
            <td>${nongo.getPrenomNom()}</td>
            <td>${nongo.getAdress()}</td>
            <td>${nongo.getPhoneNumber()}</td>
            <td><a href="#" class="btn btn-danger">Supprimer </a><a href="#" class="btn btn-warning">Modifier</a></td>
        </tr>
        </c:forEach>
       </c:if>
    </tbody>
</table>

	
</div>
<div class="container">
	<form action="/addPerson" method="post">
		<label for="prenomNom" >Nom Prenom</label>
		<input type="text" name="prenomNom" id="prenomNom">
		<label for="adress" >Mot de passe</label>
		<input type="text" name="adress" id="adress">
		<label for="phoneNumber" >Telephone</label>
        <input type="tel" name="phoneNumber" id="phoneNumber">
		<button type="submit" > Soumettre</button>
	</form>
</div>
</body>
</html>