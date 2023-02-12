package test;

import ec.edu.uce.proyectobanco.dominio.Cuenta;
import ec.edu.uce.proyectobanco.dominio.CuentaAhorro;
import ec.edu.uce.proyectobanco.dominio.SobregiroException;

/**
 *
 * @author Edu. N
 */
public class TestException {

    public static void main(String[] args) throws SobregiroException {
        Cuenta ca = new CuentaAhorro(100);
        double ret = 20;

        try {
            ca.retiro(20);

        } catch (SobregiroException ex) {
            System.out.println(ex.getMessage() + " Deficit: " + ex.getDeficit());
        } finally{
            System.out.println("Cuenta");
            System.out.println("Monto de Retiro: " + ret);
            System.out.println(ca);
    }
    }

}
