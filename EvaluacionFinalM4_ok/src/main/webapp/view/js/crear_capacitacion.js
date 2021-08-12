/**
 * Implementación de plugin validate y DataTable
 * @author The Bubble
 * @version 3.0
 */
$(document).ready(function () {
    // Validate Plugin
    $('#formulario').validate({
        rules: {
            id: {
                required: true,
                range: [1, 999]
            },
            rut: {
                required: true,
                minlength: 9
            },
            dia: {
                required: true,
                minlength: 5,
				maxlength: 9
            },
            hora: {
                required: true,
				minlength: 5
            },
            lugar: {
                required: true,
                maxlength: 20
            },
            duracion: {
                required: true,
				range: [1, 999]
            },
			asistentes: {
                required: true,
				range: [1, 999]
            }
        }
    });
});