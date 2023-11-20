package cumplimentacionPDF;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidadorFecha {

	public boolean esFormatoFechaValido(String fechaStr) {
		// Define el formato de fecha esperado
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		formatoFecha.setLenient(false); // No permite fechas inválidas

		try {
			// Intenta parsear la cadena como fecha
			@SuppressWarnings("unused")
			Date fecha = formatoFecha.parse(fechaStr);

			// Si el parsing es exitoso, la cadena tiene el formato correcto
			return true;
		} catch (ParseException e) {
			// Si ocurre una excepción, la cadena no tiene el formato correcto
			return false;
		}
	}

}
