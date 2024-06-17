<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html data-bs-theme="dark">
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Hopper's Receipt</title>
</head>
<body>
	<div class="container mx-auto mt-3">
		<h1>Purchase Receipt</h1>
		<p><strong>Name:</strong> <c:out value="${name}"/></p>
    	<p><strong>Item Name:</strong> <c:out value="${itemName}"/></p>
		<p><strong>Price:</strong> <c:out value="${price}"/></p>
    	<p><strong>Description:</strong> <c:out value="${description}"/></p>
    	<p><strong>Vendor:</strong> <c:out value="${vendor}"/></p>
	</div>
</body>
</html>