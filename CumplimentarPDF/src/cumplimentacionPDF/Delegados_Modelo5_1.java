/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cumplimentacionPDF;

/**
 *
 * @author Alberto CR
 */
public class Delegados_Modelo5_1 {
    
	ComprobarCIF validadorCIF = new ComprobarCIF();
	ComprobarDNI validarDNI = new ComprobarDNI();
	ValidadorFecha validadorFecha = new ValidadorFecha();
    private String n_empresa, n_comercial, n_CIF, n_centro, n_direccion, municipio, prov, f_constitucion,
            fecha, nombre1, dni1, n_votos1, sindicato1, nombre2, dni2, n_votos2, sindicato2, nombre3, dni3, n_votos3,
            sindicato3, nombre4, dni4, n_votos4, sindicato4, nombre5, dni5, n_votos5, sindicato5, nombre6, dni6,
            n_votos6, sindicato6, nombre7, dni7, n_votos7, sindicato7, nombre8, dni8, n_votos8, sindicato8, nombre9,
            dni9, n_votos9, sindicato9, nombre10, dni10, n_votos10, sindicato10, reclamaciones1, reclamaciones2,
            reclamaciones3, resol_mesa;

    // Constructor
    public Delegados_Modelo5_1(String n_empresa, String n_comercial, String n_CIF, String n_centro, String n_direccion,
            String municipio, String prov, String f_constitucion, String fecha, String nombre1, String dni1,
            String n_votos1, String sindicato1, String nombre2, String dni2, String n_votos2, String sindicato2,
            String nombre3, String dni3, String n_votos3, String sindicato3, String nombre4, String dni4, String n_votos4,
            String sindicato4, String nombre5, String dni5, String n_votos5, String sindicato5, String nombre6, String dni6,
            String n_votos6, String sindicato6, String nombre7, String dni7, String n_votos7, String sindicato7,
            String nombre8, String dni8, String n_votos8, String sindicato8, String nombre9, String dni9, String n_votos9,
            String sindicato9, String nombre10, String dni10, String n_votos10, String sindicato10, String reclamaciones1,
            String reclamaciones2, String reclamaciones3, String resol_mesa) throws CumplimentarPDFException {
        this.n_empresa = n_empresa;
        this.n_comercial = n_comercial;
        setN_CIF(n_CIF);
        this.n_centro = n_centro;
        this.n_direccion = n_direccion;
        this.municipio = municipio;
        this.prov = "SEVILLA";
        setF_constitucion(f_constitucion);
        this.fecha = fecha;
        this.nombre1 = nombre1;
        setDni1(dni1);
        this.n_votos1 = n_votos1;
        this.sindicato1 = sindicato1;
        this.nombre2 = nombre2;
        setDni2(dni2);
        this.n_votos2 = n_votos2;
        this.sindicato2 = sindicato2;
        this.nombre3 = nombre3;
        setDni4(dni3);
        this.n_votos3 = n_votos3;
        this.sindicato3 = sindicato3;
        this.nombre4 = nombre4;
        setDni4(dni4);
        this.n_votos4 = n_votos4;
        this.sindicato4 = sindicato4;
        this.nombre5 = nombre5;
        setDni5(dni5);
        this.n_votos5 = n_votos5;
        this.sindicato5 = sindicato5;
        this.nombre6 = nombre6;
        setDni6(dni6);
        this.n_votos6 = n_votos6;
        this.sindicato6 = sindicato6;
        this.nombre7 = nombre7;
        setDni7(dni7);
        this.n_votos7 = n_votos7;
        this.sindicato7 = sindicato7;
        this.nombre8 = nombre8;
        setDni8(dni8);
        this.n_votos8 = n_votos8;
        this.sindicato8 = sindicato8;
        this.nombre9 = nombre9;
        setDni9(dni9);
        this.n_votos9 = n_votos9;
        this.sindicato9 = sindicato9;
        this.nombre10 = nombre10;
        setDni10(dni10);
        this.n_votos10 = n_votos10;
        this.sindicato10 = sindicato10;
        this.reclamaciones1 = reclamaciones1;
        this.reclamaciones2 = reclamaciones2;
        this.reclamaciones3 = reclamaciones3;
        this.resol_mesa = resol_mesa;
    }
    
    public Delegados_Modelo5_1(String n_empresa, String n_CIF, String n_centro, String n_direccion,
            String municipio, String f_constitucion) throws CumplimentarPDFException {
        setN_empresa(n_empresa);
        this.n_comercial = n_empresa;
        setN_CIF(n_CIF);
        this.n_centro = n_empresa;
        setN_direccion(n_direccion);
        setMunicipio(municipio);
        this.prov = Delegados_Modelo3.PROVINCIA;
        setF_constitucion(f_constitucion);
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

	public String getN_CIF() {
		return n_CIF;
	}

	public void setN_CIF(String n_CIF) throws CumplimentarPDFException {
		
		if (!validadorCIF.validarCIF(n_CIF)) {
			throw new CumplimentarPDFException("ERROR, CIF introducido incorrecto");
		}
		this.n_CIF = n_CIF;
	}

	public String getN_centro() {
		return n_centro;
	}

	public void setN_centro(String n_centro) {
		this.n_centro = n_centro;
	}

	public String getN_direccion() {
		return n_direccion;
	}

	public void setN_direccion(String n_direccion) {
		this.n_direccion = n_direccion;
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

	public String getF_constitucion() {
		return f_constitucion;
	}

	public void setF_constitucion(String f_constitucion) throws CumplimentarPDFException {
		
		if (!validadorFecha.esFormatoFechaValido(fecha)) {
			throw new CumplimentarPDFException("ERROR, Formato de fecha no válido");
		}
		this.f_constitucion = f_constitucion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getDni1() {
		return dni1;
	}

	public void setDni1(String dni1) throws CumplimentarPDFException {
		
		if (!validarDNI.esDNIValido(dni1)) {
    		throw new CumplimentarPDFException("ERROR, DNI introducido incorrecto");
		}
		this.dni1 = dni1;
	}

	public String getN_votos1() {
		return n_votos1;
	}

	public void setN_votos1(String n_votos1) {
		this.n_votos1 = n_votos1;
	}

	public String getSindicato1() {
		return sindicato1;
	}

	public void setSindicato1(String sindicato1) {
		this.sindicato1 = sindicato1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getDni2() {
		return dni2;
	}

	public void setDni2(String dni2) throws CumplimentarPDFException {
		
		if (!validarDNI.esDNIValido(dni2)) {
    		throw new CumplimentarPDFException("ERROR, DNI introducido incorrecto");
		}
		this.dni2 = dni2;
	}

	public String getN_votos2() {
		return n_votos2;
	}

	public void setN_votos2(String n_votos2) {
		this.n_votos2 = n_votos2;
	}

	public String getSindicato2() {
		return sindicato2;
	}

	public void setSindicato2(String sindicato2) {
		this.sindicato2 = sindicato2;
	}

	public String getNombre3() {
		return nombre3;
	}

	public void setNombre3(String nombre3) {
		this.nombre3 = nombre3;
	}

	public String getDni3() {
		return dni3;
	}

	public void setDni3(String dni3) throws CumplimentarPDFException {
		
		if (!validarDNI.esDNIValido(dni1)) {
    		throw new CumplimentarPDFException("ERROR, DNI introducido incorrecto");
		}
		this.dni3 = dni3;
	}

	public String getN_votos3() {
		return n_votos3;
	}

	public void setN_votos3(String n_votos3) {
		this.n_votos3 = n_votos3;
	}

	public String getSindicato3() {
		return sindicato3;
	}

	public void setSindicato3(String sindicato3) {
		this.sindicato3 = sindicato3;
	}

	public String getNombre4() {
		return nombre4;
	}

	public void setNombre4(String nombre4) {
		this.nombre4 = nombre4;
	}

	public String getDni4() {
		return dni4;
	}

	public void setDni4(String dni4) throws CumplimentarPDFException {
		
		if (!validarDNI.esDNIValido(dni4)) {
    		throw new CumplimentarPDFException("ERROR, DNI introducido incorrecto");
		}
		this.dni4 = dni4;
	}

	public String getN_votos4() {
		return n_votos4;
	}

	public void setN_votos4(String n_votos4) {
		this.n_votos4 = n_votos4;
	}

	public String getSindicato4() {
		return sindicato4;
	}

	public void setSindicato4(String sindicato4) {
		this.sindicato4 = sindicato4;
	}

	public String getNombre5() {
		return nombre5;
	}

	public void setNombre5(String nombre5) {
		this.nombre5 = nombre5;
	}

	public String getDni5() {
		return dni5;
	}

	public void setDni5(String dni5) throws CumplimentarPDFException {
		
		if (!validarDNI.esDNIValido(dni5)) {
    		throw new CumplimentarPDFException("ERROR, DNI introducido incorrecto");
		}
		this.dni5 = dni5;
	}

	public String getN_votos5() {
		return n_votos5;
	}

	public void setN_votos5(String n_votos5) {
		this.n_votos5 = n_votos5;
	}

	public String getSindicato5() {
		return sindicato5;
	}

	public void setSindicato5(String sindicato5) {
		this.sindicato5 = sindicato5;
	}

	public String getNombre6() {
		return nombre6;
	}

	public void setNombre6(String nombre6) {
		this.nombre6 = nombre6;
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

	public String getN_votos6() {
		return n_votos6;
	}

	public void setN_votos6(String n_votos6) {
		this.n_votos6 = n_votos6;
	}

	public String getSindicato6() {
		return sindicato6;
	}

	public void setSindicato6(String sindicato6) {
		this.sindicato6 = sindicato6;
	}

	public String getNombre7() {
		return nombre7;
	}

	public void setNombre7(String nombre7) {
		this.nombre7 = nombre7;
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

	public String getN_votos7() {
		return n_votos7;
	}

	public void setN_votos7(String n_votos7) {
		this.n_votos7 = n_votos7;
	}

	public String getSindicato7() {
		return sindicato7;
	}

	public void setSindicato7(String sindicato7) {
		this.sindicato7 = sindicato7;
	}

	public String getNombre8() {
		return nombre8;
	}

	public void setNombre8(String nombre8) {
		this.nombre8 = nombre8;
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

	public String getN_votos8() {
		return n_votos8;
	}

	public void setN_votos8(String n_votos8) {
		this.n_votos8 = n_votos8;
	}

	public String getSindicato8() {
		return sindicato8;
	}

	public void setSindicato8(String sindicato8) {
		this.sindicato8 = sindicato8;
	}

	public String getNombre9() {
		return nombre9;
	}

	public void setNombre9(String nombre9) {
		this.nombre9 = nombre9;
	}

	public String getDni9() {
		return dni9;
	}

	public void setDni9(String dni9) throws CumplimentarPDFException {
		
		if (!validarDNI.esDNIValido(dni9)) {
    		throw new CumplimentarPDFException("ERROR, DNI introducido incorrecto");
		}
		this.dni9 = dni9;
	}

	public String getN_votos9() {
		return n_votos9;
	}

	public void setN_votos9(String n_votos9) {
		this.n_votos9 = n_votos9;
	}

	public String getSindicato9() {
		return sindicato9;
	}

	public void setSindicato9(String sindicato9) {
		this.sindicato9 = sindicato9;
	}

	public String getNombre10() {
		return nombre10;
	}

	public void setNombre10(String nombre10) {
		this.nombre10 = nombre10;
	}

	public String getDni10() {
		return dni10;
	}

	public void setDni10(String dni10) throws CumplimentarPDFException {
		
		if (!validarDNI.esDNIValido(dni10)) {
    		throw new CumplimentarPDFException("ERROR, DNI introducido incorrecto");
		}
		this.dni10 = dni10;
	}

	public String getN_votos10() {
		return n_votos10;
	}

	public void setN_votos10(String n_votos10) {
		this.n_votos10 = n_votos10;
	}

	public String getSindicato10() {
		return sindicato10;
	}

	public void setSindicato10(String sindicato10) {
		this.sindicato10 = sindicato10;
	}

	public String getReclamaciones1() {
		return reclamaciones1;
	}

	public void setReclamaciones1(String reclamaciones1) {
		this.reclamaciones1 = reclamaciones1;
	}

	public String getReclamaciones2() {
		return reclamaciones2;
	}

	public void setReclamaciones2(String reclamaciones2) {
		this.reclamaciones2 = reclamaciones2;
	}

	public String getReclamaciones3() {
		return reclamaciones3;
	}

	public void setReclamaciones3(String reclamaciones3) {
		this.reclamaciones3 = reclamaciones3;
	}

	public String getResol_mesa() {
		return resol_mesa;
	}

	public void setResol_mesa(String resol_mesa) {
		this.resol_mesa = resol_mesa;
	}
}

