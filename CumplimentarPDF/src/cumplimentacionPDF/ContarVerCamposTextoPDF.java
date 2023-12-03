/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Delegados;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.PDPage;
//import org.apache.pdfbox.pdmodel.PDAcroForm;
//import org.apache.pdfbox.pdmodel.PDField;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

public class ContarVerCamposTextoPDF {

    public static void main(String[] args) {
        try {
            // Ruta del formulario PDF
            String rutaFormulario = ModificarCamposTextoPDF.MODELO_3;

            // Contar campos de texto y obtener sus IDs
            contarCamposTextoPDF(rutaFormulario);
            
            String[] idsCamposTexto = extraerIDsCamposTextoPDF(rutaFormulario);
            
            descartarCamposNoEditablesPDF(rutaFormulario);
            for (String ids : idsCamposTexto) {
                System.out.println(ids);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void contarCamposTextoPDF(String rutaFormulario) throws IOException {
        try (PDDocument pdfDocument = PDDocument.load(new File(rutaFormulario))) {

            // Obtener el formulario acro
            PDDocumentCatalog docCatalog = pdfDocument.getDocumentCatalog();
            PDAcroForm acroForm = docCatalog.getAcroForm();

            if (acroForm != null) {
                // Obtener todas las p?ginas del PDF
                for (PDPage page : pdfDocument.getPages()) {
                    // Obtener los campos de texto en la p?gina actual
                    for (PDField field : acroForm.getFieldTree()) {
                        if (field instanceof PDField) {
                            // Imprimir ID y nombre de cada campo de texto
                            
                            System.out.println("Nombre: " + field.getFullyQualifiedName());
                        }
                    }
                }
            } else {
                System.out.println("El PDF no contiene un formulario acro.");
            }
        }
    }
    
     public static String[] extraerIDsCamposTextoPDF(String rutaFormulario) throws IOException {
        List<String> ids = new ArrayList<>();
        try (PDDocument pdfDocument = PDDocument.load(new File(rutaFormulario))) {

            // Obtener el formulario acro
            PDDocumentCatalog docCatalog = pdfDocument.getDocumentCatalog();
            PDAcroForm acroForm = docCatalog.getAcroForm();

            if (acroForm != null) {
                // Obtener todas las p?ginas del PDF
                for (PDPage page : pdfDocument.getPages()) {
                    // Obtener los campos de texto en la p?gina actual
                    for (PDField field : acroForm.getFieldTree()) {
                        if (field instanceof PDField) {
                            // Agregar el ID al array
                            ids.add(field.getPartialName());
                        }
                    }
                }
            } else {
                System.out.println("El PDF no contiene un formulario acro.");
            }
        }
        return ids.toArray(String[]::new);
    }
     
     public static void descartarCamposNoEditablesPDF(String rutaFormulario) throws IOException {
        try (PDDocument pdfDocument = PDDocument.load(new File(rutaFormulario))) {

            // Obtener el formulario acro
            PDDocumentCatalog docCatalog = pdfDocument.getDocumentCatalog();
            PDAcroForm acroForm = docCatalog.getAcroForm();

            if (acroForm != null) {
                // Obtener todas las p?ginas del PDF
                for (PDField field : acroForm.getFieldTree()) {
                    if (field instanceof PDField) {
                        // Verificar si el campo es editable
                        if (!field.isReadOnly()) {
                            // El campo es editable, realizar acciones necesarias
                            System.out.println("Campo editable - ID: " + field.getPartialName());
                        } else {
                            // El campo no es editable, puedes descartarlo si es necesario
                            System.out.println("Campo no editable - ID: " + field.getPartialName());
                        }
                    }
                }
            } else {
                System.out.println("El PDF no contiene un formulario acro.");
            }
        }
    }
     public static String obtenerNombreCampo(PDField field) {
         
         // Convertir el nombre del campo a UTF-8
         String nombreCampo = new String(field.getPartialName().getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
         return nombreCampo;
    }
}


