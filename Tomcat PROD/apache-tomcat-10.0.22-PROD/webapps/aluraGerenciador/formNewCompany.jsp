<%@ page language="java" contentType="text/html; cahrset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList, br.com.panvel.gerenciador.servlet.Company, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/new-company" var="linkServletNewCompany"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar Empresa</title>
</head>
<body>



	<form action="${linkServletNewCompany}" method="post">
	
		Nome: <input type="text" name="name"/>
		<br>
		Data de Abertura: <input type="date" name="openDate"/>
		<br>
		<input type="submit"/>
		
	</form>
	
	<p><a href="/aluraGerenciador/list-companies">Listar</a></p>
	
</body>
</html>