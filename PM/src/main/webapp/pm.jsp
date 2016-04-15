<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>pm</title>
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body class="container">

	<div class="page-header">PM</div>

	<table class="table table-bordered">
		<c:forEach var="product" items="${allProducts}">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.price}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>