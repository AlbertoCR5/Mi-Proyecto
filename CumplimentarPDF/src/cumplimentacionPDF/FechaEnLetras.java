/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Delegados;

/**
 *
 * @author Alberto CR
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaEnLetras {

    public static void main(String[] args) {
        String fechaTexto = "10/11/2023"; // Cambia esto por tu fecha en formato dd/mm/AAAA
        try {
            Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaTexto);

            // Obtener día, mes y año por separado
            SimpleDateFormat sdfDia = new SimpleDateFormat("dd");
            SimpleDateFormat sdfMes = new SimpleDateFormat("MM");
            SimpleDateFormat sdfAnio = new SimpleDateFormat("yyyy");

            String dia = sdfDia.format(fecha);
            String mes = obtenerMesEnLetras(sdfMes.format(fecha));
            String anio = sdfAnio.format(fecha);

            // Imprimir la fecha en letras
            System.out.println("Fecha en letras: " + convertirNumeroALetras(dia) + " de " + mes + " de " + convertirNumeroALetras(anio));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static String obtenerMesEnLetras(String numeroMes) {
        String[] meses = {
                "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
                "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };

        int indiceMes = Integer.parseInt(numeroMes) - 1;

        return meses[indiceMes];
    }

    private static String convertirNumeroALetras(String numero) {
        // Implementar lógica para convertir el número a letras (puedes usar una librería existente)
        // Aquí se deja como ejercicio adicional
        return numero;
    }
}
