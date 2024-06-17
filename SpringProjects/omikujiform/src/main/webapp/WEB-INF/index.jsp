<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html data-bs-theme="dark">
<head>
<meta charset="ISO-8859-1">
<title>Omikuji Entry</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
	<div class="card mx-auto mt-5" style="width: 18rem">
	<div class="card-body">
          <h4 class="card-title text-center mb-3">Omikuji Form!</h4>
          <form action="/omikuji/submit" method="post">
            <ul class="list-group list-group-flush form-control">
              <li class="list-group-item text-center">
                <label class="form-label">Pick any number from 5 to 25</label>
                <input
                  type="number"
                  name="luckyNum"
                  class="form-control"/>
              </li>
              <li class="list-group-item text-center">
                <label class="form-label">Enter the name of any city</label>
                <input
                  type="text"
                  name="city"
                  class="form-control"/>
              </li>
              <li class="list-group-item" class="form-label">
                <label class="form-label">Enter the name of any real person</label>
                <input
                  type="text"
                  name="realPerson"
                  class="form-control"/>
              </li>
              <li class="list-group-item" class="form-label">
                <label class="form-label">Enter a professional endeavor or hobby</label>
                <input
                  type="text"
                  name="hobby"
                  class="form-control"/>
              </li>
              <li class="list-group-item">
                <label class="form-label">Enter any type of living thing</label>
                <input
                  type="text"
                  name="livingThing"
                  class="form-control"/>
              </li>
              <li class="list-group-item">
                <label class="form-label">Say something nice to someone!</label>
                <textarea name="somethingNice" class="form-control"></textarea>
              </li>
            </ul>
            <input
              type="submit"
              class="btn btn-primary mt-3"
              value="Send!"/>
          </form>
        </div>
	</div>

</body>
</html>