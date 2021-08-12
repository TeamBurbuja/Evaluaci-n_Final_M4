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
            nombre: {
                required: true,
				minlength: 3,
				maxlength: 20
            },
			fecha_nac: {
                required: true
            },
			run: {
                required: true,
				minlength: 10
            },
			tipo_usuario: {
                required: true
            },
        }
    });

	$( "#fecha_nac" ).datepicker({
        dateFormat: 'dd/mm/yy',
    });
});