<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Page Title</title>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
	integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
	integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
	crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
	rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
	crossorigin="anonymous">
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">
			<img src="xworkz.png" width="100" height="40" class="d-inline-block align-top" alt="Logo">
		</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				<li class="nav-item">
					<a class="nav-link active" aria-current="page" href="register.jsp">Register</a>
				</li>
				<li class="nav-item">
					<a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
				</li>
			</ul>
		</div>
	</div>
</nav>
</head>
<body>
<!-- <form action="submit" method="post"> -->
<div class="container">
    <form action="updateById" method="post">
        <h1>Custom Sandle form</h1>
        <div class="design">
        <div class="design">
            
            <input type="hidden" class="form-control" id="inputId" value="${enterId}" name="enterId" >
          </div>
        <div class="design">
            <label for="inputEmail4">Name</label>
            <input type="name" class="form-control" id="inputName4" value="${enterName}" name="enterName" >
          </div>
        
          <div class="design">
            <label for="inputEmail4">Email</label>
            <input type="email" class="form-control" id="inputEmail4" value="${enterEmail}" name="enterEmail">
          </div>
          <div class="design">
            <label for="inputPassword4">Contact Number</label>
            <input type="tel" class="form-control" id="inputNumber" value="${enterNumber}" name="enterNumber">
          </div>
        </div>
        <div class="form-group">
          <label for="inputAddress">Size of sandle</label>
          <input type="text" class="form-control" id="inputAddress" value="${enterSize}" name="enterSize">
        </div>
       
       
          <div class="design">
            <label for="inputCity">width</label>
            <input type="text" class="form-control" id="inputCity" value="${enterWidth}" name="enterWidth">
          </div>
          <div class="design">
            <label for="inputCity">Length</label>
            <input type="text" class="form-control" id="inputCity" value="${enterLength}" name="enterLength">
          </div>
          
          <div class="design">
            <label for="inputState">Design</label>
            <select id="inputState" class="form-control" name="enterDesign">
              <option value="Custom">Custom</option>
              <option value="Modern">Modern</option>
            </select>
          </div>
        
       
        
        <button type="submit" class="btn btn-success">submit</button>
        <button type="reset" class="btn btn-danger">Clear</button>
        

</form>
</div>
</body>
</html>
