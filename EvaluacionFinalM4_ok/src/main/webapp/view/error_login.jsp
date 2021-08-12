<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="view/lib/bootstrap_5/css/bootstrap.min.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@200;300;400;600;800&display=swap"
        rel="stylesheet">
    <link rel="stylesheet" href="view/css/style.css">
    <title>ERROR LOGIN</title>
</head>

<body>
    <!-- Header -->
    <div class="container-fluid">
	    <nav class="navbar navbar-expand-lg navbar-light">
	        <div class="container-fluid">
	            <a class="navbar-brand" href="InicioServlet">
	                <img class="logotipo" src="view/img/Safety Logo H.png" alt="logotipo">
	            </a>
	        </div>
	    </nav>
	</div>
    <!-- Banner -->
    <div id="banner-home" class="container-fluid d-block d-md-none d-flex justify-content-center align-items-center">
        <!-- Imagen bg por css -->
        <h1 class="text-white">Asesoría Profesional</h1>
    </div>
    <!-- Carousel -->
    <jsp:include page="carousel.jsp"></jsp:include>
    <!-- Info Ingreso -->
    <div class="container-fluid py-lg-5">
        <div class="row mt-4">
            <div class="col-12 text-center my-5 my-lg-0 px-4">
                <h2 class="mb-5 text-danger">Los datos ingresados son incorrectos</h2>
                <div class="pb-5">
                    <span>
                    	<i class="far fa-times-circle display-1 text-danger"></i>
                    </span>
                </div>
                <a href="LoginServlet" class="btn btn-success px-5 mb-5">Volver</a>
            </div>
        </div>
    </div>
    <!-- Info Usuarios -->
    <div id="container-home" class="container-fluid py-5">
        <h3 class="text-center text-primary fw-bold my-4">
            ¿Qué procesos considera la plataforma actualmente?
        </h3>
        <div class="row">
            <div class="col-md-6 text-center my-5">
                <i class="far fa-address-card display-5 mb-3"></i>
                <h3>Registro de usuarios</h3>
                <p>
                    Permite ingreso de usuarios: Cliente, profesional y
                    administrativo
                </p>
            </div>
            <div class="col-md-6 text-center my-5">
                <i class="fas fa-exclamation-triangle display-5 mb-3"></i>
                <h3>Registro de ocurrencias</h3>
                <p>
                    Manejo de data respectiva a accidentes realacionados al
                    cliente
                </p>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 text-center my-5">
                <i class="far fa-calendar-check display-5 mb-3"></i>
                <h3>Registro de servicios</h3>
                <p>
                    Manejo de visitas, capacitaciones y asesorías con sus
                    respectivas mejoras
                </p>
            </div>
            <div class="col-md-6 text-center my-5">
                <i class="fas fa-file-invoice-dollar display-5 mb-3"></i>
                <h3>Registro de pagos</h3>
                <p>Detalle de pagos realizado por el cliente</p>
            </div>
        </div>
    </div>
    <!-- Footer -->
    <jsp:include page="footer.jsp"></jsp:include>
    <!-- Scripts -->
    <script src="view/lib/bootstrap_5/js/bootstrap.min.js"></script>
    <script src="https://kit.fontawesome.com/8d20d6c8c4.js" crossorigin="anonymous"></script>
</body>

</html>