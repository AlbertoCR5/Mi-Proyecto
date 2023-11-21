/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Delegados;

/**
 *
 * @author Alberto CR
 */
import java.time.LocalDate;

public class AnioActual {

    public static void main(String[] args) {
        // Obtener el año actual
        int year = LocalDate.now().getYear();

        // Obtener las dos últimas cifras del año
        int ultimasDosCifras = year % 100;

        String anioActual = String.valueOf(ultimasDosCifras);
    }
}
