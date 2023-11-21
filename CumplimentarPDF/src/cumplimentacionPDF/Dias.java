package cumplimentacionPDF;

public enum Dias {

	UNO(1, "uno"),
    DOS(2, "dos"),
    TRES(3, "tres"),
    CUATRO(4, "cuatro"),
    CINCO(5, "cinco"),
    SEIS(6, "seis"),
    SIETE(7, "siete"),
    OCHO(8, "ocho"),
    NUEVE(9, "nueve"),
    DIEZ(10, "diez"),
    ONCE(11, "once"),
    DOCE(12, "doce"),
    TRECE(13, "trece"),
    CATORCE(14, "catorce"),
    QUINCE(15, "quince"),
    DIECISEIS(16, "dieciséis"),
    DIECISIETE(17, "diecisiete"),
    DIECIOCHO(18, "dieciocho"),
    DIECINUEVE(19, "diecinueve"),
    VEINTE(20, "veinte"),
    VEINTIUNO(21, "veintiuno"),
    VEINTIDOS(22, "veintidós"),
    VEINTITRES(23, "veintitrés"),
    VEINTICUATRO(24, "veinticuatro"),
    VEINTICINCO(25, "veinticinco"),
    VEINTICISEIS(26, "veintiseis"),
    VEINTICISIETE(27, "veintisiete"),
    VEINTIOCHO(28, "veintiocho"),
    VEINTINUEVE(29, "veintinueve"),
    TREINTA(30, "treinta"),
    TREINTAYUNO(31, "treinta y uno");

    private final int numero;
    private final String nombre;

    Dias(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }
}
