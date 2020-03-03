<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Films List" />

<%@include file="common/header.jspf"%>


<form method="GET" action="filmListSearch">
	<label for="filmList">Film Search: </label> <label for="last_name">Minimum
		Length: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp Maximum Length: &nbsp
		&nbsp &nbsp &nbsp &nbsp Genre: </label> <input type="text" name="minLength"
		style="position: inline-block;" /> <input type="text"
		name="maxLength" style="position: inline-block;" />
	<div class="formInputGroup">
		<select name="genre" id="genre" style="position: inline-block;">
			<option value="Action">Action</option>
			<option value="Animation">Animation</option>
			<option value="Children">Children</option>
			<option value="Classics">Classics</option>
			<option value="Comedy">Comedy</option>
			<option value="Documentary">Documentary</option>
			<option value="Drama">Drama</option>
			<option value="Family">Family</option>
			<option value="Foreign">Foreign</option>
			<option value="Games">Games</option>
			<option value="Horror">Horror</option>
			<option value="Music">Music</option>
			<option value="New">New</option>
			<option value="Sci-Fi">Sci-Fi</option>
			<option value="Sports">Sports</option>
			<option value="Travel">Travel</option>
			<option value="Drama">Drama</option>
		</select>
	</div>
	<input type="submit" value="genre">

</form>

<table class="table">
	<tr>

		<th>Title</th>
		<th>Description</th>
		<th>Release Year</th>
		<th>Length</th>
		<th>Rating</th>

	</tr>
	<c:forEach items="${films}" var="film">
		<tr>
			<td><c:out value="${film.title} " /></td>
			<td><c:out value="${film.description}" /></td>
			<td><c:out value="	${film.releaseYear}" /></td>
			<td><c:out value="	${film.length}" /></td>
			<td><c:out value="	${film.rating} " /> </td>
			
		</tr>
	</c:forEach>
</table>







