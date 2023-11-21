package cumplimentacionPDF;

import java.io.IOException;

public class Imprimir extends Thread{

	@SuppressWarnings("unused")
	public void imprimirDelegados() {

		try {
			// Ruta al intérprete de PowerShell
			String powerShellCmd = "powershell.exe";

			// Ruta al script .ps1 que deseas ejecutar
			String scriptPath = "C:\\Users\\alber\\Desktop\\ImprimirDelegados.ps1";

			// Crear el proceso para ejecutar el script
			ProcessBuilder processBuilder = new ProcessBuilder(powerShellCmd, "-File", scriptPath);

			// Iniciar el proceso
			Process process = processBuilder.start();

			// Esperar a que el proceso termine
			int exitCode = process.waitFor();

			// Imprimir el código de salida del proceso
			Thread.sleep(2000);
			ModificarCamposTextoPDFv2.mostrarMensaje(("Impresión finalizada."));

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	public void imprimirComites() {

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
			Thread.sleep(2000);
			System.out.println("Impresión finalizada.");

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void imprimirCumplimentados(String nombreEmpresa) {
		// TODO Auto-generated method stub
		
	}
	
	
}