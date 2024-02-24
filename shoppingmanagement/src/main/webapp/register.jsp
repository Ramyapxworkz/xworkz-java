<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping management</title>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
	integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
	integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
	crossorigin="anonymous"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<link rel="icon" type="image/x-icon"
	href="https://www.x-workz.in/static/media/Logo.cf195593dc1b3f921369.png">
<link rel="icon" type="logo/jpeg" href="xworkz.png">


<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#"> <img src="xworkz.png"
			width="100" height="40" class="d-inline-block align-top" alt="Logo">
		</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="index.jsp">Home</a></li>
			</ul>
		</div>
	</div>
</nav>

<style>
.container {
	box-sizing: border-box;
	background-color: aquamarine;
	display: flex;
	justify-content: center;
	align-items: center;
	border-radius: 20px;
	width: 50%;
}

.design {
	
}

button[type="submit"] {
    background-color: darkblue; /* Green */
    color: white;
    border: none;
    padding: 10px 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
	border-radius: 50px;
}

button[type="reset"] {
    background-color: blue; /* Red */
    color: white;
    border: none;
    padding: 10px 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
	border-radius: 50px;
}

</style>
</head>
<body>


	<div class="container">
		<form action="submit">
			<h1>Buy Your Product</h1>
			<div class="design">
				<div class="design">
					<label for="inputName">Product Name</label>
					<select class="form-select" aria-label="Default select example" name="enterProduct">
						<option selected>Open this select menu</option>
						<option value="Mobil">Mobil</option>
						<option value="Laptop">Laptop</option>
						<option value="Charger">Charger</option>
						<option value="Speakers">Speakers</option>
						<option value="Stand">Stand</option>
						<option value="Tv">Tv</option>
						<option value="Chair">Chair</option>
					  </select>
						<span id="nameError" style='color:red'> </span>
				</div>

				<div class="design">
					<label for="inputQuantity">Quantity</label> 
					<input type="tel"
						class="form-control" id="inputQuantity" placeholder="Quantity"
						name="enterQuantity" onblur="validateNumber()" >
						<span id="numberError" style='color:red'></span>
				</div>

				<div class="design">
					<label for="inputPrice">Price per piece</label> <input type="tel"
						class="form-control" id="inputPrice" placeholder="enter price"
						name="enterPrice" >
				</div>
			</div>
			
			<button type="submit" class="btn btn-success" id="button" onblur="onName()" >Pay know</button>

			<button type="reset" class="btn btn-danger">Clear</button>
		</form>
		
	</div>
	
</body>
</html>



