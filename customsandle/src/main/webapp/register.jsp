<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Custom Sandal Application</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
    body {
        background-color: #f8f9fa;
        background-image: url('https://images.freecreatives.com/wp-content/uploads/2016/04/Beautiful-Plain-Website-Background.jpg');
    
    }

    .container {
    max-width: 500px;
    margin: 100px auto;
    padding: 20px;
    border-radius: 10px;
    background-color: rgba(192, 191, 196, 0.5); /* Set the alpha (transparency) value */
    box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.1);
    animation: fadeIn 1s ease;
}

.form-group {
    margin-bottom: 20px;
}

@keyframes fadeIn {
    from {
        opacity: 0;
        transform: translateY(-20px);
    }
    to {
        opacity: 1;
        transform: translateY(0);
    }
}

.form-label {
    font-weight: bold;
}

.btn-submit {
    margin-right: 100px;
    margin: auto;
}
</style>
</head>
<body >

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Custom Sandals</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <form action="submit" method="post">
        <h1 class="mb-4">Book Custom Sandal Here!!!</h1>
        
        <div class="form-group">
            <label for="inputName" class="form-label">Name</label>
            <input type="text" class="form-control" id="inputName" placeholder="Enter Name" name="enterName">
        </div>
        
        <div class="form-group">
            <label for="inputEmail" class="form-label">Email</label>
            <input type="email" class="form-control" id="inputEmail" placeholder="Enter Email" name="enterEmail">
        </div>
        
        <div class="form-group">
            <label for="inputNumber" class="form-label">Contact Number</label>
            <input type="tel" class="form-control" id="inputNumber" placeholder="Enter Contact Number" name="enterNumber">
        </div>
        
        <div class="form-group">
            <label for="inputSize" class="form-label">Size of Sandal</label>
            <input type="text" class="form-control" id="inputSize" placeholder="Enter Size" name="enterSize">
        </div>
        
        <div class="form-group">
            <label for="inputWidth" class="form-label">Width</label>
            <input type="text" class="form-control" id="inputWidth" placeholder="Enter Width" name="enterWidth">
        </div>
        
        <div class="form-group">
            <label for="inputLength" class="form-label">Length</label>
            <input type="text" class="form-control" id="inputLength" placeholder="Enter Length" name="enterLength">
        </div>
        
        <div class="form-group">
            <label for="inputDesign" class="form-label">Design</label>
            <select class="form-select" id="inputDesign" name="enterDesign">
                <option value="Custom">Custom</option>
                <option value="Modern">Modern</option>
            </select>
        </div>
        
        <button type="submit" class="btn btn-success btn-submit">Submit</button>
        <button type="reset" class="btn btn-danger">Clear</button>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>


</html>
