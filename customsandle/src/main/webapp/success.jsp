<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Thank You</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f8f9fa;
        margin: 0;
        padding: 0;
    }
    .container {
        width: 50%;
        margin: 100px auto;
        text-align: center;
    }
    h1 {
        color: #0b0f14;
        margin-bottom: 20px;
    }
    h2 {
        color: #28a745;
        margin-bottom: 20px;
    }
    button {
        padding: 10px 20px;
        background-color: #007bff;
        color: #fff;
        border: none;
        cursor: pointer;
        border-radius: 5px;
        transition: background-color 0.3s;
    }
    button:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<div class="container">
    <h1>Thanks for Booking</h1>
    <!-- <h2>${DeleteMessage}</h2> -->
    <form action="index.jsp" method="post">
        <!-- <h3></h3> -->
        <button type="submit">Back to Home</button>
    </form>
</div>
</body>
</html>
