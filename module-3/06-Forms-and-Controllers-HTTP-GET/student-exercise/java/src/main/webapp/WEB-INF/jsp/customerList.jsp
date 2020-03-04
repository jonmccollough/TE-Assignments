<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>


<form method="GET" action="searchCustomers">
	<label for="customerList">Customer Search: </label>
	
	<input type="text" name="search" style="position: inline-block;" /> 

		<select name="sort" id="sort" style="position: inline-block;">
			<option value="last_name">Last Name</option>
			<option value="email">email</option>
			<option value="active">active</option>
		</select>

	<input type="submit" value="search">
</form>

<table class="table">
	<tr>

		<th>Name</th>
		<th>Email</th>
		<th>Active</th>
	</tr>
	
	<c:forEach items="${customers}" var="customer">
		<tr>
			<td>
			<c:out value="${customer.firstName}" />
			<c:out value= "${customer.lastName}" />
			</td>
			
			<td><c:out value="${customer.email}" /></td>
			
			<td><c:out value="${customer.active}" /></td>	
		</tr>
	</c:forEach>
</table>


<%@include file="common/footer.jspf"%>