<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product Tile View" />
</c:import>

<div id="masonry-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		<%-- Modify the baseRoute to apply filters to the current route. --%>
		<c:param name="baseRoute" value="/products/tile" />
	</c:import>

	<!-- Container for all of the Products -->
	<!-- The list of products is available using the `products` variable -->
	<div id="grid" class="main-content">

		<c:forEach var="product" items="${products}">

			<!-- Standard Product -->
			<%-- <div class="tile ${product.remainingStock <= 0 ? 'sold-out' : ''}"> --%>
				<c:choose>
					<c:when test="${product.remainingStock <= 0}">
					<c:set var="classVar" value="tile sold-out"></c:set>
					</c:when>

					<c:when test="${product.topSeller}">
						<c:set var="classVar" value="tile top-seller"></c:set>
					</c:when>
					<c:otherwise>
					<c:set var="classVar" value="tile"></c:set>
					</c:otherwise>
				</c:choose>
				
				<div class="${classVar}">
				<c:if test="${product.remainingStock <= 0}">
					<span class="banner">Sold Out</span>
				</c:if>		

				<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
				<a class="product-image" href="<c:url value="detail?id=${product.id}"/>"> <img
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
					
					<c:if test="${product.remainingStock > 0 && product.remainingStock <= 5 }">
						<span class="product-alert">Only ${product.remainingStock}
								left!</span>
					</c:if>

					<p class="price">
						<fmt:formatNumber value="${product.price }" type="CURRENCY" />
					</p>
				</div>
			</div>
		</c:forEach>
	</div>


	<!-- Add the .top-seller class if the product is considered a Top Seller -->
	<%-- <div class="tile top-seller ">
		<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
		<a class="product-image" href="#"> <img
			src="<c:url value="/images/product-images/grey-sofa.jpg" />" />
		</a>
		<div class="details">
			<p class="name">
				<a href="#">Grey Sofa</a>
			</p>

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

			<!-- Add the Top Seller <br/> and product alert if the product is considered a Top Seller -->
			<br />
			<p class="product-alert">Top Seller</p>
			<!-- Add the X remaining product alert if the remaining quantity is greater than 0, but less than or equal to 5 -->
			<p class="product-alert">4 remaining!</p>
			<p class="price">$930.00</p>
		</div>
	</div>

	<!-- Add the .sold-out class if the Remaining Stock is 0 -->
	<div class="tile  sold-out">
		<!-- Add the Sold Out banner if the Remaining Stock is 0 -->
		<span class="banner">Sold Out</span>

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
	</div> --%>
</div>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />