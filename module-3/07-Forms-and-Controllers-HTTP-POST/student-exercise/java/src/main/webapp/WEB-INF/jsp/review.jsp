<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>Submit a Review</title>

<body>
	<div>
		<h1>Please leave your review</h1>
		<form action="review" method="POST">
			<div class="formGroup">
				<label for="username">Username: </label>
				<input type="text" name="username"/>
			</div>
			<div class="formGroup">
				<label for="rating">Rating: </label>	
			
				<select name="rating" id="rating">
					<option value="1">1 Star</option>
					<option value="2">2 Star</option>
					<option value="3">3 Star</option>
					<option value="4">4 Star</option>
					<option value="5">5 Star</option>
				</select>
				</div>	
			<div class="formGroup">		
					<label for="title">Review Title: </label>
					<input type="text" name="title" id="title" />
			</div>	
			<div class="formGroup">		
					<label for="text">Review: </label>
					<input type="text" name="text" id="text" size="80" />
				</div>
				<div class="formGroup">
					<input type="submit" value="Submit Review" />
				</div>		
			</form>
		</div>
</body>
