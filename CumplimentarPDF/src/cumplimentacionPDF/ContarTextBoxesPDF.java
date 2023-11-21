/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Delegados;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
//import org.apache.pdfbox.pdmodel.PDAcroForm;
//import org.apache.pdfbox.pdmodel.PDField;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
/**
 *
 * @author Alberto CR
 */
public class ContarTextBoxesPDF {

    public static void main(String[] args) {
        try {
            // Ruta del formulario PDF
            String rutaFormulario = CumplimentaPDF.MODELO_3;

            // Contar los campos TextBoxField en el formulario PDF
            int cantidadTextBoxes = contarTextBoxesPDF(rutaFormulario);

            System.out.println("Número de TextBoxField en el formulario: " + cantidadTextBoxes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int contarTextBoxesPDF(String rutaFormulario) throws IOException {
        int cantidadTextBoxes = 0;

        // Cargar el formulario PDF
        try (PDDocument pdfDocument = PDDocument.load(new File(rutaFormulario))) {

            // Obtener el formulario acro
            PDDocumentCatalog docCatalog = pdfDocument.getDocumentCatalog();
            PDAcroForm acroForm = docCatalog.getAcroForm();

            // Obtener todos los campos del formulario
            for (PDField field : acroForm.getFieldTree()) {
                // Verificar si el campo es un TextBoxField
                if (field instanceof PDField && ((PDField) field).getFieldType().equals("Tx")) {
                    cantidadTextBoxes++;
                }
            }
        }

        return cantidadTextBoxes;
    }
}