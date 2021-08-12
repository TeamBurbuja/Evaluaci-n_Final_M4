<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="view/lib/bootstrap_5/css/bootstrap.min.css" />
    <link rel="stylesheet" href="view/lib/DataTables/datatables.min.css" />
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@200;300;400;600;800&display=swap"
        rel="stylesheet" />
    <link rel="stylesheet" href="view/css/style.css" />
    <title>LISTAR CAPACITACIONES</title>
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
                            <a class="nav-link dropdown-toggle activo" href="#" id="navbarDropdown" role="button"
                                data-bs-toggle="dropdown" aria-expanded="false">
                                Capacitaciones
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="CrearCapacitacionServlet">Crear Capacitación</a></li>
                                <li>
                                    <hr class="dropdown-divider">
                                </li>
                                <li><a class="dropdown-item activo" aria-current="page" href="ListarCapacitacionesServlet">Listar Capacitaciones</a></li>
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
                                <li><a class="dropdown-item" href="LoginServlet">Iniciar Sesión</a></li>
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
                            <a class="nav-link" href="ContactoServlet">Contacto</a>
                        </li>
                    </ul>
                    <div>
                        <button class="btn btn-danger mb-3 mb-md-0 ms-lg-4" type="submit"><a class="text-white text-decoration-none" href="CerrarSesionServlet">Cerrar Sesión</a></button>
                    </div>
                </div>
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
    <!-- Tabla -->
    <div class="container-fluid table-responsive py-5 px-4 p-lg-5 my-4">
        <h2 class="text-center mb-5">Listado de Capacitaciones</h2>
        <table class="table table-bordered border-secondary table-striped text-center" id="tabla">
            <thead class="border-secondary">
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Rut Cliente</th>
                    <th scope="col">Día</th>
                    <th scope="col">Hora</th>
                    <th scope="col">Lugar</th>
                    <th scope="col">Duración</th>
                    <th scope="col">Asistentes</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="c" items="${ capacitaciones }">
                	<tr>
                		<th scope="row">
                			<c:out value="${ c.getIdCapacitacion() }"></c:out>
                		</th>
                		<td>
                			<c:out value="${ c.getRutCliente() }"></c:out>
                		</td>
                		<td>
                			<c:out value="${ c.getDia() }"></c:out>
                		</td>
                		<td>
                			<c:out value="${ c.getHora() }"></c:out>
                		</td>
                		<td>
                			<c:out value="${ c.getLugar() }"></c:out>
                		</td>
                		<td>
                			<c:out value="${ c.getDuracion() }"></c:out>
                		</td>
                		<td>
                			<c:out value="${ c.getCantidadAsistentes() }"></c:out>
                		</td>
                	</tr>	
                </c:forEach>
            </tbody>
        </table>
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
    <script src="view/lib/DataTables/datatables.min.js"></script>
    <script src="view/js/listar_capacitaciones.js"></script>
    <script src="https://kit.fontawesome.com/8d20d6c8c4.js" crossorigin="anonymous"></script>
</body>

</html>