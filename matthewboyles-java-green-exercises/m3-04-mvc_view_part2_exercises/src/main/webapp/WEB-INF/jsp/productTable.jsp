<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

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
			<li><a href="productTiles">Product Tiles</a></li>
			<li><a href="productList">Product List</a></li>

		</ul>

	</nav>
	<section id="main-content">
		<h2 style="text-align: center">Toy Department</h2>
		<div>
			<!-- don't forget your CSS -->
			<div>
				<table width="100%">
					<!-- ------------------------------------------------------------------------------- -->
					<tr>
						<td>&nbsp;</td>
						<c:forEach var="product" items="${productList}">
							<td><c:url var="productImageUrl"
									value="/img/${product.imageName}" /> <c:url
									var="productDetailUrl" value="/productDetail">
									<c:param name="productId" value="${product.productId}" />
								</c:url> <a href="${productDetailUrl}"><img src="${productImageUrl}"
									width="120" /></a></td>
						</c:forEach>
					</tr>
					<!-- ------------------------------------------------------------------------------- -->
					<tr>
						<td>&nbsp;</td>
						<c:forEach var="product" items="${productList}">
							<td><c:if test="${product.topSeller == true}">
									<mark style="color: red; background: none; font-size: 15px;">BEST SELLER!</mark>
								</c:if></td>
						</c:forEach>
					</tr>
					<!-- ------------------------------------------------------------------------------- -->
					<tr>
						<td>Name</td>
						<c:forEach var="product" items="${productList}">
							<td class="greyrow">${product.name}</td>
						</c:forEach>
					</tr>
					<!-- ------------------------------------------------------------------------------- -->
					<tr>
						<td>Rating</td>
						<c:forEach var="product" items="${productList}">
							<td><img
								src="img/<fmt:formatNumber type="number" pattern="#" value="${product.averageRating}"/>-star.png"
								width="120" /></td>
						</c:forEach>
					</tr>
					<!-- ------------------------------------------------------------------------------- -->
					<tr>
						<td>Mfr</td>
						<c:forEach var="product" items="${productList}">
							<td class="greyrow">${product.manufacturer}</td>
						</c:forEach>
					</tr>
					<!-- ------------------------------------------------------------------------------- -->
					<tr>
						<td>Price</td>
						<c:forEach var="product" items="${productList}">
							<td id="price">$${product.price}</td>
						</c:forEach>
					</tr>
					<!-- ------------------------------------------------------------------------------- -->
					<tr>
						<td>Wt. (in Lbs)</td>
						<c:forEach var="product" items="${productList}">
							<td class="greyrow">${product.weightInLbs}</td>
						</c:forEach>
					</tr>
					<!-- ------------------------------------------------------------------------------- -->
				</table>
			</div>
		</div>
	</section>
</body>
</html>