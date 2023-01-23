package test;

import ec.edu.uce.proyectobanco.dominio.Banco;
import ec.edu.uce.proyectobanco.dominio.Director;
import ec.edu.uce.proyectobanco.dominio.Empleado;
import ec.edu.uce.proyectobanco.dominio.Impuesto;
import ec.edu.uce.proyectobanco.dominio.Manager;
import java.time.LocalDate;

/**
 * @author Zhiimmer
 */
public class TestBanco {

    public static void main(String[] args) {

        /**
         * Creacion del objeto cliente1 de la clase Banco
         */
        Banco cliente = new Banco();
        cliente.nuevoCliente(1, "Luis", "Mora");
        cliente.nuevoCliente(2, "Juanito", "Alimaña");
        cliente.nuevoCliente(3, "Pepito", "Gonzales");
        cliente.nuevoCliente(4, "Benito", "Conejo");
        cliente.nuevoCliente(4, "Pepito", "Lucas");

        System.out.println("Se van a imprimir la lista de los clientes: \n");
        System.out.println(cliente.listarClientes());
        System.out.println("Buscar Cliente 4: \n\n" + cliente.buscarCliente(3));
        System.out.println("Se va a editar el Cliente Pepito por Eduardo\n");
        cliente.editarCliente(2, "Eduardo", "Noboa");
        System.out.println(cliente.listarClientes());
        System.out.println("Se va a eliminar el cliente Juanito de la base de datos del Banco");
        cliente.eliminarCliente(1);
        System.out.println(cliente.listarClientes());

        System.out.println("Impresion de los Empleados del Banco:\n");

        //Ejecución para Empleados de banco con Herencia y demás...
        LocalDate fecha = LocalDate.of(1995, 03, 07);
        Empleado e = new Empleado("Eduardo", "Noboa", "Técnico", 1250.0, fecha);
        Manager m = new Manager("Juanito", "Alimaña", "Contador", 650.0, fecha, "Contaduría");
        Director d = new Director("Pedro", "Casablanca", "Supervisor", 750.0, fecha, "Gerencia", 200.0);
        Impuesto i = new Impuesto();
        Empleado[] empleados = {e, m, d};
        
        /*
        se utiliza la variable "contador" para llevar un registro de cuántos objetos se han impreso,
        y se utiliza la sentencia "break" para detener el ciclo "for" una vez que se hayan impreso
        todos los objetos del arreglo.
        */

        int contador = 0;

        for (Empleado w : empleados) {
            if (e instanceof Empleado) {
                double tasa = 0;
                double salario = e.getSalario();
                i.calcularImpuesto(tasa, salario);
                System.out.println(e.toString() + "\nTasa: " + i.calcularImpuesto(tasa, salario) + "\n");
                contador++;

            }
            if (m instanceof Manager) {
                double tasa = 0.10;
                double salario = m.getSalario();
                i.calcularImpuesto(tasa, salario);
                double s = salario + (i.calcularImpuesto(tasa, salario));
                System.out.println(m.toString() + "\nTasa: " + i.calcularImpuesto(tasa, salario) + "\nSalario: " + s + "\n");
                contador++;

            }
            if (d instanceof Director) {
                double tasa = 0.20;
                double comision = d.getComision();
                double salario = d.getSalario();
                double r = i.calcularImpuesto(tasa, salario);
                double s = salario + (r + comision);
                System.out.println(d.toString() + "\nTasa: " + i.calcularImpuesto(tasa, salario) + "\nSalario: " + s + "\n");
                contador++;

            }
            if (contador == empleados.length) {
                break;
            }
        }

    }

}
