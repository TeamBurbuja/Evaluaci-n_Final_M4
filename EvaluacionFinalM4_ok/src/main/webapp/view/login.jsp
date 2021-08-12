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
    <title>LOGIN</title>
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
    <!-- Formulario -->
    <div class="container-fluid">
        <div class="row py-5">
            <div class="col-12 col-lg-6 p-4 p-lg-5">
                <div class="accordion" id="accordionPanelsStayOpenExample">
                    <div class="accordion-item">
                        <h2 class="accordion-header" id="panelsStayOpen-headingOne">
                            <button class="accordion-button" type="button" data-bs-toggle="collapse"
                                data-bs-target="#panelsStayOpen-collapseOne" aria-expanded="true"
                                aria-controls="panelsStayOpen-collapseOne">
                                Sucursal Santiago
                            </button>
                        </h2>
                        <div id="panelsStayOpen-collapseOne" class="accordion-collapse collapse show"
                            aria-labelledby="panelsStayOpen-headingOne">
                            <div class="accordion-body">
                                <strong>Dirección:</strong>
                                <p>Almirante Pastene 244, Piso 1, Providencia - Santiago</p>
                                <strong>Teléfonos:</strong>
                                <p>+56 9 39156783 | +56 9 73088033</p>
                                <strong>Correo:</strong>
                                <p>contacto@safetycheck.cl</p>
                            </div>
                        </div>
                    </div>
                    <div class="accordion-item">
                        <h2 class="accordion-header" id="panelsStayOpen-headingTwo">
                            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                                data-bs-target="#panelsStayOpen-collapseTwo" aria-expanded="false"
                                aria-controls="panelsStayOpen-collapseTwo">
                                Sucursal Concepción
                            </button>
                        </h2>
                        <div id="panelsStayOpen-collapseTwo" class="accordion-collapse collapse"
                            aria-labelledby="panelsStayOpen-headingTwo">
                            <div class="accordion-body">
                                <strong>Dirección:</strong>
                                <p>Manuel Rodriguez 445 - Concepción</p>
                                <strong>Teléfonos:</strong>
                                <p>+56 9 39156783 | +56 9 73088033</p>
                                <strong>Correo:</strong>
                                <p>contacto@safetycheck.cl</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-12 col-lg-6 order-first mb-5 mb-lg-0 order-lg-last p-4 p-lg-5">
                <h2 class="display-6 mb-5">Login Usuario</h2>
                <form id="formulario" action="ValidarSesionServlet" method="POST">  
                    <div class="mb-3">
                        <label for="rut" class="form-label">RUT (XXXXXXXX-Y)<span class="fw-bold" id="rut_mensaje"></span></label>
                        <input type="text" name="rut" class="form-control" id="rut">
                        <span class="text-danger" id="rut_span"></span>
                    </div>
                    <div class="mb-3">
                        <label for="password" class="form-label">Contraseña</label>
                        <input type="password" name="password" class="form-control" id="password">
                        <span class="text-danger" id="password_span"></span>
                    </div>
                    <button type="submit" class="btn btn-primary px-5" id="login">Iniciar Sesión</button>
                </form>
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
    <script src="view/lib/jQuery/jquery-3.6.0.js"></script>
    <script src="view/lib/jQuery-Validator/jquery.validate.js"></script>
    <script src="view/lib/jQuery-Validator/localization/messages_es.js"></script>
    <script src="view/lib/DataTables/datatables.min.js"></script>
    <script src="view/js/login.js"></script>
    <script src="https://kit.fontawesome.com/8d20d6c8c4.js" crossorigin="anonymous"></script>
</body>

</html>