package test;

import ec.edu.uce.proyectobanco.dominio.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Edu. N
 */
public class TestCuenta {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //Creacion del Objeto dep de la clase Cuenta
        Cuenta dep = new Cuenta();
        //Creacion del Objeto Scanner src de la clase Scanner
        Scanner src = new Scanner(System.in);
        int opc;
        System.out.println("==========================================");
        System.out.println("Bienvenido al ménu del Banco Universitario");
        System.out.println("==========================================");
        do {
            System.out.println("1. Consultar");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.println("Escoja una opción: ");
            opc = src.nextInt();
            switch (opc) {
                case 1 ->
                    System.out.println("Su saldo actual es de: " + dep);
                case 2 ->
                    dep.depositar();
                case 3 ->
                    dep.retirar();
                case 4 ->
                    System.out.println("Gracias por usar nuestros servicios :)");
            }

        } while (opc != 4);
    }

}
