<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product List View" />
</c:import>

<div id="card-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		<%-- Modify the baseRoute to apply filters to the current route. --%>
		<c:param name="baseRoute" value="/products" />
	</c:import>

	<div class="main-content">
		<!-- Container for Sorting Choices
         
         Each link should take the user to this current page and use any combination of the following
         querystring parameters to sort the page:
            - sortOrder (string) - PriceLowToHigh,PriceHighToLow,RatingHighToLow
    	-->
		<div id="sorting-options">
			<h3>Sort By</h3>
			<ul>
				<li><a href="?sortOrder=PriceLowToHigh">Price - Low to High</a></li>
				<li><a href="?sortOrder=PriceHighToLow">Price - High to Low</a></li>
				<li><a href="?sortOrder=RatingHighToLow">Rating - High to Low</a></li>
			</ul>
		</div>

		<!-- Container for all of the Products -->
		<!-- The list of products is available using the `products` variable -->
		<div id="grid">

			<!-- 
			The following HTML shows different examples of what HTML could be rendered based on different rules. 
			For purposes of demonstration we've written it out so you can see it when you load the page up. 
			-->

			<!-- Standard Product -->

			<c:forEach var="product" items="${products}">
				<div class="tile ${product.remainingStock <= 0 ? 'sold-out' : ''}">

					<c:choose>
						<c:when test="${product.remainingStock <= 0}">
							<span class="banner">Sold Out</span>
						</c:when>

						<c:when test="${product.topSeller}">
							<span class="banner top-seller">Top Seller!</span>
						</c:when>
					</c:choose>
					<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
					<a class="product-image"
						href="<c:url value="products/detail?id=${product.id}"/>"> <img
						src="<c:url value="/images/product-images/${product.imageName}"/>" />
					</a>
					<div class="details">
						<p class="name">${product.name}</p>

						<!-- .filled will make the star solid -->
						<div class="rating">
							<c:forEach begin="1" end="5" var="i">
								<span class="${i <= product.averageRating ? 'filled' : '' }">&#9734;</span>
							</c:forEach>
						</div>
						<c:if
							test="${product.remainingStock > 0 && product.remainingStock <= 5 }">
							<span class="product-alert">Only ${product.remainingStock}
								left!</span>
						</c:if>
						<p class="price">
							<fmt:formatNumber value="${product.price }" type="CURRENCY" />
						</p>
					</div>
				</div>
			</c:forEach>

			<!-- <div class="tile "> -->
			<!-- Include this if the product is considered a Top Seller -->
			<!-- <span class="banner top-seller">Top Seller!</span> -->

			<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
			<%-- <a class="product-image"
				href="<c:url value="products/detail?id=${product.id}"/>"> <img
				src="<c:url value="/images/product-images/${product.imageName}"/>" />
			</a>
			<div class="details">
				<p class="name">${product.name}</p>

				<!-- .filled will make the star solid -->
				<div class="rating">
					<c:forEach begin="1" end="5" var="i">
						<span class="${i <= product.averageRating ? 'filled' : '' }">&#9734;</span>
					</c:forEach>
				</div>

				<!-- Include this if the remaining quantity is greater than 0, but less than or equal to 5 -->
				<c:if
					test="${product.remainingStock > 0 && product.remainingStock <= 5 }">
					<span class="product-alert">Only ${product.remainingStock}
						left!</span>
				</c:if>
				<p class="price">
					<fmt:formatNumber value="${product.price }" type="CURRENCY" />
				</p> --%>
		</div>
	</div>

	<!-- Add the .sold-out class if the remaining quantity is 0 -->
	<!-- 			<div class="tile sold-out">
 -->
	<!-- Include this if the remaining quantity is 0 -->
	<!-- <span class="banner">Sold Out</span> -->

	<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
	<%-- <a class="product-image"
			href="<c:url value="products/detail?id=${product.id}"/>"> <img
			src="<c:url value="/images/product-images/${product.imageName}"/>" />
		</a>
		<div class="details">
			<p class="name">${product.name}</p>

			<!-- .filled will make the star solid -->
			<div class="rating">
				<c:forEach begin="1" end="5" var="i">
					<span class="${i <= product.averageRating ? 'filled' : '' }">&#9734;</span>
				</c:forEach>

				<p class="price">
					<fmt:formatNumber value="${product.price }" type="CURRENCY" />
				</p>
			</div>
		</div> --%>
</div>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />