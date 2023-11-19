package cumplimentacionPDF;

public class Delegados_Modelo5_2_conclusion {

	ComprobarCIF validadorCIF = new ComprobarCIF();
	ComprobarDNI validarDNI = new ComprobarDNI();
    private String n_empresa, n_comercial, dni, domicilio, municipio, prov, actv_econo, actv_econo1,
            nombre, direccion, direccion1, municipio1, comarca, prov1, telf, c, p, actv_econo2, actv_econo3,
            seg, soc, nombre1, t_fijos, t_eventuales, t_jornadas, trabj_eventuales, t_trabajadores, centro_trabajo,
            centro_trabajo1, empresa, presidente, secretario, representantes, dni6, dni7, dni8;

    private boolean casilla_de_verificacion2 = false;
    
    public Delegados_Modelo5_2_conclusion(String n_empresa, String n_comercial, String dni, String domicilio,
            String municipio, String prov, String actv_econo, String actv_econo1, String nombre, String direccion, String direccion1, String municipio1, 
            String comarca, String prov1, String telf, String c, String actv_econo2, String actv_econo3, String seg, String soc, 
            boolean Casilla_de_verificacion2, String nombre1, String t_fijos, String t_eventuales, String t_jornadas, String trabj_eventuales,
            String t_trabajadores, String centro_trabajo, String centro_trabajo1, String empresa, String presidente,
            String secretario, String representantes, String dni6, String dni7, String dni8) throws CumplimentarPDFException {
        this.n_empresa = n_empresa;
        this.n_comercial = n_comercial;
        setDni(dni);
        this.domicilio = domicilio;
        this.municipio = municipio;
        this.prov = "SEVILLA";
        this.actv_econo = actv_econo;
        this.actv_econo1 = actv_econo1;
        this.nombre = nombre;
        this.direccion = direccion;
        this.direccion1 = direccion1;
        this.municipio1 = municipio1;
        this.comarca = comarca;
        this.prov1 = prov1;
        this.telf = telf;
        setC(c);
        this.actv_econo2 = actv_econo2;
        this.actv_econo3 = actv_econo3;
        this.seg = seg;
        this.soc = soc;
        this.casilla_de_verificacion2 = true;
        this.nombre1 = nombre1;
        this.t_fijos = t_fijos;
        this.t_eventuales = t_eventuales;
        this.t_jornadas = t_jornadas;
        this.trabj_eventuales = trabj_eventuales;
        this.t_trabajadores = t_trabajadores;
        this.centro_trabajo = centro_trabajo;
        this.centro_trabajo1 = centro_trabajo1;
        this.empresa = empresa;
        this.presidente = presidente;
        this.secretario = secretario;
        this.representantes = representantes;
        setDni6(dni6);
        setDni7(dni7);
        setDni8(dni8);
    }
    
    public Delegados_Modelo5_2_conclusion(String n_empresa, String n_comercial, String dni, String domicilio,
            String municipio, String nombre, String direccion,
            String direccion1, String municipio1,  String c, boolean Casilla_de_verificacion2,
            String centro_trabajo1, String empresa) throws CumplimentarPDFException {
        this.n_empresa = n_empresa;
        this.n_comercial = n_comercial;
        setDni(dni);
        this.domicilio = domicilio;
        this.municipio = municipio;
        this.prov = "SEVILLA";
        this.nombre = nombre;
        this.direccion = direccion;
        this.direccion1 = direccion1;
        this.municipio1 = municipio1;
        this.prov1 = "SEVILLA";
        setC(c);
        this.casilla_de_verificacion2 = true;
        this.centro_trabajo1 = centro_trabajo1;
        this.empresa = empresa;
    }
    
    public String getN_empresa() {
		return n_empresa;
	}

	public void setN_empresa(String n_empresa) {
		this.n_empresa = n_empresa;
	}

	public String getN_comercial() {
		return n_comercial;
	}

	public void setN_comercial(String n_comercial) {
		this.n_comercial = n_comercial;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) throws CumplimentarPDFException {
    	
    	if (!validadorCIF.validarCIF(dni)) {
			throw new CumplimentarPDFException("ERROR, CIF introducido incorrecto");
		}
		this.dni = dni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getProv() {
		return prov;
	}

	public void setProv(String prov) {
		this.prov = prov;
	}

	public String getActv_econo() {
		return actv_econo;
	}

	public void setActv_econo(String actv_econo) {
		this.actv_econo = actv_econo;
	}

	public String getActv_econo1() {
		return actv_econo1;
	}

	public void setActv_econo1(String actv_econo1) {
		this.actv_econo1 = actv_econo1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccion1() {
		return direccion1;
	}

	public void setDireccion1(String direccion1) {
		this.direccion1 = direccion1;
	}

	public String getMunicipio1() {
		return municipio1;
	}

	public void setMunicipio1(String municipio1) {
		this.municipio1 = municipio1;
	}

	public String getComarca() {
		return comarca;
	}

	public void setComarca(String comarca) {
		this.comarca = comarca;
	}

	public String getProv1() {
		return prov1;
	}

	public void setProv1(String prov1) {
		this.prov1 = prov1;
	}

	public String getTelf() {
		return telf;
	}

	public void setTelf(String telf) {
		this.telf = telf;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) throws CumplimentarPDFException {
		
		if (c.matches("\\d{5}")) {
			throw new CumplimentarPDFException("ERROR, Codigo Postal introducido no valido");
		}
		this.c = c;
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}

	public String getActv_econo2() {
		return actv_econo2;
	}

	public void setActv_econo2(String actv_econo2) {
		this.actv_econo2 = actv_econo2;
	}

	public String getActv_econo3() {
		return actv_econo3;
	}

	public void setActv_econo3(String actv_econo3) {
		this.actv_econo3 = actv_econo3;
	}

	public String getSeg() {
		return seg;
	}

	public void setSeg(String seg) {
		this.seg = seg;
	}

	public String getSoc() {
		return soc;
	}

	public void setSoc(String soc) {
		this.soc = soc;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getT_fijos() {
		return t_fijos;
	}

	public void setT_fijos(String t_fijos) {
		this.t_fijos = t_fijos;
	}

	public String getT_eventuales() {
		return t_eventuales;
	}

	public void setT_eventuales(String t_eventuales) {
		this.t_eventuales = t_eventuales;
	}

	public String getT_jornadas() {
		return t_jornadas;
	}

	public void setT_jornadas(String t_jornadas) {
		this.t_jornadas = t_jornadas;
	}

	public String getTrabj_eventuales() {
		return trabj_eventuales;
	}

	public void setTrabj_eventuales(String trabj_eventuales) {
		this.trabj_eventuales = trabj_eventuales;
	}

	public String getT_trabajadores() {
		return t_trabajadores;
	}

	public void setT_trabajadores(String t_trabajadores) {
		this.t_trabajadores = t_trabajadores;
	}

	public String getCentro_trabajo() {
		return centro_trabajo;
	}

	public void setCentro_trabajo(String centro_trabajo) {
		this.centro_trabajo = centro_trabajo;
	}

	public String getCentro_trabajo1() {
		return centro_trabajo1;
	}

	public void setCentro_trabajo1(String centro_trabajo1) {
		this.centro_trabajo1 = centro_trabajo1;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getPresidente() {
		return presidente;
	}

	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}

	public String getSecretario() {
		return secretario;
	}

	public void setSecretario(String secretario) {
		this.secretario = secretario;
	}

	public String getRepresentantes() {
		return representantes;
	}

	public void setRepresentantes(String representantes) {
		this.representantes = representantes;
	}

	public String getDni6() {
		return dni6;
	}

	public void setDni6(String dni6) throws CumplimentarPDFException {
    	
    	if (!validarDNI.esDNIValido(dni6)) {
    		throw new CumplimentarPDFException("ERROR, DNI introducido incorrecto");
		}
		this.dni6 = dni6;
	}

	public String getDni7() {
		return dni7;
	}

	public void setDni7(String dni7) throws CumplimentarPDFException {
    	
    	if (!validarDNI.esDNIValido(dni7)) {
    		throw new CumplimentarPDFException("ERROR, DNI introducido incorrecto");
		}
		this.dni7 = dni7;
	}

	public String getDni8() {
		return dni8;
	}

	public void setDni8(String dni8) throws CumplimentarPDFException {
    	
    	if (!validarDNI.esDNIValido(dni8)) {
    		throw new CumplimentarPDFException("ERROR, DNI introducido incorrecto");
		}
		this.dni8 = dni8;
	}

	public boolean isCasilla_de_verificacion2() {
		return casilla_de_verificacion2;
	}
}