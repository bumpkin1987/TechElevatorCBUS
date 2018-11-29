<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>

<html>
	<head>
		<meta name="viewport" content="width=device-width" />
		<title>Product List View</title>
		<link rel="stylesheet" href="css/site.css" />
	</head>
	<body>
		<header>
			<h1>MVC Exercises - Views Part 2: Models</h1>
		</header>
	<nav>
		<ul>
			<li><a href="productList">List Layout</a></li>
			<li><a href="productTiles">Tile Layout</a></li>
			<li><a href="productTable">Table Layout</a></li>

    	</ul>

	</nav>
	<section id="main-content">
    	<h2 style="text-align: center">Toy Department</h2>
    		<div>
        		<!-- don't forget your CSS -->        
        		<c:forEach var="product" items="${productList}">
		            <div>
		                <table class= "table">
		
		                    <!-- don't forget your CSS -->
		                    <tr>
		                        <td><c:url var="productImageUrl" value="/img/${product.imageName}" /> 
			                        <c:url var="productDetailUrl" value="/productDetail">
			                        	<c:param name="productId" value="${product.productId}" />
			                        </c:url> <a href="${productDetailUrl}"><img class="product-image" src="${productImageUrl}" /></a>
		                        </td>
		                        
		                        <td>
			                        <div style="margin: 10px">
				                        <div id="name">${product.name}
				                        	<c:if test="${product.topSeller == true}">
												<mark style="color: red; background: none; font-size: 20px;" class="p">BEST SELLER!</mark>
											</c:if>
				                        </div>
				                        <div>by ${product.manufacturer}</div>
				                        <c:if test="${product.remainingStock < 5}">
				                        	<div id="buynow">Only ${product.remainingStock} Left!</div>
				                        </c:if>
				                        <div id="price">$${product.price}</div>
				                        <div><strong>Weight</strong> ${product.weightInLbs} Lbs</div>
			                        </div>
			                        <img id="star" src="img/<fmt:formatNumber type="number" pattern="#" value="${product.averageRating}"/>-star.png"/>
		                        </td>           
		                    </tr>

                    <!--  add the rest of the fields -->

                		</table>
           			</div>
        		</c:forEach>
    		</div>
	</section>
	</body>
</html>