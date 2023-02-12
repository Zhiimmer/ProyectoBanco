package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

/**
 *
 * @author Edu. N
 */
public class DeserializarDate {

    public DeserializarDate() {

        Date d = null;

        try {
            FileInputStream f = new FileInputStream("fecha.txt");

            ObjectInputStream o = new ObjectInputStream(f);

            d = (Date) o.readObject();

            o.close();
            System.out.println("Fecha deserializada" + d);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        
        
    }
    public static void main(String[] args) {
        new DeserializarDate();
    }
}
