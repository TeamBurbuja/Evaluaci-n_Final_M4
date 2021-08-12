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
            nombre_superior: {
                required: true,
				minlength: 3,
				maxlength: 20
            },
			area: {
                required: true,
				minlength: 3,
				maxlength: 20
            },
			funcion: {
                required: true,
				minlength: 3,
				maxlength: 20
            },
			exp_previa: {
                required: true,
				maxlength: 150
            },
        }
    });
});