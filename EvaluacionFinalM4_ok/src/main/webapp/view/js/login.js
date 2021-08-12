/**
 * Implementación de funciones para validar datos y formato de rut Chileno
 * @author The Bubble
 * @version 3.0
 */
document.addEventListener('DOMContentLoaded', function () {
  $('#formulario').validate({
        rules: {
            rut: {
                required: true,
                maxlength: 10
            },
			password: {
                required: true
            }
        }
    });
});
