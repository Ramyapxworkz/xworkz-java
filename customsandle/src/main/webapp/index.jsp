<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Custom Sandal Application</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Popper.js and Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Custom CSS -->
    <style>
     
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
        }
        
        .navbar {
            background-color: #343a40;
        }
        
        .navbar-brand {
            color: #ffffff;
            font-weight: bold;
        }
        
        .nav-link {
            color: #ffffff;
        }
        
        .carousel {
            position: relative;
            max-width: 600px;
            margin: auto;
            overflow: hidden;
        }
        
        .image-container {
            display: flex;
            justify-content: center;
            align-items: center;
            transition: transform 0.5s ease;
        }
        
        .carousel-image {
            max-width: 100%;
            display: none;
        }
        
        .btn {
            position: absolute;
            top: 50%;
            transform: translateY(-50%);
            background-color: rgba(0, 0, 0, 0.5);
            color: white;
            border: none;
            cursor: pointer;
            padding: 10px;
            z-index: 100;
            transition: background-color 0.3s;
        }
        
        .btn:hover {
            background-color: rgba(0, 0, 0, 0.7);
        }
        
        #prevBtn {
            left: 0;
        }
        
        #nextBtn {
            right: 0;
        }
        
          .yoyo {
        max-width: 800px;
        margin: auto;
        position: relative;
        overflow: hidden;
        border-radius: 8px;
    }

    .carousel {
        display: flex;
        align-items: center;
        justify-content: space-between;
        background-color: #f8f9fa;
        padding: 10px;
        border-radius: 8px;
    }

    .btn {
        background-color: #007bff;
        color: #fff;
        border: none;
        padding: 10px 20px;
        border-radius: 5px;
        cursor: pointer;
    }

    .image-container {
        display: flex;
        overflow-x: hidden;
        border-radius: 8px;
    }

    .carousel-image {
        max-width: 100%;
        height: auto;
        transition: transform 0.5s ease;
        border-radius: 8px;
    }

    #prevBtn:hover,
    #nextBtn:hover {
        background-color: #0056b3;
    }

    #prevBtn:disabled,
    #nextBtn:disabled {
        opacity: 0.5;
        cursor: not-allowed;
    }
        
        h1 {
            text-align: center;
            color: black;
            margin-top: 30px;
            font-size: 24px;
        }
    </style>
</head>
<body>

<header>
    <nav class="navbar navbar-expand-lg navbar-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">CUSTOM SANDALS</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="register.jsp">Book here</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="view.jsp">View orders</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>

<main>
    <div class="yoyo">
    <div class="carousel">
        <button class="btn" id="prevBtn">&#10094; Previous</button>
        <div class="image-container">
            <img src="image1.jpeg" class="carousel-image" style="display: block" />
            <img src="img2.jpeg" class="carousel-image" height="50%" />
            <img src="image3.jpeg" class="carousel-image" />
            <img src="image4.jpeg" class="carousel-image" />
            <img src="image5.jpeg" class="carousel-image" />
        </div>
        <button class="btn" id="nextBtn">Next &#10095;</button>
    </div>
</div>

</main>

</body>
</html>
