<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<title>Pokedex</title>
</head>
<body>
	<h1>Pokedex</h1>
	<p>${state}</p>

	<div class="poke-container">
		<c:forEach items="${pokemonList}" var="pokemon">
			<div class="poke-card">
				<p><c:out value="${pokemon.name}" /></p>
				<img src="${pokemon.img}" width="100" height="100">
			</div>
		</c:forEach>

	</div>

</body>
</html>
