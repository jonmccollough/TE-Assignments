<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="title" value="Favorite Season" />
</c:import>

<form method="POST" action="Page3">
	<label>What is your favorite Season?</label>
	<input type="text" name="season">
	<button type="submit">Next >>></button>
</form>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />

