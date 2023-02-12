package util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 *
 * @author Edu. N
 */
public class SerializarDate {

    public SerializarDate() {
        Date d = new Date();

        try {
            FileOutputStream f = new FileOutputStream("fecha.txt");
            
            ObjectOutputStream o = new ObjectOutputStream(f);
            
            o.writeObject(d);
            o.close();
            
            
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new SerializarDate();
    }
    
    

}
