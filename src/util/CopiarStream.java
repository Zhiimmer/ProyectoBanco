package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Edu. N
 */
/**
 * Este código es un programa en Java que copia el contenido de un archivo a otro archivo.
 * @author Zhiimmer
 */
public class CopiarStream {

    public static void main(String[] args) {
        
        try {
            FileInputStream entrada = new FileInputStream("prueba.txt");
            try {
                FileOutputStream salida = new FileOutputStream("salidaOut.txt");

                byte[] buffer = new byte[128];

                int lectura;

                lectura = entrada.read(buffer);

                while (lectura != -1) {
                    salida.write(buffer, 0, lectura);
                    lectura = entrada.read(buffer);
                }

                salida.close();

            } finally {
                entrada.close();
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();

        }

    }

}
