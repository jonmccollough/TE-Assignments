<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Welcome to Squirrel World</title>
</head>
<body style="background: lightgrey">
	<h1>
		Welcome	to the official site for "Squirrel Parties for Dummies" by Craig Castelaz!
	</h1>

	<img src="img/forDummies.png"
		alt="Squirrel Parties for Dummes Book Art"/>


	<div id="main_content">
		<h2>Enjoyed the book?</h2>
		<h2>Hated the book? I don't care I still got your money.</h2>
		<p>Leave your love/hate comments in a review</p>

		<form method="GET" action="review">
		<input type="submit" value="Submit a Review"/>
		</form>
	</div>
	<div>
		<c:forEach var="review" items="${reviews}">
			<c:out value="${review.title}" />
			<br>
			<c:out value="${review.username}" />
			<br>
			<c:if test = "${review.rating == 1}">
         	<img src="img/star.png">
    		</c:if>
			<c:if test = "${review.rating == 2}">
         	<img src="img/star.png"><img src="img/star.png">
    		</c:if>
    		<c:if test = "${review.rating == 3}">
         	<img src="img/star.png"><img src="img/star.png"><img src="img/star.png">
    		</c:if>
    		<c:if test = "${review.rating == 4}">
         	<img src="img/star.png"><img src="img/star.png"><img src="img/star.png"><img src="img/star.png">
    		</c:if>
    		<c:if test = "${review.rating == 5}">
         	<img src="img/star.png"><img src="img/star.png"><img src="img/star.png"><img src="img/star.png"><img src="img/star.png">
    		</c:if>
			<br>
			<c:out value="${review.dateSubmitted}" />
			<br>
			<c:out value="${review.text}" />
			<br>
			<br>
			<br>
		</c:forEach>
	</div>
</body>
</html>