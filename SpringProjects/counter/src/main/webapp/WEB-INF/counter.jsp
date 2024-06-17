<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Current Visit Count!</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <div class="container text-center">
    	<h1 class="text-center">Your Current Visit Count</h1>
    	<p>You have visited this page <%= request.getAttribute("count") %> times.</p>
    	<a href="/"><button class="btn btn-primary">Test Another Visit?</button></a>
    	<a href="/increment"><button class="btn btn-primary mx-3">Add 2 Visits!</button></a>
    	<a href="/reset"><button class="btn btn-danger">Reset Counter To 0!</button></a>
    </div>
</body>
</html>
