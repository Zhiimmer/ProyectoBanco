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
        CuentaAhorro ca = new CuentaAhorro(100.0);
        CuentaCorriente cc = new CuentaCorriente(100.0, 10.0);

        int opcion;
        do {
            System.out.println("==========================================");
            System.out.println("      Bienvenido al ménu de la Cuenta     ");
            System.out.println("==========================================");
            System.out.println("   Menú de opciones ");
            System.out.println("1. Ver saldo de cuenta de ahorro");
            System.out.println("2. Realizar depósito en cuenta de ahorro");
            System.out.println("3. Realizar retiro en cuenta de ahorro");
            System.out.println("4. Ver saldo de cuenta corriente");
            System.out.println("5. Realizar depósito en cuenta corriente");
            System.out.println("6. Realizar retiro en cuenta corriente");
            System.out.println("7. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 ->
//                    System.out.println("\nSaldo de la Cuenta de Ahorros: $" + ca.getSaldo() + "\n");
                    System.out.println("\nSaldo de la Cuenta de Ahorros" + ca.toString());

                case 2 -> {
                    System.out.println("Ingrese el monto a depositar en la cuenta de ahorro: ");
                    double montoDeposito = sc.nextDouble();
                    System.out.println(ca.deposito(montoDeposito) ? "Deposito realizado exitosamente :)" : "El valor debe ser mayor a $1\n");
//                    if (ca.deposito(montoDeposito)) {
//                        System.out.println("Depósito realizado exitosamente :)");
//                    } else {
//                        System.out.println("No se pudo realizar el depósito :(");
//                        System.out.println("El valor debe ser mayor a $1");
//                    }
                }
                case 3 -> {
                    System.out.println("Ingrese el monto a retirar de la cuenta de ahorro: ");
                    double montoRetiro = sc.nextDouble();
                    System.out.println(ca.retiro(montoRetiro) ? "Retiro realizado exitosamente :)" : "Fondos insuficientes :(");

                }
                case 4 ->
                    System.out.println("Saldo de la Cuenta Corriente " + cc.toString());
                case 5 -> {
                    System.out.println("Ingrese el monto a depositar en la cuenta corriente: ");
                    double montoDeposito2 = sc.nextDouble();
                    System.out.println(cc.deposito(montoDeposito2) ? "Deposito realizado exitosamente :)" : "El valor debe ser mayor a $1\n");

//                    if (cc.deposito(montoDeposito2)) {
//                        System.out.println("Depósito realizado exitosamente :)");
//                    } else {
//                        System.out.println("No se pudo realizar el depósito :(");
//                    }
                }
                case 6 -> {
                    System.out.println("Ingrese el monto a retirar de la Cuenta Corriente: \n");
                    double montoRetiro2 = sc.nextDouble();
                    System.out.println(cc.retiro(montoRetiro2) ? "Retiro realizado exitosamente :)" : "Fondos insuficientes :(");
//                    if (cc.retiro(montoRetiro2)) {
//                        System.out.println("Retiro realizado exitosamente :)");
//                    } else {
//                        System.out.println("No se pudo realizar el retiro :(");
//                    }
                }
                case 7 ->
                    System.out.println("Saliendo del programa...");
                default ->
                    System.out.println("Opción inválida, por favor seleccione una opción válida");
            }
        } while (opcion != 7);
    }
}
