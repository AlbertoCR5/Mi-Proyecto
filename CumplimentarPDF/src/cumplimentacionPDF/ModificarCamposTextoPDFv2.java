package cumplimentacionPDF;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

public class ModificarCamposTextoPDFv2 {

    public static final String PROVINCIA = "SEVILLA";
    public static final String PROMOTOR = "UNION GENERAL DE TRABAJADORES";
    //Constantes con directorios de las actas para delegados
    public static final String MODELO_3 = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_3.pdf";
    public static final String MODELO_5_1 = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_5_1.pdf";
    public static final String MODELO_5_2_PROCESO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_5_2_proceso.pdf";
    public static final String MODELO_5_2_CONCLUSION = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_5_2_conclusion.pdf";
    public static final String MODELO_9 = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_9.pdf";
    public static final String MODELO_3_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_3_CUMPLIMENTADO ";
    public static final String MODELO_5_1_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_5_1_CUMPLIMENTADO ";
    public static final String MODELO_5_2_PROCESO_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_5_2_proceso_CUMPLIMENTADO ";
    public static final String MODELO_5_2_CONCLUSION_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_5_2_conclusion_CUMPLIMENTADO ";
    public static final String MODELO_9_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_9_CUMPLIMENTADO ";
    
    //Constantes con directorios de las actas para comite
    public static final String MODELO_3_COMITE = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\Modelo_3.pdf";
	public static final String MODELO_4_ESPECIALISTAS = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_4_Especialistas.pdf";
	public static final String MODELO_4_TECNICOS      = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_4_Tecnicos.pdf";
	public static final String MODELO_6_1_ESPECIALISTAS = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_6_1_Especialistas.pdf";
	public static final String MODELO_6_1_TECNICOS = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_6_1_Tecnicos.pdf";
	public static final String MODELO_6_2_ESPECIALISTAS = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_6_2_Especialistas.pdf";
	public static final String MODELO_6_2_TECNICOS = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_6_2_Tecnicos.pdf";
	public static final String MODELO_6_3_ESPECIALISTASE = "C:\\\sers\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_6_3_Especialistas.pdf";
	public static final String MODELO_6_3_TECNICOS = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_6_3_Tecnicos.pdf";
	public static final String MODELO_7_1 = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_7_1.pdf";
	public static final String MODELO_7_2 = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_7_2.pdf";
	public static final String MODELO_7_3_ACTA_GLOBAL = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_7_3_acta_global.pdf";
	public static final String MODELO_7_3_ANEXO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_7_3_anexo.pdf";
	public static final String MODELO_7_3_PROCESO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_7_3_proceso.pdf";
	public static final String MODELO_9_COMITE = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_9.pdf";
	public static final String MODELO_3_COMITE_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\Modelo_3_CUMPLIMENTADO ";
	public static final String MODELO_4_ESPECIALISTAS_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_4_Especialistas_CUMPLIMENTADO ";
	public static final String MODELO_4_TECNICOS_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_4_Tecnicos_CUMPLIMENTADO ";
	public static final String MODELO_6_1_ESPECIALISTAS_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_6_1_Especialistas_CUMPLIMENTADO ";
	public static final String MODELO_6_1_TECNICOS_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_6_1_Tecnicos_CUMPLIMENTADO ";
	public static final String MODELO_6_2_ESPECIALISTAS_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_6_2_Especialistas_CUMPLIMENTADO ";
	public static final String MODELO_6_2_TECNICOS_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_6_2_Tecnicos_CUMPLIMENTADO ";
	public static final String MODELO_6_3_ESPECIALISTAS_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_6_3_Especialistas_CUMPLIMENTADO ";
	public static final String MODELO_6_3_TECNICOS_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_6_3_Tecnicos_CUMPLIMENTADO ";
	public static final String MODELO_7_1_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_7_1_CUMPLIMENTADO ";
	public static final String MODELO_7_2_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_7_2_CUMPLIMENTADO ";
	public static final String MODELO_7_3_ACTA_GLOBAL_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_7_3_acta_global_CUMPLIMENTADO ";
	public static final String MODELO_7_3_ANEXO_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_7_3_anexo_CUMPLIMENTADO ";
	public static final String MODELO_7_3_PROCESO_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_7_3_proceso_CUMPLIMENTADO ";
	public static final String MODELO_9_TECNICOS_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Comite\\modelo_9_CUMPLIMENTADO ";
    public static final String EXTENSION = ".pdf";

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
    	
        short opcion;
        
        do {
        	opcion = mostrarMenu();
        	try {
				tratarMenu(opcion);
			} catch (CumplimentarPDFException e) {
				mostrarMensaje(e.getMessage());
				e.printStackTrace();
			}
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
        			+ "\n(7) Imprimir"        			
        			+ "\n(0) Salir\n");
    		opcion = comprobarEntero();
		} while (opcion < 0 || opcion > 6);
    	
    	
		return opcion;
	}
	
	private static void tratarMenu(int opcion) throws CumplimentarPDFException {
		
    	String nombreEmpresa, CIF, municipio, direccion, fechaConstitucion, diaVotacion, mesVotacion, CP;
		short totalElectores, varones, opcionImprimir;
    	
		switch (opcion) {

		case 1:
			// Ruta de los formularios PDF
			String[] rutaFormulario = { MODELO_3, MODELO_5_1, MODELO_5_2_PROCESO, MODELO_5_2_CONCLUSION, MODELO_9 };
			
			nombreEmpresa = solicitarNombreEmpresa("Nombre de la empresa: ");
			CIF = solicitarCIF("CIF: ");
			municipio = solicitarMunicipio("Municipio: ");
			direccion = solicitarDireccion("Direccion: ");
			fechaConstitucion = solicitarFechaConstitucion("Fecha Constitucion (FORMATO dd/mm/AAAA): ");
			CP = solicitarCodigoPostal("Codigo Postal: ");
			diaVotacion = solicitarDiaVotacion("Dia Votacion: ");
			mesVotacion = solicitarMesVotacion("Mes Votacion: ");
			totalElectores = solicitarElectores("Total electores: ");
			varones = solicitarVarones("Varones: ", totalElectores);
			
			
			Delegados_Modelo3 modelo3 = new Delegados_Modelo3(nombreEmpresa, CIF, direccion, municipio);
			Delegados_Modelo5_1 modelo5_1 = new Delegados_Modelo5_1(nombreEmpresa, CIF, mesVotacion, direccion, municipio, fechaConstitucion);
			Delegados_Modelo5_2_proceso modelo5_2P = new Delegados_Modelo5_2_proceso(diaVotacion, mesVotacion, totalElectores, varones, (short) (totalElectores - varones), totalElectores);
			Delegados_Modelo5_2_conclusion modelo5_2C = new Delegados_Modelo5_2_conclusion(nombreEmpresa, nombreEmpresa, CIF, direccion, municipio, nombreEmpresa, direccion, direccion, municipio, CP, true, nombreEmpresa, nombreEmpresa);
			Delegados_Modelo9 modelo9 = new Delegados_Modelo9(nombreEmpresa, CIF, direccion, municipio);
	    	
			for (String ruta : rutaFormulario) {
				try {
					modificarCamposTextoPDF(ruta, modelo3, modelo5_1, modelo5_2P, modelo5_2C, modelo9);
				} catch (IOException e) {
					mostrarMensaje(e.getMessage());
				}
			}
			break;
			
		case 2:
			// Ruta de los formularios PDF
			String[] rutaFormulario2 = {MODELO_5_1, MODELO_5_2_PROCESO, MODELO_5_2_CONCLUSION, MODELO_9};
			
			nombreEmpresa = solicitarNombreEmpresa("Nombre de la empresa: ");
			CIF = solicitarCIF("CIF: ");
			municipio = solicitarMunicipio("Municipio: ");
			direccion = solicitarDireccion("Direccion: ");
			fechaConstitucion = solicitarFechaConstitucion("Fecha Constitucion (FORMATO dd/mm/AAAA): ");
			CP = solicitarCodigoPostal("Codigo Postal: ");
			diaVotacion = solicitarDiaVotacion("Dia Votacion: ");
			mesVotacion = solicitarMesVotacion("Mes Votacion: ");
			totalElectores = solicitarElectores("Total electores: ");
			varones = solicitarVarones("Varones: ", totalElectores);
			
			modelo3 = new Delegados_Modelo3(nombreEmpresa, CIF, direccion, municipio);
			modelo5_1 = new Delegados_Modelo5_1(nombreEmpresa, CIF, mesVotacion, direccion, municipio, fechaConstitucion);
			modelo5_2P = new Delegados_Modelo5_2_proceso(diaVotacion, mesVotacion, totalElectores, varones, (short) (totalElectores - varones), totalElectores);
			modelo5_2C = new Delegados_Modelo5_2_conclusion(nombreEmpresa, nombreEmpresa, CIF, direccion, municipio, nombreEmpresa, direccion, direccion, municipio, CP, true, nombreEmpresa, nombreEmpresa);
			modelo9 = new Delegados_Modelo9(nombreEmpresa, CIF, direccion, municipio);
			
			// Ruta del formulario PDF
			for (String ruta : rutaFormulario2) {
				try {
					modificarCamposTextoPDF(ruta, modelo3, modelo5_1, modelo5_2P, modelo5_2C, modelo9);
				} catch (IOException e) {
					mostrarMensaje(e.getMessage());
				}
			}
			break;
			
		case 3:
			// Ruta del formularios PDF
			String rutaFormulario3 = MODELO_3;
			
			nombreEmpresa = solicitarNombreEmpresa("Nombre de la empresa: ");
			CIF = solicitarCIF("CIF: ");
			municipio = solicitarMunicipio("Municipio: ");
			direccion = solicitarDireccion("Direccion: ");
			fechaConstitucion = solicitarFechaConstitucion("Fecha Constitucion (FORMATO dd/mm/AAAA): ");

			modelo3 = new Delegados_Modelo3(nombreEmpresa, CIF, direccion, municipio);
			modelo5_1 = new Delegados_Modelo5_1(nombreEmpresa, CIF, "12", direccion, municipio, fechaConstitucion);
			modelo5_2P = new Delegados_Modelo5_2_proceso("12", "12", (short) 12, (short) 12, (short) (12 - 12), (short) 12);
			modelo5_2C = new Delegados_Modelo5_2_conclusion(nombreEmpresa, nombreEmpresa, CIF, direccion, municipio, nombreEmpresa, direccion, direccion, municipio, "41000", false, nombreEmpresa, nombreEmpresa);
			modelo9 = new Delegados_Modelo9(nombreEmpresa, CIF, direccion, municipio);
			
			// Ruta del formulario PDF
			try {
				modificarCamposTextoPDF(rutaFormulario3, modelo3, modelo5_1, modelo5_2P, modelo5_2C, modelo9);
			} catch (IOException e) {
				mostrarMensaje(e.getMessage());
			}
			break;
//		case value:
//
//			break;

		case 7:
			opcionImprimir = mostrarMenuImprimir();
			tratarMenuImprimir(opcionImprimir);
			break;
		default:
			mostrarMensaje("Adios");
			sc.close();
			break;
		}

	}

	private static void tratarMenuImprimir(short opcionImprimir) {

		Imprimir impresion = new Imprimir();
		switch (opcionImprimir) {
		case 1:
			mostrarMensaje("Lanzando impresión de Todos los modelos de delegados No Cumplimentados");
			impresion.imprimirDelegados();
			break;
			
		case 4:
			mostrarMensaje("Lanzando impresión de Todos los modelos de comité No Cumplimentados");
			impresion.imprimirComites();
			break;

		case 7:
			String nombreEmpresa = solicitarNombreEmpresa("Nombre de la empresa a imprimir: ");
			mostrarMensaje("Lanzando impresión de Todos los modelos anteriormente Cumplimentados");
			impresion.imprimirCumplimentados(nombreEmpresa);
			break;
		default:
			mostrarMensaje("Adios");
			sc.close();
			break;
		}
		
	}

	private static short mostrarMenuImprimir() {

		short opcionImprimir;
		do {
    		mostrarMensaje("Seleccione modelos a imprimir"
        			+ "\nDELEGADOS"
        			+ "\n(1) Todos los modelos de delegado No Cumplimentado"
        			+ "\n(2) Modelos de escrutinio de delegados No Cumplimentado"
        			+ "\n(3) Modelo 3 No Cumplimentado"
        			+ "\n"
        			+ "\nCOMITE"
        			+ "\n(4) Todos los modelos de comite No Cumplimentado"
        			+ "\n(5) Modelos de escrutinio de delegados No Cumplimentado"
        			+ "\n(6) Modelos 3 y 4 No Cumplimentado"
        			+ "\n"
        			+ "\nCUMPLIMETADOS"
        			+ "\n(7) Imprimir modelos anteriormente Cumplimentados"        			
        			+ "\n(8) Volver"
        			+ "\n(0) Salir\n");
    		opcionImprimir = comprobarEntero();
		} while (opcionImprimir < 0 || opcionImprimir > 8);
		
		return opcionImprimir;
	}

	private static short solicitarVarones(String string, short totalElectores) {

		boolean esValido;
		short varones;

		do {
			esValido = true;
			mostrarMensaje(string);
			varones = sc.nextShort();
			if (varones > totalElectores) {
				esValido = false;
				mostrarMensaje("ERROR, el numero de electores varones no puede ser superior al de electores\n");
			}
		} while (!esValido);

		return varones;
	}

	private static short solicitarElectores(String string) {

		mostrarMensaje("Total electores: ");
		short totalElectores = sc.nextShort();
		
		return totalElectores;
	}

	private static String solicitarMesVotacion(String string) {

		boolean esValido;
		String mes;

		do {
			esValido = true;
			mostrarMensaje(string);
			mes = sc.nextLine();

			if (Short.valueOf(mes) < 1 || Short.valueOf(mes) > 12) {
				esValido = false;
				mostrarMensaje("ERROR, mes introducido incorrecto\n");
			}
		} while (!esValido);
		
		return mes;
	}

	private static String solicitarDiaVotacion(String string) {

		boolean esValido;
		String dia;

			do {
				esValido = true;
				mostrarMensaje(string);
				dia = sc.nextLine();
				
				if (Short.valueOf(dia) < 1 || Short.valueOf(dia) > 31) {
					mostrarMensaje("ERROR, dia introducido incorrecto\n");
					esValido = false;
				}
			} while (!esValido);
			
		return dia;
	}

	private static String solicitarCodigoPostal(String string) {

		boolean esValido;
		String CP;

		do {
			esValido = true;
			mostrarMensaje(string);
			CP = sc.nextLine();
			
			if (!(CP.matches("\\d{5}"))) {
				esValido = false;
				mostrarMensaje("ERROR, Codigo Postal incorrecto\n");
			}
		} while (!esValido);
		
		return CP;
	}

	private static String solicitarFechaConstitucion(String string) {

		ValidadorFecha validadorFecha = new ValidadorFecha();
		String fechaConstitucion;
		
		do {
			mostrarMensaje(string);
			fechaConstitucion = sc.nextLine();
		} while (!validadorFecha.esFormatoFechaValido(fechaConstitucion) || fechaConstitucion.length() != 10);
		
		return fechaConstitucion;
	}

	private static String solicitarDireccion(String string) {
		
		mostrarMensaje(string);
		String direccion = sc.nextLine().toUpperCase();
		
		return direccion;
	}

	private static String solicitarMunicipio(String string) {

		mostrarMensaje(string);
		String municipio = sc.nextLine().toUpperCase();
		
		return municipio;
	}

	private static String solicitarCIF(String string) {
		
		String CIF;
		ComprobarCIF validarCIF = new ComprobarCIF();
		boolean esValido;
		
		do {
			mostrarMensaje(string);
			CIF = sc.nextLine().toUpperCase();
			esValido = true;

			if (!validarCIF.validarCIF(CIF)) {
				esValido = false;
				mostrarMensaje("ERROR, CIF Incorrecto\n");
			}

		} while (!esValido);
		
		return CIF;
	}

	private static String solicitarNombreEmpresa(String string) {

		mostrarMensaje(string);
		String nombreEmpresa= sc.nextLine().toUpperCase();
		
		return nombreEmpresa;
	}

	public static void modificarCamposTextoPDF(String rutaFormulario, Delegados_Modelo3 modelo3, Delegados_Modelo5_1 modelo5_1, Delegados_Modelo5_2_proceso modelo5_2P, Delegados_Modelo5_2_conclusion modelo5_2C, Delegados_Modelo9 modelo9) throws IOException, CumplimentarPDFException {
        try (PDDocument pdfDocument = PDDocument.load(new File(rutaFormulario))) {
        	
    		String diaConstitucion = obtenerDiaDeFecha(modelo5_1.getF_constitucion());
    		String mesConstitucion = obtenerMesFecha(modelo5_1.getF_constitucion());
    		String anioConstitucion = obtenerAnioFecha(modelo5_1.getF_constitucion());
			String anioConstitucionFormateado = obtenerDosUltimosDigitosAnio(modelo5_1.getF_constitucion());
			modelo3.setMeses(mesConstitucion);
			modelo9.setMes(modelo5_2P.getMes1());
            // Obtener el formulario acro
            PDDocumentCatalog docCatalog = pdfDocument.getDocumentCatalog();
            PDAcroForm acroForm = docCatalog.getAcroForm();
            
            if (acroForm != null) {
            	
                 //Modificar campos de texto específicos            
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
                	modificarCampoTexto(acroForm, "meses", modelo3.getMeses());
                	modificarCampoTexto(acroForm, "año", anioConstitucionFormateado);
                	modificarCampoTexto(acroForm, "resolución1", modelo3.getResolucion1());
                	// Guardar el PDF modificado
                	pdfDocument.save(MODELO_3_CUMPLIMENTADO.concat(modelo3.getN_empresa()).concat(EXTENSION));
				}
                else {
                	if (rutaFormulario.equals(MODELO_5_1) && (modelo5_2C.isCasilla_de_verificacion2())) {
                		modificarCampoTexto(acroForm, "n_empresa", modelo5_1.getN_empresa());
                		modificarCampoTexto(acroForm, "n_comercial", modelo5_1.getN_empresa());
                    	modificarCampoTexto(acroForm, "n_CIF", modelo5_1.getN_CIF());
                    	modificarCampoTexto(acroForm, "n_centro", modelo5_1.getN_empresa());
                    	modificarCampoTexto(acroForm, "n_direccion", modelo5_1.getN_direccion());
                    	modificarCampoTexto(acroForm, "municipio", modelo5_1.getMunicipio());
                    	modificarCampoTexto(acroForm, "prov", modelo5_1.getProv());
                    	modificarCampoTexto(acroForm, "f_constitucion", modelo5_1.toString().concat("    (".concat(modelo5_1.getF_constitucion()).concat(")")));
                    	// Guardar el PDF modificado
                    	pdfDocument.save(MODELO_5_1_CUMPLIMENTADO.concat(modelo3.getN_empresa()).concat(EXTENSION));
    				}
                	else {
                		if (rutaFormulario.equals(MODELO_5_2_PROCESO) && (modelo5_2C.isCasilla_de_verificacion2())) {
                			modificarCampoTexto(acroForm, "dia1", modelo5_2P.getDia1());
                    		modificarCampoTexto(acroForm, "mes1", modelo5_2P.getMes1());
                        	modificarCampoTexto(acroForm, "t_electores", String.valueOf(modelo5_2P.getT_electores()));
                        	modificarCampoTexto(acroForm, "e_varones", String.valueOf(modelo5_2P.getE_varones()));
                        	modificarCampoTexto(acroForm, "e_mujeres", String.valueOf((modelo5_2P.getT_electores()-modelo5_2P.getE_varones())));
                        	modificarCampoTexto(acroForm, "e_total", String.valueOf(modelo5_2P.getT_electores()));
                        	modificarCampoTexto(acroForm, "n_representantes", String.valueOf(modelo5_2P.getN_representantes()));
                        	// Guardar el PDF modificado
                        	pdfDocument.save(MODELO_5_2_PROCESO_CUMPLIMENTADO.concat(modelo3.getN_empresa()).concat(EXTENSION));
        				}
                		else {
                			if (rutaFormulario.equals(MODELO_5_2_CONCLUSION) && (modelo5_2C.isCasilla_de_verificacion2())) {
                				PDButton button = (PDButton) acroForm.getField("Casilla de verificación2");
                				modificarCampoTexto(acroForm, "n_empresa", modelo5_2C.getN_empresa());
                            	modificarCampoTexto(acroForm, "n_comercial", modelo5_2C.getN_empresa());
                            	modificarCampoTexto(acroForm, "dni", modelo5_2C.getDni());
                            	modificarCampoTexto(acroForm, "domicilio", modelo5_2C.getDomicilio());
                            	modificarCampoTexto(acroForm, "municipio", modelo5_2C.getMunicipio());
                            	modificarCampoTexto(acroForm, "prov", modelo5_2C.getProv());
                            	modificarCampoTexto(acroForm, "nombre", modelo5_2C.getN_empresa());
                            	modificarCampoTexto(acroForm, "dirección", modelo5_2C.getDireccion());
                            	modificarCampoTexto(acroForm, "dirección1", "");
                            	modificarCampoTexto(acroForm, "municipio1", modelo5_2C.getMunicipio());
                            	modificarCampoTexto(acroForm, "prov1", modelo5_2C.getProv());
                            	modificarCampoTexto(acroForm, "c.p", modelo5_2C.getCP());
                            	button.setValue("Sí");
                            	modificarCampoTexto(acroForm, "centro trabajo1", modelo5_2C.getN_empresa());
                            	modificarCampoTexto(acroForm, "empresa", modelo5_2C.getN_empresa());
                            	// Guardar el PDF modificado
                            	pdfDocument.save(MODELO_5_2_CONCLUSION_CUMPLIMENTADO.concat(modelo3.getN_empresa()).concat(EXTENSION));
            				}
                			else {
                				if (rutaFormulario.equals(MODELO_9) && (modelo5_2C.isCasilla_de_verificacion2())) {
                					modificarCampoTexto(acroForm, "n_empresa", modelo9.getN_empresa());
                    				modificarCampoTexto(acroForm, "cif", modelo9.getCif());
                            		modificarCampoTexto(acroForm, "n_comecial", modelo9.getN_empresa());
                                	modificarCampoTexto(acroForm, "n_trabajo", modelo9.getN_empresa());
                                	modificarCampoTexto(acroForm, "direccion", modelo9.getDireccion());
                                	modificarCampoTexto(acroForm, "municipio", modelo3.getMunicipio());
                                	modificarCampoTexto(acroForm, "prov", modelo3.getProv());
                                	modificarCampoTexto(acroForm, "dia", modelo5_2P.getDia1());
                                	modificarCampoTexto(acroForm, "mes", modelo9.getMes());
                                	modificarCampoTexto(acroForm, "año", anioConstitucion);
                                	modificarCampoTexto(acroForm, "total", String.valueOf(modelo5_2P.getN_representantes()));
                                	// Guardar el PDF modificado
                    				pdfDocument.save(MODELO_9_CUMPLIMENTADO.concat(modelo3.getN_empresa()).concat(EXTENSION));
                				}
                				
                			}
                		}
                	}
                }
                
            } else {
                System.out.println("El PDF no contiene un formulario acro.");
            }
        }
    }

	public static String obtenerDiaDeFecha(String fechaConstitucion) {

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
	public static String obtenerMesFecha(String fechaConstitucion) {
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

	public static String obtenerAnioFecha(String fechaConstitucion) {

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
	
	public static void mostrarMensaje(String string) {

		System.out.print(string);
	}
}