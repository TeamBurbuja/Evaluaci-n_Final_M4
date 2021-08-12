/**
 * Implementación de plugin datepicker
 * @author The Bubble
 * @version 3.0
 */
$(document).ready(function () {
   
	$( "#fecha_nac" ).datepicker({
        dateFormat: 'dd/mm/yy',
    });
});