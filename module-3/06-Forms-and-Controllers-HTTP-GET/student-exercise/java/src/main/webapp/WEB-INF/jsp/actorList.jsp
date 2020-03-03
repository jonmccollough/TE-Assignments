<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>
<!DOCTYPE html>
<%@include file="common/header.jspf"%>

<form method="GET" action="actorListSearch">

    <label for="last_name">Actor's Lastname: </label>
	<input type="text" name="last_name"/>
	
    <input type="submit">
</form>
<table class="table">
<tr>
<th>w</th>
</tr>
<c:forEach items="${actors}" var="actor">
<tr>
<td>
 
 <c:out value= "${actor.firstName} ${' ' }${actor.lastName}" />

</tr>
</c:forEach>
</table>
<%@include file="common/footer.jspf"%>