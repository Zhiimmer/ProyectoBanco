package test;

import ec.edu.uce.proyectobanco.dominio.Banco;

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
    }

}
