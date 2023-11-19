package cumplimentacionPDF;

/**
 *
 * @author Alberto CR
 */

public class Delegados_Modelo3 {
    
    private String n_empresa, CIF, n_comercial, n_centro, d_centro, municipio, prov, lugar, horas, dia, meses, ano, resolucion1, resolucion2, presidencia, dni4, vocal, dni2, secretario, dni3;
    
    public Delegados_Modelo3(
            String n_empresa, String CIF, String n_comercial, String n_centro, String d_centro, String municipio,
            String prov, String lugar, String horas, String dia, String meses, String ano, String resolucion1,
            String resolucion2, String presidencia, String dni4, String vocal, String dni2,
            String secretario, String dni3) {
        this.n_empresa = n_empresa;
        setCIF(CIF);
        this.n_comercial = n_comercial;
        this.n_centro = n_centro;
        this.d_centro = d_centro;
        this.municipio = municipio;
        this.prov = ModificarCamposTextoPDF.PROVINCIA;
        this.lugar = lugar;
        this.horas = horas;
        this.dia = dia;
        this.meses = meses;
        this.ano = ano;
        this.resolucion1 = ModificarCamposTextoPDF.PROMOTOR;
        this.resolucion2 = resolucion2;
        this.presidencia = presidencia;
        this.dni4 = dni4;
        this.vocal = vocal;
        this.dni2 = dni2;
        this.secretario = secretario;
        this.dni3 = dni3;
    }
    
    public Delegados_Modelo3(
            String n_empresa, String CIF, String d_centro, String municipio) {
        this.n_empresa = n_empresa;
        setCIF(CIF);
        this.n_comercial = "EL MISMO";
        this.n_centro = n_empresa;
        this.d_centro = d_centro;
        this.municipio = municipio;
        this.prov = "SEVILLA";
        this.resolucion1 = ModificarCamposTextoPDF.PROMOTOR;
       
    }
    
    // Getters
    public String getN_empresa() {
        return n_empresa;
    }

    public String getCIF() {
        return CIF;
    }

    public String getN_comercial() {
        return n_comercial;
    }

    public String getN_centro() {
        return n_centro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getProv() {
        return prov;
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
        return ano;
    }

    public String getResolucion1() {
        return resolucion1;
    }

    public String getResolucion2() {
        return resolucion2;
    }

    public String getPresidencia() {
        return presidencia;
    }

    public String getDni4() {
        return dni4;
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
        this.n_empresa = n_empresa;
    }

    public void setCIF(String CIF) {
    	
    	ComprobarCIF validadorCIF = new ComprobarCIF();
    	
    	if (!validadorCIF.validarCIF(CIF)) {
			System.out.println("ERROR, El CIF indicado no es correcto");
		}
    	else {
    		this.CIF = CIF;
    	}
    }

    public void setN_comercial(String n_comercial) {
        this.n_comercial = n_comercial;
    }

    public void setN_centro(String n_centro) {
        this.n_centro = n_centro;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public void setMeses(String meses) {
        this.meses = meses;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setResolucion1(String resolucion1) {
        this.resolucion1 = resolucion1;
    }

    public void setResolucion2(String resolucion2) {
        this.resolucion2 = resolucion2;
    }

    public void setPresidencia(String presidencia) {
        this.presidencia = presidencia;
    }

    public void setDni4(String dni4) {
        this.dni4 = dni4;
    }

    public void setVocal(String vocal) {
        this.vocal = vocal;
    }

    public void setDni2(String dni2) {
        this.dni2 = dni2;
    }

    public void setSecretario(String secretario) {
        this.secretario = secretario;
    }

    public void setDni3(String dni3) {
        this.dni3 = dni3;
    }

	public String getD_centro() {
		return d_centro;
	}

	public void setD_centro(String d_centro) {
		this.d_centro = d_centro;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}
}

