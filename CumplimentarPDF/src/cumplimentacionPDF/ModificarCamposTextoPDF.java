
package Delegados;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
//import org.apache.pdfbox.pdmodel.PDPage;
////import org.apache.pdfbox.pdmodel.PDAcroForm;
////import org.apache.pdfbox.pdmodel.PDField;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

public class ModificarCamposTextoPDF {

    public static final String PROVINCIA = "SEVILLA";
    public static final String PROMOTOR = "UNION GENERAL DE TRABAJADORES";
    public static final String MODELO_3 = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_3.pdf";
    public static final String MODELO_5_1 = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_5_1.pdf";
    public static final String MODELO_5_2_PROCESO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_5_2_proceso.pdf";
    public static final String MODELO_5_2_CONCLUSION = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_5_2_conclusion.pdf";
    public static final String MODELO_9 = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_9.pdf";
    public static final String MODELO_3_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_3_CUMPLIMENTADO.pdf";
    public static final String MODELO_5_1_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_5_1_CUMPLIMENTADO.pdf";
    public static final String MODELO_5_2_PROCESO_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\odelo_5_2_proceso_CUMPLIMENTADO.pdf";
    public static final String MODELO_5_2_CONCLUSION_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\mmodelo_5_2_conclusion_CUMPLIMENTADO.pdf";
    public static final String MODELO_9_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_9_CUMPLIMENTADO.pdf";

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
    	
        short opcion;
        
        do {
        	opcion = mostrarMenu();
        	tratarMenu(opcion);
        } while (opcion != 0);

    }

	private static short mostrarMenu() {

    	short opcion;
    	
    	do {
    		mostrarMensaje("Seleccione modelos a cumplimentar"
        			+ "\nDELEGADOS"
        			+ "\n(1) Todos los modelos de delegado"
        			+ "\n(2) Modelos de escrutinio de delegados"
        			+ "\n(3) Modelo 3"
        			+ "\n"
        			+ "\nCOMITE"
        			+ "\n(4) Todos los modelos de comite"
        			+ "\n(5) Modelos de escrutinio de delegados"
        			+ "\n(6) Modelos 3 y 4"
        			+ "\n(0) Salir\n");
    		opcion = comprobarEntero();
		} while (opcion < 1 || opcion > 4);
    	
    	
		return opcion;
	}
	
	private static void tratarMenu(int opcion) {

		switch (opcion) {

		case 1:
			// Ruta de los formularios PDF
			String[] rutaFormulario = { MODELO_3, MODELO_5_1, MODELO_5_2_PROCESO, MODELO_5_2_CONCLUSION, MODELO_9 };
			for (String ruta : rutaFormulario) {
				try {
					modificarCamposTextoPDF(ruta);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			break;
			
		case 2:
			// Ruta de los formularios PDF
			String[] rutaFormulario2 = {MODELO_5_1, MODELO_5_2_PROCESO, MODELO_5_2_CONCLUSION, MODELO_9};
			// Ruta del formulario PDF
			for (String ruta : rutaFormulario2) {
				try {
					modificarCamposTextoPDF(ruta);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			break;
			
		case 3:
			// Ruta del formularios PDF
			String rutaFormulario3 = MODELO_3;
			// Ruta del formulario PDF

			try {
				modificarCamposTextoPDF(rutaFormulario3);
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
//		case value:
//
//			break;

		default:
			break;
		}

	}

	public static void modificarCamposTextoPDF(String rutaFormulario) throws IOException {
        try (PDDocument pdfDocument = PDDocument.load(new File(rutaFormulario))) {

        	Delegados_Modelo3 modelo3;
        	Delegados_Modelo5_1 modelo5_1;
        	Delegados_Modelo5_2_proceso modelo5_2P;
        	Delegados_Modelo5_2_conclusion modelo5_2C;
        	Delegados_Modelo9 modelo9;
        	
        	String nombreEmpresa, CIF, municipio, direccion, fechaConstitucion, diaVotacion, mesVotacion, CP;
        	
        	mostrarMensaje("Nombre de la empresa: ");
        	nombreEmpresa = sc.nextLine();
        	
        	mostrarMensaje("CIF: ");
        	CIF = sc.nextLine();
        	
        	mostrarMensaje("Municipio: ");
        	municipio = sc.nextLine();
        	
        	mostrarMensaje("Direccion: ");
        	direccion = sc.nextLine();
        	
        	mostrarMensaje("Fecha Constitucion: (FORMATO dd/mm/AAAA)");
        	fechaConstitucion = sc.nextLine();
        	
        	mostrarMensaje("Dia Votacion: ");
        	diaVotacion = sc.nextLine();
        	
        	mostrarMensaje("Mes Votacion: ");
        	mesVotacion = sc.nextLine();
        	
        	mostrarMensaje("Total electores: ");
        	short totalElectores = comprobarEntero();
        	
        	mostrarMensaje("Varones: ");
        	short varones = comprobarEntero();
        	short mujeres = (short) (totalElectores - varones);
        	
        	mostrarMensaje("Codigo Postal: ");
        	CP = sc.nextLine();
        	
        	modelo3 = new Delegados_Modelo3(nombreEmpresa, CIF, direccion, municipio);
    		modelo5_1 = new Delegados_Modelo5_1(nombreEmpresa, CIF, mesVotacion, direccion, municipio, fechaConstitucion);
    		modelo5_2P = new Delegados_Modelo5_2_proceso(diaVotacion, mesVotacion, totalElectores, varones, mujeres, totalElectores);
    		modelo5_2C = new Delegados_Modelo5_2_conclusion(nombreEmpresa,nombreEmpresa, CIF, direccion, municipio, nombreEmpresa, direccion, direccion, municipio, CP, false, nombreEmpresa, nombreEmpresa);
    		modelo9 = new Delegados_Modelo9(nombreEmpresa, CIF, direccion, municipio);
    		
    		String diaConstitucion = obtenerDiaDeFecha(fechaConstitucion);
    		String mesConstitucion = obtenerMesFecha(fechaConstitucion);
    		String anioConstitucion = obtenerAnioFecha(fechaConstitucion);
    		String anioConstitucionFormateado = obtenerDosUltimosDigitosAnio(fechaConstitucion);
    		String mesEnLetras = null;
    		
    		for (Meses mes : Meses.values()) {
				if (mesConstitucion.equals(mes.obtenerNombre())) {
					mesEnLetras = mes.toString();
				}
			}
    		
            // Obtener el formulario acro
            PDDocumentCatalog docCatalog = pdfDocument.getDocumentCatalog();
            PDAcroForm acroForm = docCatalog.getAcroForm();

            if (acroForm != null) {
            	
            	
                 //Modificar campos de texto específicos            
               
                 //Agrega más llamadas a modificarCampoTexto para otros campos

                // Guardar el PDF modificado
                if (rutaFormulario.equals(MODELO_3)) {
                	modificarCampoTexto(acroForm, "n_empresa", modelo3.getN_empresa());
                	modificarCampoTexto(acroForm, "CIF", modelo3.getCIF());
                	modificarCampoTexto(acroForm, "n_comercial", modelo3.getN_empresa());
                	modificarCampoTexto(acroForm, "n_centro", modelo3.getN_empresa());
                	modificarCampoTexto(acroForm, "d_centro", modelo3.getD_centro());
                	modificarCampoTexto(acroForm, "municipio", modelo3.getMunicipio());
                	modificarCampoTexto(acroForm, "prov", modelo3.getProv());
                	modificarCampoTexto(acroForm, "lugar", modelo3.getMunicipio());
                	modificarCampoTexto(acroForm, "dia", diaConstitucion);
                	modificarCampoTexto(acroForm, "meses", mesEnLetras);
                	modificarCampoTexto(acroForm, "año", anioConstitucionFormateado);
                	pdfDocument.save(MODELO_3_CUMPLIMENTADO);
				}
                else {
                	if (rutaFormulario.equals(MODELO_5_1)) {
                		modificarCampoTexto(acroForm, "n_empresa", modelo3.getN_empresa());
                		modificarCampoTexto(acroForm, "n_comercial", modelo3.getN_empresa());
                    	modificarCampoTexto(acroForm, "CIF", modelo3.getCIF());
                    	modificarCampoTexto(acroForm, "n_centro", modelo3.getN_empresa());
                    	modificarCampoTexto(acroForm, "d_centro", modelo3.getD_centro());
                    	modificarCampoTexto(acroForm, "municipio", modelo3.getMunicipio());
                    	modificarCampoTexto(acroForm, "prov", modelo3.getProv());
                    	modificarCampoTexto(acroForm, "f_constitucion", modelo5_1.getF_constitucion());
                    	pdfDocument.save(MODELO_5_1_CUMPLIMENTADO);
    				}
                	else {
                		if (rutaFormulario.equals(MODELO_5_2_PROCESO)) {
                			modificarCampoTexto(acroForm, "dia1", modelo5_2P.getDia1());
                    		modificarCampoTexto(acroForm, "mes1", modelo5_2P.getMes1());
                        	modificarCampoTexto(acroForm, "t_electores", String.valueOf(modelo5_2P.getT_electores()));
                        	modificarCampoTexto(acroForm, "e_varones", String.valueOf(modelo5_2P.getE_varones()));
                        	modificarCampoTexto(acroForm, "e_mujeres", String.valueOf(mujeres));
                        	modificarCampoTexto(acroForm, "e_total", String.valueOf(modelo5_2P.getT_electores()));
                        	modificarCampoTexto(acroForm, "n_representantes", String.valueOf(modelo5_2P.getT_electores()));
                        	pdfDocument.save(MODELO_5_2_PROCESO_CUMPLIMENTADO);
        				}
                		else {
                			if (rutaFormulario.equals(MODELO_5_2_CONCLUSION)) {
                				modificarCampoTexto(acroForm, "n_empresa", modelo3.getN_empresa());
                            	modificarCampoTexto(acroForm, "n_comercial", modelo3.getN_empresa());
                            	modificarCampoTexto(acroForm, "dni", modelo3.getCIF());
                            	modificarCampoTexto(acroForm, "domicilio", modelo3.getD_centro());
                            	modificarCampoTexto(acroForm, "municipio", modelo3.getMunicipio());
                            	modificarCampoTexto(acroForm, "prov", modelo3.getProv());
                            	modificarCampoTexto(acroForm, "nombre", modelo3.getN_empresa());
                            	modificarCampoTexto(acroForm, "direccion", modelo3.getD_centro());
                            	modificarCampoTexto(acroForm, "direccion1", "");
                            	modificarCampoTexto(acroForm, "municipio1", modelo3.getMunicipio());
                            	modificarCampoTexto(acroForm, "prov1", modelo3.getProv());
                            	modificarCampoTexto(acroForm, "c", modelo5_2C.getC());
                            	modificarCampoTexto(acroForm, "casilla_de_verificacion2", "");
                            	modificarCampoTexto(acroForm, "centro_trabajo1", modelo3.getN_empresa());
                            	modificarCampoTexto(acroForm, "empresa", modelo3.getN_empresa());
                            	pdfDocument.save(MODELO_5_2_CONCLUSION_CUMPLIMENTADO);
            				}
                			else {
                				modificarCampoTexto(acroForm, "n_empresa", modelo3.getN_empresa());
                				modificarCampoTexto(acroForm, "CIF", modelo3.getCIF());
                        		modificarCampoTexto(acroForm, "n_comercial", modelo3.getN_empresa());
                            	modificarCampoTexto(acroForm, "n_centro", modelo3.getN_empresa());
                            	modificarCampoTexto(acroForm, "d_centro", modelo3.getD_centro());
                            	modificarCampoTexto(acroForm, "municipio", modelo3.getMunicipio());
                            	modificarCampoTexto(acroForm, "prov", modelo3.getProv());
                            	modificarCampoTexto(acroForm, "año", anioConstitucion);
                				pdfDocument.save(MODELO_9_CUMPLIMENTADO);
                			}
                		}
                	}
                }
                
            } else {
                System.out.println("El PDF no contiene un formulario acro.");
            }
        }
    }

	private static String obtenerDiaDeFecha(String fechaConstitucion) {

		try {
	        // Parsear la fecha
	        LocalDate fechaLocal = LocalDate.parse(fechaConstitucion, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	        // Obtener el día como String (dos dígitos)
	        return String.format("%02d", fechaLocal.getDayOfMonth());
	    } catch (DateTimeParseException e) {
	        System.err.println("Error al parsear la fecha: " + e.getMessage());
	        return "";
	    }
	}
	
	// Nuevo método para obtener el mes de una fecha en formato "dd/mm/AAAA":
	private static String obtenerMesFecha(String fechaConstitucion) {
		try {
	        // Parsear la fecha
	        LocalDate fechaLocal = LocalDate.parse(fechaConstitucion, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	        // Obtener el mes como String (dos dígitos)
	        return String.format("%02d", fechaLocal.getMonthValue());
	    } catch (DateTimeParseException e) {
	        System.err.println("Error al parsear la fecha: " + e.getMessage());
	        return "";
	    }
	}

	public static void modificarCampoTexto(PDAcroForm acroForm, String campoID, String nuevoValor) {
        PDField field = acroForm.getField(campoID);
        if (field != null) {
            try {
                // Establecer el nuevo valor del campo de texto
                field.setValue(nuevoValor);
            } catch (IOException e) {
                System.err.println("Error al modificar el campo " + campoID + ": " + e.getMessage());
            }
        } else {
            System.out.println("Campo de texto no encontrado: " + campoID);
        }
    }

	private static String obtenerAnioFecha(String fechaConstitucion) {

		try {
	        // Parsear la fecha
	        LocalDate fechaLocal = LocalDate.parse(fechaConstitucion, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	        // Obtener los dos últimos dígitos del año como String
	        int anio = fechaLocal.getYear();
	        return String.format("%02d", anio);
	    } catch (DateTimeParseException e) {
	        System.err.println("Error al parsear la fecha: " + e.getMessage());
	        return "";
	    }
	}
	
	// Nuevo método para obtener los dos últimos dígitos del año de una fecha:
	private static String obtenerDosUltimosDigitosAnio(String fechaConstitucion) {
	    try {
	        // Parsear la fecha
	        LocalDate fechaLocal = LocalDate.parse(fechaConstitucion, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	        // Obtener los dos últimos dígitos del año como String
	        int anio = fechaLocal.getYear() % 100;
	        return String.format("%02d", anio);
	    } catch (DateTimeParseException e) {
	        System.err.println("Error al parsear la fecha: " + e.getMessage());
	        return "";
	    }
	}
	
	private static short comprobarEntero() {

		short numero = 0;
		boolean esInvalido;
		
		do {
			try {
				numero = Short.parseShort(sc.nextLine());
				esInvalido = false;
			} catch (NumberFormatException e) {
				mostrarMensaje("Introduce un numero!");
				esInvalido = true;
			}
		} while (esInvalido);
		
		return numero;
	}
	
	private static void mostrarMensaje(String string) {

		System.out.print(string);
	}
//	 public static String convertirNumeroATexto(int numero) {
//	        String unidades[] = new String[]{"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis",
//	                "siete", "ocho", "nueve"};
//
//	        String especiales[] = new String[]{"diez","once", "doce", "trece", "catorce", "quince", "dieciseis",
//	                "diecisiete", "dieciocho", "diecinueve"};
//
//	        String decenas[] = new String[]{ "veinte", "treinta", "cuarenta", "cincuenta", "sesenta",
//	                "setenta", "ochenta", "noventa"};
//
//	        if (numero < 10) {
//	            return unidades[numero];
//	        }
//	        if (numero < 20) {
//	            return especiales[numero - 10];
//	        }
//	        if (numero < 100 && numero % 10 == 0) {
//	            int index = (numero / 10) - 2;
//	            return decenas[index];
//	        }
//
//	        if(numero<100){
//	            int dIndex = (numero/10)-2;
//	            int uIndex = (numero%10);
//	            return decenas[dIndex] + " y " + unidades[uIndex];
//	        }
//	        //si retorna null es porque el numero  no es valido
//	        return null;
//	    }
}

