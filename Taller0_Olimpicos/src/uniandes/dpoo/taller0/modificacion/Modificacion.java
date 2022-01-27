/**
 * 
 */
package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

/**
 * Ejecuta un nuevo programa con las modificaciones dadas
 * en el taller.
 */
public class Modificacion {

	/**
	 * Imprime en consola el país con más medallistas y el número de medallistas.
	 * @param args
	 */
	public static void main(String[] args) {
		CalculadoraEstadisticas calc;
		try {
			calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
			Set<String> keys = calc.paisConMasMedallistas().keySet();
	        for ( String key : keys ) {
	            System.out.println("El país con más medallistas es " + key.substring(0, 1).toUpperCase() + key.substring(1) + " con " + calc.paisConMasMedallistas().get(key) + " medallistass.");
	        }
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: El archivo no existe");
		} catch (IOException e) {
			System.out.println("ERROR: Existe un problema leyendo el archivo");
		}

	}

}
