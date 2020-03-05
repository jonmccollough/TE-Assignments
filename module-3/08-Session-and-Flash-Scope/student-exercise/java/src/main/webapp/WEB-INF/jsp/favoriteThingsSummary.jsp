<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
<meta charset="UTF-8">
<title>Summary</title>
</head>
<body>

<h2>Your Favorite Things</h2>

<div class='summaryBlock'>

	<div class='summaryElement'>
		<span class='summaryElementHeader'>Favorite Color: </span>
		<c:out value="${color}" />
	</div>

	<div class='summaryElement'>
		<span class='summaryElementHeader'>Food: </span>:
		<c:out value="${food}" />
	</div>

	<div class='summaryElement'>
		<span class='summaryElementHeader'>Season: </span>:
		<c:out value="${season}" />
	</div>

</div>

</body>
