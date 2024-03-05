<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Data</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
    body {
        background-color: #f8f9fa;
    }
    .container {
        margin-top: 50px;
    }
    h1 {
        text-align: center;
        margin-bottom: 30px;
    }
    .btn {
        margin-right: 5px;
    }
</style>
</head>
<body>
<div class="container">
<h2 class="text-center" style="color: black; font-weight: bolder;">View
					All Order Details</h2>
   <div class="row">
    <div class="col-md-4 text-left">
        <form action="viewData" method="post" class="mb-3">
            <button type="submit" class="btn btn-primary">View All</button>
        </form>
    </div>

    <!-- Search Bar -->
    <div class="col-md-4 text-center align-self-center">
        <form action="searchAction" method="post" class="mb-3">
            <input type="text" name="searchValue" placeholder="Name" required>
            <button type="submit" class="btn btn-info">Search</button>
        </form>
    </div>

    <div class="col-md-4 text-end">
        <form action="index.jsp" class="mb-3">
            <button type="submit" class="btn btn-secondary">Back to Home</button>
        </form>
    </div>
</div>


    <table class="table table-bordered">
        <thead class="table-dark">
            <tr>
                <th scope="col">Id</th>
                <th scope="col">Username</th>
                <th scope="col">Email</th>
                <th scope="col">Contact Number</th>
                <th scope="col">Size of Sandal</th>
                <th scope="col">Width</th>
                <th scope="col">Length</th>
                <th scope="col">Design</th>
                <th scope="col">Update</th>
                <th scope="col">Delete</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${orderList}" var="item">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.userName}</td>
                    <td>${item.email}</td>
                    <td>${item.number}</td>
                    <td>${item.sizeOfSandle}</td>
                    <td>${item.width}</td>
                    <td>${item.length}</td>
                    <td>${item.design}</td>
                    <td>
                        <form action="update" method="post">
                            <input type="hidden" id="id" name="enterId" value="${item.id}"> 
                            <input type="hidden" id="userName" name="enterName" value="${item.userName}"> 
                            <input type="hidden" id="email" name="enterEmail" value="${item.email}"> 
                            <input type="hidden" id="number" name="enterNumber" value="${item.number}"> 
                            <input type="hidden" id="sizeOfSandle" name="enterSize" value="${item.sizeOfSandle}"> 
                            <input type="hidden" id="width" name="enterWidth" value="${item.width}"> 
                            <input type="hidden" id="length" name="enterLength" value="${item.length}"> 
                            <input type="hidden" id="design" name="enterDesign" value="${item.design}"> 
                            <button type="submit" class="btn btn-primary">Update</button>
                        </form>
                    </td>
                    <td>
                        <form action="delete" method="post">
                            <input type="hidden" id="id" name="enterId" value="${item.id}"> 
                            <button type="submit" class="btn btn-danger">Delete</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-By1gI1C5Qbm2bsNYvYY4+3f36l/Nm3iXU1d2ONK0LDDVpAD4sOELH10o9sIgHr5R" crossorigin="anonymous"></script>
</body>
</html>
