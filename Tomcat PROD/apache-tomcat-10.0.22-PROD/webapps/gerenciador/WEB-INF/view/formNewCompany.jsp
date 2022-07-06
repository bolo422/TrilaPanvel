<%@ page language="java" contentType="text/html; cahrset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList, br.com.panvel.gerenciador.modelo.Company, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="entry?action=NewCompany" var="linkServletNewCompany"/>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles.css">
<title>Cadastrar Empresa</title>
</head>
<body>
<c:import url="logout.jsp"/>


	<form action="${linkServletNewCompany}&" method="post">
	
		Nome: <br/><input type="text" name="name" required>
		<br>
		Data de Abertura: <br/><input type="date" name="openDate" required>
		<br>
		<input class="isubmit" type="submit" value="Submit">
		
	</form>
	
	<p><a href="entry?action=ListCompanies">Listar</a></p>
	
</body>
</html>