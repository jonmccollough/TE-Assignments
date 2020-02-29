<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product Details" />
</c:import>

<!-- Container for the Product -->
<!-- The current product is available using the `product` variable -->
<div id="product-detail">
	<img src="<c:url value="/images/product-images/${product.imageName }" />" />
	<div class="product-description">
		<h3>${product.name }</h3>

		<!-- .filled will make the star solid -->
		<div class="rating">
			<c:forEach begin="1" end="5" var="i">
			<span class="${i <= product.averageRating ? 'filled' : '' }">&#9734;</span> 
			</c:forEach>
		</div>

		<!-- Include this if the product has a Remaining Stock of 5 or less -->
		<c:if test="${product.remainingStock > 0 && product.remainingStock <= 5 }">
       		<span class="product-alert">Only ${product.remainingStock} left!</span>
   		</c:if>
		<p class="description">${product.description}</p>
		<p class="price">${product.price}</p>

		<!-- If item is in stock -->
		
			<c:if test="${product.remainingStock >= 1}">
				<button class="action">Add to Cart</button>
			</c:if>
		<!-- OR if item is out of stock -->
			<c:if test="${product.remainingStock == 0 }">
        		<button disabled>Sold Out</button>
        	</c:if>
    	
		
		
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />