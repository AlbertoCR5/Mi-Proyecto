package cumplimentacionPDF;

public class Delegados_Modelo9 {

    private String n_empresa, cif, n_comercial, n_trabajo, direccion, municipio, prov, nombre, dni,
            dia, mes, ano, total, sindicato1, represent1, sindicato3, sindicato4, sindicato2, sindicato5,
            sindicato6, sindicato7, sindicato8, sindicato9, sindicato10, sindicato11, sindicato12, sindicato13,
            represent2, represent3, represent4, represent5, represent6, represent7, represent8, represent9,
            represent10, represent11, represent12, represent13;

    public Delegados_Modelo9(String n_empresa, String cif, String n_comercial, String n_trabajo, String direccion,
            String municipio, String nombre, String dni, String dia, String mes, String año,
            String total, String sindicato1, String represent1, String sindicato3, String sindicato4,
            String sindicato2, String sindicato5, String sindicato6, String sindicato7, String sindicato8,
            String sindicato9, String sindicato10, String sindicato11, String sindicato12, String sindicato13,
            String represent2, String represent3, String represent4, String represent5, String represent6,
            String represent7, String represent8, String represent9, String represent10, String represent11,
            String represent12, String represent13) {
        this.n_empresa = n_empresa;
        this.cif = cif;
        this.n_comercial = n_comercial;
        this.n_trabajo = n_trabajo;
        this.direccion = direccion;
        this.municipio = municipio;
        this.prov = "SEVILLA";
        this.nombre = nombre;
        this.dni = dni;
        this.dia = dia;
        this.mes = mes;
        this.ano = año;
        this.total = total;
        this.sindicato1 = sindicato1;
        this.represent1 = represent1;
        this.sindicato3 = sindicato3;
        this.sindicato4 = sindicato4;
        this.sindicato2 = sindicato2;
        this.sindicato5 = sindicato5;
        this.sindicato6 = sindicato6;
        this.sindicato7 = sindicato7;
        this.sindicato8 = sindicato8;
        this.sindicato9 = sindicato9;
        this.sindicato10 = sindicato10;
        this.sindicato11 = sindicato11;
        this.sindicato12 = sindicato12;
        this.sindicato13 = sindicato13;
        this.represent2 = represent2;
        this.represent3 = represent3;
        this.represent4 = represent4;
        this.represent5 = represent5;
        this.represent6 = represent6;
        this.represent7 = represent7;
        this.represent8 = represent8;
        this.represent9 = represent9;
        this.represent10 = represent10;
        this.represent11 = represent11;
        this.represent12 = represent12;
        this.represent13 = represent13;
    }
    
    public Delegados_Modelo9(String n_empresa, String cif, String direccion, String municipio) {
        this.n_empresa = n_empresa;
        this.cif = cif;
        this.n_comercial = n_empresa;
        this.n_trabajo = n_empresa;
        this.direccion = direccion;
        this.municipio = municipio;
        this.prov = "SEVILLA"; 
    }
    
    public String getN_empresa() {
		return n_empresa;
	}

	public void setN_empresa(String n_empresa) {
		this.n_empresa = n_empresa;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getN_comercial() {
		return n_comercial;
	}

	public void setN_comercial(String n_comercial) {
		this.n_comercial = n_comercial;
	}

	public String getN_trabajo() {
		return n_trabajo;
	}

	public void setN_trabajo(String n_trabajo) {
		this.n_trabajo = n_trabajo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getSindicato1() {
		return sindicato1;
	}

	public void setSindicato1(String sindicato1) {
		this.sindicato1 = sindicato1;
	}

	public String getRepresent1() {
		return represent1;
	}

	public void setRepresent1(String represent1) {
		this.represent1 = represent1;
	}

	public String getSindicato3() {
		return sindicato3;
	}

	public void setSindicato3(String sindicato3) {
		this.sindicato3 = sindicato3;
	}

	public String getSindicato4() {
		return sindicato4;
	}

	public void setSindicato4(String sindicato4) {
		this.sindicato4 = sindicato4;
	}

	public String getSindicato2() {
		return sindicato2;
	}

	public void setSindicato2(String sindicato2) {
		this.sindicato2 = sindicato2;
	}

	public String getSindicato5() {
		return sindicato5;
	}

	public void setSindicato5(String sindicato5) {
		this.sindicato5 = sindicato5;
	}

	public String getSindicato6() {
		return sindicato6;
	}

	public void setSindicato6(String sindicato6) {
		this.sindicato6 = sindicato6;
	}

	public String getSindicato7() {
		return sindicato7;
	}

	public void setSindicato7(String sindicato7) {
		this.sindicato7 = sindicato7;
	}

	public String getSindicato8() {
		return sindicato8;
	}

	public void setSindicato8(String sindicato8) {
		this.sindicato8 = sindicato8;
	}

	public String getSindicato9() {
		return sindicato9;
	}

	public void setSindicato9(String sindicato9) {
		this.sindicato9 = sindicato9;
	}

	public String getSindicato10() {
		return sindicato10;
	}

	public void setSindicato10(String sindicato10) {
		this.sindicato10 = sindicato10;
	}

	public String getSindicato11() {
		return sindicato11;
	}

	public void setSindicato11(String sindicato11) {
		this.sindicato11 = sindicato11;
	}

	public String getSindicato12() {
		return sindicato12;
	}

	public void setSindicato12(String sindicato12) {
		this.sindicato12 = sindicato12;
	}

	public String getSindicato13() {
		return sindicato13;
	}

	public void setSindicato13(String sindicato13) {
		this.sindicato13 = sindicato13;
	}

	public String getRepresent2() {
		return represent2;
	}

	public void setRepresent2(String represent2) {
		this.represent2 = represent2;
	}

	public String getRepresent3() {
		return represent3;
	}

	public void setRepresent3(String represent3) {
		this.represent3 = represent3;
	}

	public String getRepresent4() {
		return represent4;
	}

	public void setRepresent4(String represent4) {
		this.represent4 = represent4;
	}

	public String getRepresent5() {
		return represent5;
	}

	public void setRepresent5(String represent5) {
		this.represent5 = represent5;
	}

	public String getRepresent6() {
		return represent6;
	}

	public void setRepresent6(String represent6) {
		this.represent6 = represent6;
	}

	public String getRepresent7() {
		return represent7;
	}

	public void setRepresent7(String represent7) {
		this.represent7 = represent7;
	}

	public String getRepresent8() {
		return represent8;
	}

	public void setRepresent8(String represent8) {
		this.represent8 = represent8;
	}

	public String getRepresent9() {
		return represent9;
	}

	public void setRepresent9(String represent9) {
		this.represent9 = represent9;
	}

	public String getRepresent10() {
		return represent10;
	}

	public void setRepresent10(String represent10) {
		this.represent10 = represent10;
	}

	public String getRepresent11() {
		return represent11;
	}

	public void setRepresent11(String represent11) {
		this.represent11 = represent11;
	}

	public String getRepresent12() {
		return represent12;
	}

	public void setRepresent12(String represent12) {
		this.represent12 = represent12;
	}

	public String getRepresent13() {
		return represent13;
	}

	public void setRepresent13(String represent13) {
		this.represent13 = represent13;
	}

}