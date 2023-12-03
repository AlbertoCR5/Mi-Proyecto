/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Delegados;

/**
 *
 * @author Alberto CR
 */
public class Delegados_Modelo5_2_proceso {

    private String dia1, mes1, ambito, v_varones, v_mujeres,
            t_votantes, p_cumpli, p_blancas, nulos, repre_elegidos, candidaturas1, codigo1, d_elegidos1, d_presentados1,
            v_delegados1, candidaturas2, codigo2, d_presentados2, d_elegidos2, v_delegados2, candidaturas3, codigo3,
            d_presentados3, d_elegidos3, v_delegados3, candidaturas4, codigo4, d_presentados4, d_elegidos4, v_delegados4,
            candidaturas5, codigo5, d_presentados5, d_elegidos5, v_delegados5, candidaturas6, codigo6, d_presentados6,
            d_elegidos6, v_delegados6, candidaturas7, codigo7, d_presentados7, d_elegidos7, v_delegados7, candidaturas8,
            codigo8, d_presentados8, d_elegidos8, v_delegados8, candidaturas9, codigo9, d_presentados9, d_elegidos9,
            v_delegados9, candidaturas10, codigo10, d_presentados10, d_elegidos10, v_delegados10, alta_baja, inicial1,
            apellidos1, dni1, antiguedad1, sexo1, f_nacimiento1, votos1, codigo11, sindicato1, alta_baja2, inicial2,
            apellidos2, dni2, antiguedad2, sexo2, f_nacimiento2, votos2, codigo12, sindicato2, alta_baja3, inicial3,
            apellidos3, dni3, antiguedad3, sexo3, f_nacimiento3, votos3, codigo13, sindicato3, inicial4, apellidos4, dni4,
            antiguedad4, sexo4, f_nacimiento4, votos4, codigo14, sindicato4, inicial5, apellidos5, dni5, antiguedad5,
            sexo5, f_nacimiento5, votos5, codigo15, sindicato5;
    
    short t_electores, e_varones, e_mujeres, e_total, n_representantes;

    // Constructor
    public Delegados_Modelo5_2_proceso(String dia1, String mes1, short t_electores, String ambito, short e_varones,
    		short e_mujeres, short e_total, short n_representantes, String v_varones, String v_mujeres,
            String t_votantes, String p_cumpli, String p_blancas, String nulos, String repre_elegidos,
            String candidaturas1, String codigo1, String d_elegidos1, String d_presentados1, String v_delegados1,
            String candidaturas2, String codigo2, String d_presentados2, String d_elegidos2, String v_delegados2,
            String candidaturas3, String codigo3, String d_presentados3, String d_elegidos3, String v_delegados3,
            String candidaturas4, String codigo4, String d_presentados4, String d_elegidos4, String v_delegados4,
            String candidaturas5, String codigo5, String d_presentados5, String d_elegidos5, String v_delegados5,
            String candidaturas6, String codigo6, String d_presentados6, String d_elegidos6, String v_delegados6,
            String candidaturas7, String codigo7, String d_presentados7, String d_elegidos7, String v_delegados7,
            String candidaturas8, String codigo8, String d_presentados8, String d_elegidos8, String v_delegados8,
            String candidaturas9, String codigo9, String d_presentados9, String d_elegidos9, String v_delegados9,
            String candidaturas10, String codigo10, String d_presentados10, String d_elegidos10, String v_delegados10,
            String alta_baja, String inicial1, String apellidos1, String dni1, String antiguedad1, String sexo1,
            String f_nacimiento1, String votos1, String codigo11, String sindicato1, String alta_baja2, String inicial2,
            String apellidos2, String dni2, String antiguedad2, String sexo2, String f_nacimiento2, String votos2,
            String codigo12, String sindicato2, String alta_baja3, String inicial3, String apellidos3, String dni3,
            String antiguedad3, String sexo3, String f_nacimiento3, String votos3, String codigo13, String sindicato3,
            String inicial4, String apellidos4, String dni4, String antiguedad4, String sexo4, String f_nacimiento4,
            String votos4, String codigo14, String sindicato4, String inicial5, String apellidos5, String dni5,
            String antiguedad5, String sexo5, String f_nacimiento5, String votos5, String codigo15, String sindicato5) {
        this.dia1 = dia1;
        this.mes1 = mes1;
        this.t_electores = t_electores;
        this.ambito = ambito;
        this.e_varones = e_varones;
        this.e_mujeres = e_mujeres;
        this.e_total = t_electores;
        this.n_representantes = n_representantes;
        this.v_varones = v_varones;
        this.v_mujeres = v_mujeres;
        this.t_votantes = t_votantes;
        this.p_cumpli = p_cumpli;
        this.p_blancas = p_blancas;
        this.nulos = nulos;
        this.repre_elegidos = repre_elegidos;
        this.candidaturas1 = candidaturas1;
        this.codigo1 = codigo1;
        this.d_elegidos1 = d_elegidos1;
        this.d_presentados1 = d_presentados1;
        this.v_delegados1 = v_delegados1;
        this.candidaturas2 = candidaturas2;
        this.codigo2 = codigo2;
        this.d_presentados2 = d_presentados2;
        this.d_elegidos2 = d_elegidos2;
        this.v_delegados2 = v_delegados2;
        this.candidaturas3 = candidaturas3;
        this.codigo3 = codigo3;
        this.d_presentados3 = d_presentados3;
        this.d_elegidos3 = d_elegidos3;
        this.v_delegados3 = v_delegados3;
        this.candidaturas4 = candidaturas4;
        this.codigo4 = codigo4;
        this.d_presentados4 = d_presentados4;
        this.d_elegidos4 = d_elegidos4;
        this.v_delegados4 = v_delegados4;
        this.candidaturas5 = candidaturas5;
        this.codigo5 = codigo5;
        this.d_presentados5 = d_presentados5;
        this.d_elegidos5 = d_elegidos5;
        this.v_delegados5 = v_delegados5;
        this.candidaturas6 = candidaturas6;
        this.codigo6 = codigo6;
        this.d_presentados6 = d_presentados6;
        this.d_elegidos6 = d_elegidos6;
        this.v_delegados6 = v_delegados6;
        this.candidaturas7 = candidaturas7;
        this.codigo7 = codigo7;
        this.d_presentados7 = d_presentados7;
        this.d_elegidos7 = d_elegidos7;
        this.v_delegados7 = v_delegados7;
        this.candidaturas8 = candidaturas8;
        this.codigo8 = codigo8;
        this.d_presentados8 = d_presentados8;
        this.d_elegidos8 = d_elegidos8;
        this.v_delegados8 = v_delegados8;
        this.candidaturas9 = candidaturas9;
        this.codigo9 = codigo9;
        this.d_presentados9 = d_presentados9;
        this.d_elegidos9 = d_elegidos9;
        this.v_delegados9 = v_delegados9;
        this.candidaturas10 = candidaturas10;
        this.codigo10 = codigo10;
        this.d_presentados10 = d_presentados10;
        this.d_elegidos10 = d_elegidos10;
        this.v_delegados10 = v_delegados10;
        this.alta_baja = alta_baja;
        this.inicial1 = inicial1;
        this.apellidos1 = apellidos1;
        this.dni1 = dni1;
        this.antiguedad1 = antiguedad1;
        this.sexo1 = sexo1;
        this.f_nacimiento1 = f_nacimiento1;
        this.votos1 = votos1;
        this.codigo11 = codigo11;
        this.sindicato1 = sindicato1;
        this.alta_baja2 = alta_baja2;
        this.inicial2 = inicial2;
        this.apellidos2 = apellidos2;
        this.dni2 = dni2;
        this.antiguedad2 = antiguedad2;
        this.sexo2 = sexo2;
        this.f_nacimiento2 = f_nacimiento2;
        this.votos2 = votos2;
        this.codigo12 = codigo12;
        this.sindicato2 = sindicato2;
        this.alta_baja3 = alta_baja3;
        this.inicial3 = inicial3;
        this.apellidos3 = apellidos3;
        this.dni3 = dni3;
        this.antiguedad3 = antiguedad3;
        this.sexo3 = sexo3;
        this.f_nacimiento3 = f_nacimiento3;
        this.votos3 = votos3;
        this.codigo13 = codigo13;
        this.sindicato3 = sindicato3;
        this.inicial4 = inicial4;
        this.apellidos4 = apellidos4;
        this.dni4 = dni4;
        this.antiguedad4 = antiguedad4;
        this.sexo4 = sexo4;
        this.f_nacimiento4 = f_nacimiento4;
        this.votos4 = votos4;
        this.codigo14 = codigo14;
        this.sindicato4 = sindicato4;
        this.inicial5 = inicial5;
        this.apellidos5 = apellidos5;
        this.dni5 = dni5;
        this.antiguedad5 = antiguedad5;
        this.sexo5 = sexo5;
        this.f_nacimiento5 = f_nacimiento5;
        this.votos5 = votos5;
        this.codigo15 = codigo15;
        this.sindicato5 = sindicato5;
    }

    public Delegados_Modelo5_2_proceso(String dia1, String mes1, short t_electores, short e_varones, short e_mujeres, short e_total){
        
        this.dia1 = dia1;
        this.mes1 = mes1;
        this.t_electores = t_electores;
        this.e_varones = e_varones;
        this.e_mujeres = e_mujeres;
        this.e_total = t_electores;
        setN_representantes(n_representantes);
    }
    public String getDia1() {
		return dia1;
	}

	public void setDia1(String dia1) {
		this.dia1 = dia1;
	}

	public String getMes1() {
		return mes1;
	}

	public void setMes1(String mes1) {
		this.mes1 = mes1;
	}

	public short getT_electores() {
		return t_electores;
	}

	public void setT_electores(short t_electores) {
		this.t_electores = t_electores;
	}

	public String getAmbito() {
		return ambito;
	}

	public void setAmbito(String ambito) {
		this.ambito = ambito;
	}

	public short getE_varones() {
		return e_varones;
	}

	public void setE_varones(short e_varones) {
		this.e_varones = e_varones;
	}

	public short getE_mujeres() {
		return e_mujeres;
	}

	public void setE_mujeres(short e_mujeres) {
		this.e_mujeres = e_mujeres;
	}

	public short getE_total() {
		return e_total;
	}

	public void setE_total(short e_total) {
		this.e_total = e_total;
	}

	public short getN_representantes() {
		return n_representantes;
	}

	public void setN_representantes(short n_representantes) {
		
		if (t_electores < 31) {
			n_representantes = 1;
		}
		else {
			if (t_electores < 51) {
				n_representantes = 3;
			}
			else {
				if (t_electores < 101) {
					n_representantes = 5;
				}
				else {
					if (t_electores < 251) {
						n_representantes = 9;
					}
					else {
						if (t_electores < 501) {
							n_representantes = 13;
						}
						else {
							if (t_electores < 751) {
								n_representantes = 17;
							}
							else {
								if (t_electores < 1001) {
									n_representantes = 21;
								}
								else {
							        // Cálculo para los siguientes bloques de 1000 electores
							        int bloquesAdicionales = (t_electores - 1000) / 1000;
							        n_representantes = (short) Math.min(75, 21 + bloquesAdicionales * 2);
							    }
							}
						}
					}
				}
			}
		}
		this.n_representantes = n_representantes;
	}

	public String getV_varones() {
		return v_varones;
	}

	public void setV_varones(String v_varones) {
		this.v_varones = v_varones;
	}

	public String getV_mujeres() {
		return v_mujeres;
	}

	public void setV_mujeres(String v_mujeres) {
		this.v_mujeres = v_mujeres;
	}

	public String getT_votantes() {
		return t_votantes;
	}

	public void setT_votantes(String t_votantes) {
		this.t_votantes = t_votantes;
	}

	public String getP_cumpli() {
		return p_cumpli;
	}

	public void setP_cumpli(String p_cumpli) {
		this.p_cumpli = p_cumpli;
	}

	public String getP_blancas() {
		return p_blancas;
	}

	public void setP_blancas(String p_blancas) {
		this.p_blancas = p_blancas;
	}

	public String getNulos() {
		return nulos;
	}

	public void setNulos(String nulos) {
		this.nulos = nulos;
	}

	public String getRepre_elegidos() {
		return repre_elegidos;
	}

	public void setRepre_elegidos(String repre_elegidos) {
		this.repre_elegidos = repre_elegidos;
	}

	public String getCandidaturas1() {
		return candidaturas1;
	}

	public void setCandidaturas1(String candidaturas1) {
		this.candidaturas1 = candidaturas1;
	}

	public String getCodigo1() {
		return codigo1;
	}

	public void setCodigo1(String codigo1) {
		this.codigo1 = codigo1;
	}

	public String getD_elegidos1() {
		return d_elegidos1;
	}

	public void setD_elegidos1(String d_elegidos1) {
		this.d_elegidos1 = d_elegidos1;
	}

	public String getD_presentados1() {
		return d_presentados1;
	}

	public void setD_presentados1(String d_presentados1) {
		this.d_presentados1 = d_presentados1;
	}

	public String getV_delegados1() {
		return v_delegados1;
	}

	public void setV_delegados1(String v_delegados1) {
		this.v_delegados1 = v_delegados1;
	}

	public String getCandidaturas2() {
		return candidaturas2;
	}

	public void setCandidaturas2(String candidaturas2) {
		this.candidaturas2 = candidaturas2;
	}

	public String getCodigo2() {
		return codigo2;
	}

	public void setCodigo2(String codigo2) {
		this.codigo2 = codigo2;
	}

	public String getD_presentados2() {
		return d_presentados2;
	}

	public void setD_presentados2(String d_presentados2) {
		this.d_presentados2 = d_presentados2;
	}

	public String getD_elegidos2() {
		return d_elegidos2;
	}

	public void setD_elegidos2(String d_elegidos2) {
		this.d_elegidos2 = d_elegidos2;
	}

	public String getV_delegados2() {
		return v_delegados2;
	}

	public void setV_delegados2(String v_delegados2) {
		this.v_delegados2 = v_delegados2;
	}

	public String getCandidaturas3() {
		return candidaturas3;
	}

	public void setCandidaturas3(String candidaturas3) {
		this.candidaturas3 = candidaturas3;
	}

	public String getCodigo3() {
		return codigo3;
	}

	public void setCodigo3(String codigo3) {
		this.codigo3 = codigo3;
	}

	public String getD_presentados3() {
		return d_presentados3;
	}

	public void setD_presentados3(String d_presentados3) {
		this.d_presentados3 = d_presentados3;
	}

	public String getD_elegidos3() {
		return d_elegidos3;
	}

	public void setD_elegidos3(String d_elegidos3) {
		this.d_elegidos3 = d_elegidos3;
	}

	public String getV_delegados3() {
		return v_delegados3;
	}

	public void setV_delegados3(String v_delegados3) {
		this.v_delegados3 = v_delegados3;
	}

	public String getCandidaturas4() {
		return candidaturas4;
	}

	public void setCandidaturas4(String candidaturas4) {
		this.candidaturas4 = candidaturas4;
	}

	public String getCodigo4() {
		return codigo4;
	}

	public void setCodigo4(String codigo4) {
		this.codigo4 = codigo4;
	}

	public String getD_presentados4() {
		return d_presentados4;
	}

	public void setD_presentados4(String d_presentados4) {
		this.d_presentados4 = d_presentados4;
	}

	public String getD_elegidos4() {
		return d_elegidos4;
	}

	public void setD_elegidos4(String d_elegidos4) {
		this.d_elegidos4 = d_elegidos4;
	}

	public String getV_delegados4() {
		return v_delegados4;
	}

	public void setV_delegados4(String v_delegados4) {
		this.v_delegados4 = v_delegados4;
	}

	public String getCandidaturas5() {
		return candidaturas5;
	}

	public void setCandidaturas5(String candidaturas5) {
		this.candidaturas5 = candidaturas5;
	}

	public String getCodigo5() {
		return codigo5;
	}

	public void setCodigo5(String codigo5) {
		this.codigo5 = codigo5;
	}

	public String getD_presentados5() {
		return d_presentados5;
	}

	public void setD_presentados5(String d_presentados5) {
		this.d_presentados5 = d_presentados5;
	}

	public String getD_elegidos5() {
		return d_elegidos5;
	}

	public void setD_elegidos5(String d_elegidos5) {
		this.d_elegidos5 = d_elegidos5;
	}

	public String getV_delegados5() {
		return v_delegados5;
	}

	public void setV_delegados5(String v_delegados5) {
		this.v_delegados5 = v_delegados5;
	}

	public String getCandidaturas6() {
		return candidaturas6;
	}

	public void setCandidaturas6(String candidaturas6) {
		this.candidaturas6 = candidaturas6;
	}

	public String getCodigo6() {
		return codigo6;
	}

	public void setCodigo6(String codigo6) {
		this.codigo6 = codigo6;
	}

	public String getD_presentados6() {
		return d_presentados6;
	}

	public void setD_presentados6(String d_presentados6) {
		this.d_presentados6 = d_presentados6;
	}

	public String getD_elegidos6() {
		return d_elegidos6;
	}

	public void setD_elegidos6(String d_elegidos6) {
		this.d_elegidos6 = d_elegidos6;
	}

	public String getV_delegados6() {
		return v_delegados6;
	}

	public void setV_delegados6(String v_delegados6) {
		this.v_delegados6 = v_delegados6;
	}

	public String getCandidaturas7() {
		return candidaturas7;
	}

	public void setCandidaturas7(String candidaturas7) {
		this.candidaturas7 = candidaturas7;
	}

	public String getCodigo7() {
		return codigo7;
	}

	public void setCodigo7(String codigo7) {
		this.codigo7 = codigo7;
	}

	public String getD_presentados7() {
		return d_presentados7;
	}

	public void setD_presentados7(String d_presentados7) {
		this.d_presentados7 = d_presentados7;
	}

	public String getD_elegidos7() {
		return d_elegidos7;
	}

	public void setD_elegidos7(String d_elegidos7) {
		this.d_elegidos7 = d_elegidos7;
	}

	public String getV_delegados7() {
		return v_delegados7;
	}

	public void setV_delegados7(String v_delegados7) {
		this.v_delegados7 = v_delegados7;
	}

	public String getCandidaturas8() {
		return candidaturas8;
	}

	public void setCandidaturas8(String candidaturas8) {
		this.candidaturas8 = candidaturas8;
	}

	public String getCodigo8() {
		return codigo8;
	}

	public void setCodigo8(String codigo8) {
		this.codigo8 = codigo8;
	}

	public String getD_presentados8() {
		return d_presentados8;
	}

	public void setD_presentados8(String d_presentados8) {
		this.d_presentados8 = d_presentados8;
	}

	public String getD_elegidos8() {
		return d_elegidos8;
	}

	public void setD_elegidos8(String d_elegidos8) {
		this.d_elegidos8 = d_elegidos8;
	}

	public String getV_delegados8() {
		return v_delegados8;
	}

	public void setV_delegados8(String v_delegados8) {
		this.v_delegados8 = v_delegados8;
	}

	public String getCandidaturas9() {
		return candidaturas9;
	}

	public void setCandidaturas9(String candidaturas9) {
		this.candidaturas9 = candidaturas9;
	}

	public String getCodigo9() {
		return codigo9;
	}

	public void setCodigo9(String codigo9) {
		this.codigo9 = codigo9;
	}

	public String getD_presentados9() {
		return d_presentados9;
	}

	public void setD_presentados9(String d_presentados9) {
		this.d_presentados9 = d_presentados9;
	}

	public String getD_elegidos9() {
		return d_elegidos9;
	}

	public void setD_elegidos9(String d_elegidos9) {
		this.d_elegidos9 = d_elegidos9;
	}

	public String getV_delegados9() {
		return v_delegados9;
	}

	public void setV_delegados9(String v_delegados9) {
		this.v_delegados9 = v_delegados9;
	}

	public String getCandidaturas10() {
		return candidaturas10;
	}

	public void setCandidaturas10(String candidaturas10) {
		this.candidaturas10 = candidaturas10;
	}

	public String getCodigo10() {
		return codigo10;
	}

	public void setCodigo10(String codigo10) {
		this.codigo10 = codigo10;
	}

	public String getD_presentados10() {
		return d_presentados10;
	}

	public void setD_presentados10(String d_presentados10) {
		this.d_presentados10 = d_presentados10;
	}

	public String getD_elegidos10() {
		return d_elegidos10;
	}

	public void setD_elegidos10(String d_elegidos10) {
		this.d_elegidos10 = d_elegidos10;
	}

	public String getV_delegados10() {
		return v_delegados10;
	}

	public void setV_delegados10(String v_delegados10) {
		this.v_delegados10 = v_delegados10;
	}

	public String getAlta_baja() {
		return alta_baja;
	}

	public void setAlta_baja(String alta_baja) {
		this.alta_baja = alta_baja;
	}

	public String getInicial1() {
		return inicial1;
	}

	public void setInicial1(String inicial1) {
		this.inicial1 = inicial1;
	}

	public String getApellidos1() {
		return apellidos1;
	}

	public void setApellidos1(String apellidos1) {
		this.apellidos1 = apellidos1;
	}

	public String getDni1() {
		return dni1;
	}

	public void setDni1(String dni1) {
		this.dni1 = dni1;
	}

	public String getAntiguedad1() {
		return antiguedad1;
	}

	public void setAntiguedad1(String antiguedad1) {
		this.antiguedad1 = antiguedad1;
	}

	public String getSexo1() {
		return sexo1;
	}

	public void setSexo1(String sexo1) {
		this.sexo1 = sexo1;
	}

	public String getF_nacimiento1() {
		return f_nacimiento1;
	}

	public void setF_nacimiento1(String f_nacimiento1) {
		this.f_nacimiento1 = f_nacimiento1;
	}

	public String getVotos1() {
		return votos1;
	}

	public void setVotos1(String votos1) {
		this.votos1 = votos1;
	}

	public String getCodigo11() {
		return codigo11;
	}

	public void setCodigo11(String codigo11) {
		this.codigo11 = codigo11;
	}

	public String getSindicato1() {
		return sindicato1;
	}

	public void setSindicato1(String sindicato1) {
		this.sindicato1 = sindicato1;
	}

	public String getAlta_baja2() {
		return alta_baja2;
	}

	public void setAlta_baja2(String alta_baja2) {
		this.alta_baja2 = alta_baja2;
	}

	public String getInicial2() {
		return inicial2;
	}

	public void setInicial2(String inicial2) {
		this.inicial2 = inicial2;
	}

	public String getApellidos2() {
		return apellidos2;
	}

	public void setApellidos2(String apellidos2) {
		this.apellidos2 = apellidos2;
	}

	public String getDni2() {
		return dni2;
	}

	public void setDni2(String dni2) {
		this.dni2 = dni2;
	}

	public String getAntiguedad2() {
		return antiguedad2;
	}

	public void setAntiguedad2(String antiguedad2) {
		this.antiguedad2 = antiguedad2;
	}

	public String getSexo2() {
		return sexo2;
	}

	public void setSexo2(String sexo2) {
		this.sexo2 = sexo2;
	}

	public String getF_nacimiento2() {
		return f_nacimiento2;
	}

	public void setF_nacimiento2(String f_nacimiento2) {
		this.f_nacimiento2 = f_nacimiento2;
	}

	public String getVotos2() {
		return votos2;
	}

	public void setVotos2(String votos2) {
		this.votos2 = votos2;
	}

	public String getCodigo12() {
		return codigo12;
	}

	public void setCodigo12(String codigo12) {
		this.codigo12 = codigo12;
	}

	public String getSindicato2() {
		return sindicato2;
	}

	public void setSindicato2(String sindicato2) {
		this.sindicato2 = sindicato2;
	}

	public String getAlta_baja3() {
		return alta_baja3;
	}

	public void setAlta_baja3(String alta_baja3) {
		this.alta_baja3 = alta_baja3;
	}

	public String getInicial3() {
		return inicial3;
	}

	public void setInicial3(String inicial3) {
		this.inicial3 = inicial3;
	}

	public String getApellidos3() {
		return apellidos3;
	}

	public void setApellidos3(String apellidos3) {
		this.apellidos3 = apellidos3;
	}

	public String getDni3() {
		return dni3;
	}

	public void setDni3(String dni3) {
		this.dni3 = dni3;
	}

	public String getAntiguedad3() {
		return antiguedad3;
	}

	public void setAntiguedad3(String antiguedad3) {
		this.antiguedad3 = antiguedad3;
	}

	public String getSexo3() {
		return sexo3;
	}

	public void setSexo3(String sexo3) {
		this.sexo3 = sexo3;
	}

	public String getF_nacimiento3() {
		return f_nacimiento3;
	}

	public void setF_nacimiento3(String f_nacimiento3) {
		this.f_nacimiento3 = f_nacimiento3;
	}

	public String getVotos3() {
		return votos3;
	}

	public void setVotos3(String votos3) {
		this.votos3 = votos3;
	}

	public String getCodigo13() {
		return codigo13;
	}

	public void setCodigo13(String codigo13) {
		this.codigo13 = codigo13;
	}

	public String getSindicato3() {
		return sindicato3;
	}

	public void setSindicato3(String sindicato3) {
		this.sindicato3 = sindicato3;
	}

	public String getInicial4() {
		return inicial4;
	}

	public void setInicial4(String inicial4) {
		this.inicial4 = inicial4;
	}

	public String getApellidos4() {
		return apellidos4;
	}

	public void setApellidos4(String apellidos4) {
		this.apellidos4 = apellidos4;
	}

	public String getDni4() {
		return dni4;
	}

	public void setDni4(String dni4) {
		this.dni4 = dni4;
	}

	public String getAntiguedad4() {
		return antiguedad4;
	}

	public void setAntiguedad4(String antiguedad4) {
		this.antiguedad4 = antiguedad4;
	}

	public String getSexo4() {
		return sexo4;
	}

	public void setSexo4(String sexo4) {
		this.sexo4 = sexo4;
	}

	public String getF_nacimiento4() {
		return f_nacimiento4;
	}

	public void setF_nacimiento4(String f_nacimiento4) {
		this.f_nacimiento4 = f_nacimiento4;
	}

	public String getVotos4() {
		return votos4;
	}

	public void setVotos4(String votos4) {
		this.votos4 = votos4;
	}

	public String getCodigo14() {
		return codigo14;
	}

	public void setCodigo14(String codigo14) {
		this.codigo14 = codigo14;
	}

	public String getSindicato4() {
		return sindicato4;
	}

	public void setSindicato4(String sindicato4) {
		this.sindicato4 = sindicato4;
	}

	public String getInicial5() {
		return inicial5;
	}

	public void setInicial5(String inicial5) {
		this.inicial5 = inicial5;
	}

	public String getApellidos5() {
		return apellidos5;
	}

	public void setApellidos5(String apellidos5) {
		this.apellidos5 = apellidos5;
	}

	public String getDni5() {
		return dni5;
	}

	public void setDni5(String dni5) {
		this.dni5 = dni5;
	}

	public String getAntiguedad5() {
		return antiguedad5;
	}

	public void setAntiguedad5(String antiguedad5) {
		this.antiguedad5 = antiguedad5;
	}

	public String getSexo5() {
		return sexo5;
	}

	public void setSexo5(String sexo5) {
		this.sexo5 = sexo5;
	}

	public String getF_nacimiento5() {
		return f_nacimiento5;
	}

	public void setF_nacimiento5(String f_nacimiento5) {
		this.f_nacimiento5 = f_nacimiento5;
	}

	public String getVotos5() {
		return votos5;
	}

	public void setVotos5(String votos5) {
		this.votos5 = votos5;
	}

	public String getCodigo15() {
		return codigo15;
	}

	public void setCodigo15(String codigo15) {
		this.codigo15 = codigo15;
	}

	public String getSindicato5() {
		return sindicato5;
	}

	public void setSindicato5(String sindicato5) {
		this.sindicato5 = sindicato5;
	}
}


