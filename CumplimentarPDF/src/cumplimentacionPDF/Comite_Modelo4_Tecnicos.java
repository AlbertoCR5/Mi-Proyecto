package cumplimentacionPDF;

public class Comite_Modelo4_Tecnicos extends Delegados_Modelo3{
	
	private static final String TECNICOS = "TÉCNICOS Y ADMINISTRATIVOS";
	short acta, t_mesa, varones, mujeres, numr;
	String colegio, n_mesa, lugar1;
	
	public Comite_Modelo4_Tecnicos(short acta, String colegio, String n_empresa, String CIF, String direccion, String municipio)
			throws CumplimentarPDFException {
		super(n_empresa, CIF, direccion, municipio);
		this.acta = acta;
		this.colegio = TECNICOS;
		setN_empresa(n_empresa);
		setCIF(CIF);
		setD_centro(direccion);
		setMunicipio(municipio);
	}

	public Comite_Modelo4_Tecnicos(short acta, String colegio, short t_mesa, short varones, short mujeres, String n_empresa, String CIF, String n_comercial, String n_centro, String direccion,
			String municipio, String prov, String lugar, String horas, String dia, String meses, String ano, String n_mesa, short numr,
			String lugar1, String resolucion1, String resolucion2, String presidencia, String dni1, String vocal, String dni2,
			String secretario, String dni3) throws CumplimentarPDFException {
		super(n_empresa, CIF, n_comercial, n_centro, direccion, municipio, prov, lugar, horas, dia, meses, ano, resolucion1,
				resolucion2, presidencia, dni1, vocal, dni2, secretario, dni3);
		this.acta = acta;
		this.colegio = TECNICOS;
		setN_empresa(n_empresa);
		setCIF(CIF);
		setD_centro(direccion);
		setMunicipio(municipio);
		setProv(prov);
		setT_mesa(t_mesa);
		setVarones(varones);
		setMujeres(mujeres);
		setLugar(lugar1);
		setHoras(horas);
		setDia(dia);
		setMeses(meses);
		setAno(ano);
		this.n_mesa = TECNICOS;
		this.numr = acta;
		this.lugar1 = TECNICOS;
		setPresidencia(presidencia);
		setDni4(dni1);
		setVocal(vocal);
		setDni2(dni2);
		setSecretario(secretario);
		setDni3(dni3);
	}

	public short getActa() {
		return acta;
	}

	public void setActa(short acta) {
		this.acta = acta;
	}

	public short getT_mesa() {
		return t_mesa;
	}

	public void setT_mesa(short t_mesa) throws CumplimentarPDFException {
		
		if (t_mesa <= 50) {
			throw new CumplimentarPDFException("Error, el numero de electores para elegir miembros de comité no puede ser inferior a 51");
		}
		this.t_mesa = t_mesa;
	}

	public short getVarones() {
		return varones;
	}

	public void setVarones(short varones)  throws CumplimentarPDFException {

		if (varones > getT_mesa()) {
			throw new CumplimentarPDFException("ERROR, el total de varones no puede ser mayor al de electores\n");
		}
		this.varones = varones;
	}

	public short getMujeres() {
		return mujeres;
	}

	public void setMujeres(short mujeres) {
		this.mujeres = (short) (getT_mesa() - getVarones());
	}

	public short getNumr() {
		return numr;
	}

	public void setNumr(short numr) {
		this.numr = numr;
	}

	public String getColegio() {
		return colegio;
	}

	public void setColegio(String colegio) {
		this.colegio = colegio;
	}

	public String getN_mesa() {
		return n_mesa;
	}

	public void setN_mesa(String n_mesa) {
		this.n_mesa = n_mesa;
	}

	public String getLugar1() {
		return lugar1;
	}

	public void setLugar1(String lugar1) {
		this.lugar1 = lugar1;
	}
}