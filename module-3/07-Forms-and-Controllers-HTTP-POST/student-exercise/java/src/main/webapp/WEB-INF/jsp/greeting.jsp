<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Hello Spring MVC</title>
	</head>
	<body style="background:lightgrey">
		<h1>Welcome to the official site for "Squirrel Parties for Dummies" by Craig Castelaz <c:out value="${param.name}" />!</h1>

			<div id="main_content">
				<h1>Do you want to be more Awesome?</h1>
				<p>Of course you do!  Everyone wants more <strong>awesomeness</strong> in their life!  Well, guess what you lucky stiff?  Your desire for more awesomeness is about to be <strong>fulfilled</strong>!  Just do the following:</p>
				<ol>
				<li>Grab your mouse (or other pointing device of choice)</li>
				<li>Assure yourself that you deserve to <strong>be more awesome</strong></li>
				<li><strong>Click the green button</strong></li>
				<li>Provide your name and email address and we'll let you know when it's time to <strong>unveil the awesomeness</strong></li>
				</ol>
			
			<a href=" _____ FILL THIS IN WITH LINK ________"><img alt="Button NAME " src="img/button.png"></a>
		</div>
		
	</body>
</html>