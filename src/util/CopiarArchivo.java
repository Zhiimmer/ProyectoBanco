package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edu. N
 */

/**
 * Clase para copiar un archivo.
 */
public class CopiarArchivo {

    public static void main(String[] args) {

        try {
            /**
             * Creamos un objeto FileReader llamado entrada, que usamos para leer desde un
             * archivo prueba.txt, si no se encuentra este archivo se lanza la excepcion
             * FileNotFoundException
             */
            FileReader entrada = new FileReader("prueba.txt");
            try {
                /**
                 * Creamos un objeto FileWrite salida llamado salida, que se usa para escribir
                 * un archivo llamado salida.txt, si tenemos un error se lanza: IOException
                 */
                FileWriter salida = new FileWriter("salidaV2.txt");

                /**
                 * Usamos un array de caracteres llamado buffer con un tamaño de 128 caracteres
                 * 
                 */
                char[] buffer = new char[128];

                int lectura;
                /**
                 * Usamos el método read del objeto entrada que usamos para leer desde el archivo 
                 * prueba.txt y almacenar los caracteres en el buffer, el método devuelve un entero
                 * que nos indica la cantidad de caracteres leidos.
                 */
                lectura = entrada.read(buffer);
                /**
                 * El ciclo While continuara hasta que no se haya leído un caracter más, que es indicado
                 * con el valor de -1, en cada iteración el método write del objeto salida se usa para
                 * escribir los caracteres del buffer en el archivo salida.txt
                 */
                while (lectura != -1) {
                    salida.write(buffer, 0, lectura);
                    lectura = entrada.read(buffer);
                }
                /**
                 * Finalmente el objeto salida se cierra con el método close 
                 */
                salida.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                /**
                 * Y el objeto entrada se cierra con el método close en el bloque finally
                 */
                entrada.close();
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();

        }

    }

}
