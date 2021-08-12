/**
 * Implementación de plugin validate
 * @author The Bubble
 * @version 3.0
 */
$(document).ready(function () {
    // Validate Plugin
    $('#formulario').validate({
        rules: {
			nombre: {
                required: true
            },
            correo: {
                required: true
            },
			telefono: {
                required: true
            },
			mensaje: {
                required: true
            }
        }
    });
});