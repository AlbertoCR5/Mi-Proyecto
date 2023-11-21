/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Delegados;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.PDPage;
//import org.apache.pdfbox.pdmodel.PDAcroForm;
//import org.apache.pdfbox.pdmodel.PDField;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import java.util.Scanner;
/**
 *
 * @author Alberto CR
 */
public class CumplimentaPDF {
    
    public static final String PROVINCIA = "SEVILLA";
    public static final String PROMOTOR = "UNIÓN GENERAL DE TRABAJADORES";
    public static final String MODELO_3 = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_3.pdf";
    public static final String MODELO_5_1 = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_5_1.pdf";
    public static final String MODELO_5_2_PROCESO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_5_2_proceso.pdf";
    public static final String MODELO_5_2_CONCLUSION = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_5_2_conclusion.pdf";
    public static final String MODELO_9 = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_9.pdf";
    public static final String MODELO_3_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_3_CUMPLIMENTADO.pdf";
    public static final String MODELO_5_1_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_3_CUMPLIMENTADO.pdf";
    public static final String MODELO_5_2_PROCESO_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_3_CUMPLIMENTADO.pdf";
    public static final String MODELO_5_2_CONCLUSION_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_3_CUMPLIMENTADO.pdf";
    public static final String MODELO_9_CUMPLIMENTADO = "C:\\Users\\Alberto CR\\Documents\\NetBeansProjects\\JavaApplication6\\src\\Delegados\\modelo_3_CUMPLIMENTADO.pdf";
   
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {//Fill PDF Form

        // Load a license
       // License lic = new License();
        //lic.setLicense("Conholdate.Total.Product.Family.lic");

        String nombreEmpresa, CIF, nombreComercial, direccion, municipio, horas, dia, mes, anio, presidente, dniPresidente, vocal, dniVocal, secretario, dniSecretario, fechaConstitucion, codigoPostal, actividadEconomica, nombreConvenio;
        
//        // Load the PDF
//        Document pdf []= new Document[5];
//
//        pdf[0] = new Document(MODELO_3);
//        pdf[1] = new Document(MODELO_5_1);
//        pdf[2] = new Document(MODELO_5_2_PROCESO);
//        pdf[3] = new Document(MODELO_5_2_CONCLUSION);
//        pdf[4] = new Document(MODELO_9);
//        
//        // Access the textbox
//        mostrarMensaje("Nombre de la empresa: ");
//        nombreEmpresa = sc.nextLine().toUpperCase();
//        
//        for (int i = 0; i < pdf.length; i++) {
//            if (i == 2) {
//                TextBoxField textbox = (TextBoxField) pdf[0].getForm().get("textbox2");
//                TextBoxField textbox2 = (TextBoxField) pdf[0].getForm().get("textbox3");
//                // Set the value
//                textbox.setValue(nombreEmpresa);
//                // Set the field appearance
//                textbox.setColor(Color.fromRgb(Color.getBlack().toRgb()));
//                textbox.setTextVerticalAlignment(VerticalAlignment.Bottom);
//            }
//           
//        }
//
//        // Save the PDF     
//        pdf[0].save(MODELO_3_CUMPLIMENTADO);
//        pdf[1].save(MODELO_5_1_CUMPLIMENTADO);
//        pdf[2].save(MODELO_5_2_PROCESO_CUMPLIMENTADO);
//        pdf[3].save(MODELO_5_2_CONCLUSION_CUMPLIMENTADO);
//        pdf[4].save(MODELO_9_CUMPLIMENTADO);
//   
//        System.out.println("Done");
//    }
//
//    private static void mostrarMensaje(String msg) {
//        System.out.println(msg);
    }
}

