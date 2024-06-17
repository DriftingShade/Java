<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html data-bs-theme="dark">
<head>
    <meta charset="UTF-8">
    <title>Fortune</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <div class="container mt-5">
        <h3 class="text-center">Your Fortune</h3>
        <div class="card mx-auto mt-5" style="width: 18rem;">
            <div class="card-body text-center">
                <p>In <%= request.getAttribute("luckyNum") %> years, you will live in <%= request.getAttribute("city") %> 
                with <%= request.getAttribute("realPerson") %> as your roommate, <%= request.getAttribute("hobby") %> 
                for a living. The next time you see a <%= request.getAttribute("livingThing") %>, 
                you will have good luck. Also, <%= request.getAttribute("somethingNice") %>.</p>
                <p><a href="/omikuji">Go back</a></p>
            </div>
        </div>
    </div>
</body>
</html>
