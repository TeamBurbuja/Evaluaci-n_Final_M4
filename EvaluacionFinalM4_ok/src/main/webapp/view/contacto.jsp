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
    <title>CONTACTO</title>
</head>

<body>
    <!-- Header -->
    <div class="container-fluid">
        <nav class="navbar navbar-expand-lg navbar-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="InicioServlet">
                    <img class="logotipo" src="view/img/Safety Logo H.png" alt="logotipo">
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link" href="InicioServlet">Home</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                                data-bs-toggle="dropdown" aria-expanded="false">
                                Capacitaciones
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="CrearCapacitacionServlet">Crear Capacitaci??n</a></li>
                                <li>
                                    <hr class="dropdown-divider">
                                </li>
                                <li><a class="dropdown-item" href="ListarCapacitacionesServlet">Listar Capacitaciones</a></li>
                                <li>
                                    <hr class="dropdown-divider">
                                </li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                                data-bs-toggle="dropdown" aria-expanded="false">
                                Usuarios
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="LoginServlet">Iniciar Sesi??n</a></li>
                                <li>
                                    <hr class="dropdown-divider">
                                </li>
                                <li><a class="dropdown-item" href="CrearUsuarioServlet">Crear Usuario</a></li>
                                <li>
                                    <hr class="dropdown-divider">
                                </li>
                                <li><a class="dropdown-item" href="ListadoUsuariosServlet">Listar Usuarios</a></li>
                                <li>
                                    <hr class="dropdown-divider">
                                </li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link activo" aria-current="page" href="ContactoServlet">Contacto</a>
                        </li>
                    </ul>
                    <div>
                        <button class="btn btn-danger mb-3 mb-md-0 ms-lg-4" type="submit"><a class="text-white text-decoration-none" href="CerrarSesionServlet">Cerrar Sesi??n</a></button>
                    </div>
                </div>
            </div>
        </nav>
    </div>
    <!-- Banner -->
    <div id="banner-contacto" class="container-fluid d-flex justify-content-center align-items-center">
        <h1 class="display-3 fw-bold">Cont??ctanos</h1>
    </div>
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
                                <strong>Direcci??n:</strong>
                                <p>Almirante Pastene 244, Piso 1, Providencia - Santiago</p>
                                <strong>Tel??fonos:</strong>
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
                                Sucursal Concepci??n
                            </button>
                        </h2>
                        <div id="panelsStayOpen-collapseTwo" class="accordion-collapse collapse"
                            aria-labelledby="panelsStayOpen-headingTwo">
                            <div class="accordion-body">
                                <strong>Direcci??n:</strong>
                                <p>Manuel Rodriguez 445 - Concepci??n</p>
                                <strong>Tel??fonos:</strong>
                                <p>+56 9 39156783 | +56 9 73088033</p>
                                <strong>Correo:</strong>
                                <p>contacto@safetycheck.cl</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-12 col-lg-6 order-first mb-5 mb-lg-0 order-lg-last p-4 p-lg-5">
                <h2 class="display-6 mb-5">Formulario de contacto</h2>
                <form action="ContactoServlet" method="POST" id="formulario">
                    <div class="mb-3">
                        <label for="nombre" class="form-label">Nombre</label>
                        <input type="text" name="nombre" class="form-control" id="nombre">
                    </div>
                    <div class="mb-3">
                        <label for="correo" class="form-label">Correo</label>
                        <input type="email" name="correo" class="form-control" id="correo" aria-describedby="emailHelp">
                    </div>
                    <div class="mb-3">
                        <label for="telefono" class="form-label">Tel??fono</label>
                        <input type="text" name="telefono" class="form-control" id="telefono">
                    </div>
                    <div class="form-floating">
                        <textarea class="form-control mb-4" name="mensaje" placeholder="Escribe tu mensaje" id="mensaje"
                            style="height: 200px"></textarea>
                        <label for="mensaje">Escribe tu mensaje</label>
                    </div>
                    <button type="submit" class="btn btn-primary px-5">Enviar</button>
                </form>
            </div>
        </div>
    </div>
    <!-- Info Usuarios -->
    <div id="container-home" class="container-fluid py-5">
        <h3 class="text-center text-primary fw-bold my-4">
            ??Qu?? procesos considera la plataforma actualmente?
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
                    Manejo de visitas, capacitaciones y asesor??as con sus
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
    <script src="view/js/contacto.js"></script>
    <script src="https://kit.fontawesome.com/8d20d6c8c4.js" crossorigin="anonymous"></script>
</body>

</html>