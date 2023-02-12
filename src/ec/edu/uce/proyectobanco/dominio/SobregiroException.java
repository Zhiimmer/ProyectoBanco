
package ec.edu.uce.proyectobanco.dominio;

/**
 *
 * @author Edu. N
 */
public class SobregiroException extends Exception {
    
    private double deficit;
    
    
    public SobregiroException (String msg, double deficit){
        super(msg);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }

    public void setDeficit(double deficit) {
        this.deficit = deficit;
    }

    
}
