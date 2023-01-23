package test;

import ec.edu.uce.proyectobanco.dominio.Cliente;

/**
 *
 * @author Edu. N.
 */
public class TestCliente {

    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.setNombre("Fiona");
        c.setApellido("Regia");
        c.setIdCliente(1);
        Cliente.setNumCuentas(3);

    }

}
