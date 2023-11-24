package cumplimentacionPDF;

/**
 *
 * @author Alberto CR
 */

public class Delegados_Modelo3 {

	// Constantes
	public static final String PROVINCIA = "SEVILLA";
	private static final String PROMOTOR = "UNIÓN  GENERAL  DE  TRABAJADORES";

	ComprobarCIF validadorCIF = new ComprobarCIF();
	ComprobarDNI validarDNI = new ComprobarDNI();

	// Atributos
	private String nombreEmpresa, CIF, nombreComercial, nombreCentroTrabajo, direccion, municipio, provincia, lugar, horas, dia, meses, anio,
			promotor, promotorLinea2, presidencia, dni1, vocal, dni2, secretario, dni3;

	public Delegados_Modelo3(String n_empresa, String CIF, String n_comercial, String n_centro, String d_centro,
			String municipio, String prov, String lugar, String horas, String dia, String meses, String ano,
			String resolucion1, String resolucion2, String presidencia, String dni1, String vocal, String dni2,
			String secretario, String dni3) throws CumplimentarPDFException {
		this.nombreEmpresa = n_empresa;
		setCIF(CIF);
		this.nombreComercial = n_comercial;
		this.nombreCentroTrabajo = n_centro;
		this.direccion = d_centro;
		this.municipio = municipio;
		this.provincia = PROVINCIA;
		this.lugar = lugar;
		this.horas = horas;
		setDia(dia);
		setMeses(meses);
		this.anio = ano;
		this.promotor = PROMOTOR;
		this.promotorLinea2 = resolucion2;
		this.presidencia = presidencia;
		setDni4(dni1);
		this.vocal = vocal;
		setDni2(dni2);
		this.secretario = secretario;
		setDni3(dni3);
	}

	public Delegados_Modelo3(String n_empresa, String CIF, String d_centro, String municipio)
			throws CumplimentarPDFException {
		setN_empresa(n_empresa);
		setCIF(CIF);
		this.nombreComercial = n_empresa;
		this.nombreCentroTrabajo = n_empresa;
		setD_centro(d_centro);
		setMunicipio(municipio);
		this.provincia = PROVINCIA;
		this.promotor = PROMOTOR;
	}

	// Getters
	public String getN_empresa() {
		return nombreEmpresa;
	}

	public String getCIF() {
		return CIF;
	}

	public String getN_comercial() {
		return nombreComercial;
	}

	public String getN_centro() {
		return nombreCentroTrabajo;
	}

	public String getMunicipio() {
		return municipio;
	}

	public String getProv() {
		return provincia;
	}

	public String getLugar() {
		return lugar;
	}

	public String getHoras() {
		return horas;
	}

	public String getMeses() {
		return meses;
	}

	public String getAno() {
		return anio;
	}

	public String getResolucion1() {
		return promotor;
	}

	public String getResolucion2() {
		return promotorLinea2;
	}

	public String getPresidencia() {
		return presidencia;
	}

	public String getDni4() {
		return dni1;
	}

	public String getVocal() {
		return vocal;
	}

	public String getDni2() {
		return dni2;
	}

	public String getSecretario() {
		return secretario;
	}

	public String getDni3() {
		return dni3;
	}

	// Setters
	public void setN_empresa(String n_empresa) {
		this.nombreEmpresa = n_empresa;
	}

	public void setCIF(String CIF) throws CumplimentarPDFException {

		if (!validadorCIF.validarCIF(CIF)) {
			throw new CumplimentarPDFException("ERROR, CIF introducido incorrecto\n");
		}
		this.CIF = CIF;
	}

	public void setN_comercial(String n_comercial) {
		this.nombreComercial = n_comercial;
	}

	public void setN_centro(String n_centro) {
		this.nombreCentroTrabajo = n_centro;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public void setProv(String prov) {
		this.provincia = prov;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}

	public void setMeses(String meses) throws CumplimentarPDFException {

		if (Short.valueOf(meses) < 1 || Short.valueOf(meses) > 12) {
			throw new CumplimentarPDFException("ERROR, mes incorrecto\n");
		}

		for (Meses mes : Meses.values()) {
			if (meses.equals(mes.obtenerNombre())) {
				meses = mes.toString();
			}
		}
		this.meses = meses;
	}

	public void setAno(String ano) {
		this.anio = ano;
	}

	public void setResolucion1(String resolucion1) {
		this.promotor = resolucion1;
	}

	public void setResolucion2(String resolucion2) {
		this.promotorLinea2 = resolucion2;
	}

	public void setPresidencia(String presidencia) {
		this.presidencia = presidencia;
	}

	public void setDni4(String dni4) throws CumplimentarPDFException {

		if (!validarDNI.esDNIValido(dni4)) {
			throw new CumplimentarPDFException("ERROR, DNI introducido incorrecto\n");
		}
		this.dni1 = dni4;
	}

	public void setVocal(String vocal) {
		this.vocal = vocal;
	}

	public void setDni2(String dni2) throws CumplimentarPDFException {

		if (!validarDNI.esDNIValido(dni2)) {
			throw new CumplimentarPDFException("ERROR, DNI introducido incorrecto\n");
		}
		this.dni2 = dni2;
	}

	public void setSecretario(String secretario) {
		this.secretario = secretario;
	}

	public void setDni3(String dni3) throws CumplimentarPDFException {

		if (!validarDNI.esDNIValido(dni3)) {
			throw new CumplimentarPDFException("ERROR, DNI introducido incorrecto\n");
		}
		this.dni3 = dni3;
	}

	public String getD_centro() {
		return direccion;
	}

	public void setD_centro(String d_centro) {
		this.direccion = d_centro;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) throws CumplimentarPDFException {

		if (Short.valueOf(dia) < 1 || Short.valueOf(dia) > 31) {
			throw new CumplimentarPDFException("ERROR, dia incorrecto\n");
		}
		this.dia = dia;
	}
}