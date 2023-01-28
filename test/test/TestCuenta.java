package test;

import ec.edu.uce.proyectobanco.dominio.CuentaAhorro;
import ec.edu.uce.proyectobanco.dominio.CuentaCorriente;
import java.util.Scanner;

/**
 *
 * @author Edu. N
 */
public class TestCuenta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Crear objetos de las clases CuentaAhorro y CuentaCorriente
        CuentaAhorro cAhorro = new CuentaAhorro(100.0);
        CuentaCorriente cCorriente = new CuentaCorriente(100.0, 10.0);

        int opcion;
        do {
            System.out.println("*** Menú de opciones ***");
            System.out.println("1. Ver saldo de cuenta de ahorro");
            System.out.println("2. Realizar depósito en cuenta de ahorro");
            System.out.println("3. Realizar retiro en cuenta de ahorro");
            System.out.println("4. Ver saldo de cuenta corriente");
            System.out.println("5. Realizar depósito en cuenta corriente");
            System.out.println("6. Realizar retiro en cuenta corriente");
            System.out.println("7. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Saldo de cuenta de ahorro: " + cAhorro.getSaldo());
                case 2 -> {
                    System.out.println("Ingrese el monto a depositar en la cuenta de ahorro: ");
                    double montoDeposito = sc.nextDouble();
                    if (cAhorro.deposito(montoDeposito)) {
                        System.out.println("Depósito realizado exitosamente");
                    } else {
                        System.out.println("No se pudo realizar el depósito");
                    }
                }
                case 3 -> {
                    System.out.println("Ingrese el monto a retirar de la cuenta de ahorro: ");
                    double montoRetiro = sc.nextDouble();
                    if (cAhorro.retiro(montoRetiro)) {
                        System.out.println("Retiro realizado exitosamente");
                    } else {
                        System.out.println("No se pudo realizar el retiro");
                    }
                }
                case 4 -> System.out.println("Saldo de cuenta corriente: " + cCorriente.toString());
                case 5 -> {
                    System.out.println("Ingrese el monto a depositar en la cuenta corriente: ");
                    double montoDeposito2 = sc.nextDouble();
                    if (cCorriente.deposito(montoDeposito2)) {
                        System.out.println("Depósito realizado exitosamente");
                    } else {
                        System.out.println("No se pudo realizar el depósito");
                    }
                }
                case 6 -> {
                    System.out.println("Ingrese el monto a retirar de la cuenta corriente: \n");
                    double montoRetiro2 = sc.nextDouble();

                    if (cCorriente.retiro(montoRetiro2)) {
                        System.out.println("Retiro realizado exitosamente");
                    } else {
                        System.out.println("No se pudo realizar el retiro");
                    }
                }
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida, por favor seleccione una opción válida");
            }
        } while (opcion != 7);
    }
}

//    public  static void  main(String[] args) {
//        // Crear instancia de CuentaAhorro
//        CuentaAhorro ca = new CuentaAhorro(100.00);
//        System.out.println("Cuenta Ahorros\n");
//        // Realizar deposito
//        ca.deposito(100.00);
//        // Realizar retiro
//        ca.retiro(200.00);
//        // Imprimir saldo actual
//        System.out.println("Saldo actual en cuenta de ahorro: $" + ca.getSaldo());
//
//        // Crear instancia de CuentaCorriente
//        CuentaCorriente cc = new CuentaCorriente(100.00, 10.00);
//        // Realizar deposito
//        cc.deposito(00.00);
//        // Realizar retiro
//        cc.retiro(120.00);
//        // Imprimir saldo actual y sobregiro
//        System.out.println(cc.toString());
//    }

    
//    public static void main(String[] args) {
//        //Creacion del Objeto dep de la clase Cuenta
//        Cuenta dep = new Cuenta() {};
//        //Creacion del Objeto Scanner src de la clase Scanner
//        Scanner src = new Scanner(System.in);
//        int opc;
//        System.out.println("==========================================");
//        System.out.println("Bienvenido al ménu del Banco Universitario");
//        System.out.println("==========================================");
//        do {
//            System.out.println("1. Consultar");
//            System.out.println("2. Depositar");
//            System.out.println("3. Retirar");
//            System.out.println("4. Salir");
//            System.out.println("");
//            System.out.println("Escoja una opción: ");
//            opc = src.nextInt();
//            switch (opc) {
//                case 1 ->
//                    System.out.println("Su saldo actual es de: " + dep);
//                case 2 ->
//                    dep.depositar();
//                case 3 ->
//                    dep.retirar();
//                case 4 ->
//                    System.out.println("Gracias por usar nuestros servicios :)");
//            }
//
//        } while (opc != 4);
//    }

