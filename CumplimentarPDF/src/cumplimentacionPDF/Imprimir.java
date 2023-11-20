package Delegados;

import java.io.IOException;

public class Imprimir {
	
	public static void main(String[] args) {
        try {
            // Ruta al intérprete de PowerShell
            String powerShellCmd = "powershell.exe";

            // Ruta al script .ps1 que deseas ejecutar
            String scriptPath = "C:\\Users\\alber\\Desktop\\ImprimirComite.ps1";

            // Crear el proceso para ejecutar el script
            ProcessBuilder processBuilder = new ProcessBuilder(powerShellCmd, "-File", scriptPath);

            // Iniciar el proceso
            Process process = processBuilder.start();

            // Esperar a que el proceso termine
            int exitCode = process.waitFor();
            
            // Imprimir el código de salida del proceso
            System.out.println("El script se ejecutó con código de salida: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
