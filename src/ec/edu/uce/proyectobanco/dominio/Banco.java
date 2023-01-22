package ec.edu.uce.proyectobanco.dominio;

import java.util.Arrays;

/**
 * Creacion de la clase Banco y varios de sus atributos y operaciones
 * elementales.
 *
 * @author Eduardo Noboa
 */
public class Banco {

    /**
     * Creacion de los atributos de la clase Banco
     */
    private String nombre;
    private String direccion;
    private Cliente clientes[];
    private int numClientes;

    private static Empleado empleados[];
    private static int numEmpleados;

    /**
     * Creacion del constructor sin argumentos
     */
    
    static{
     empleados = new Empleado[3];
     numEmpleados = 0;
        
    }
    
    public Banco() {
        this.nombre = "Banco Universidad";
        this.direccion = "Av. America";
        this.clientes = new Cliente[3];
        this.numClientes = 0;

//        Banco.empleados = new Empleado[3];
//        Banco.numEmpleados = 0;
        //System.out.println("Se está ejecutando el constructor sin argumentos");
    }

    /**
     * Crea una instancia de la clase Banco
     *
     * @param nombre nos indica el nombre del cliente del Banco
     * @param direccion nos proporciona la dirección del cliente
     * @param clientes arreglo de la clase Banco
     * @param numClientes Numero de clientes de la clase Banco
     */
    public Banco(String nombre, String direccion, Cliente[] clientes, int numClientes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.clientes = clientes;
        this.numClientes = numClientes;
        //System.out.println("En ejecución el constructor con");
    }

    /**
     * Metodo de la clase Banco donde se va a ingresar un nuevo cliente
     *
     * @param idCliente numero que sirve como referencia para identificar al
     * cliente
     * @param nombre del cliente
     * @param apellido del cliente
     */
    public void nuevoCliente(int idCliente, String nombre, String apellido) {

        //Creacion de un array para si es el caso agregue más clientes
        if (numClientes == clientes.length) {
            Cliente[] aux = new Cliente[clientes.length + 1];
            System.arraycopy(clientes, 0, aux, 0, clientes.length);
            clientes = aux;
        }
        int i = numClientes++;
        // System.out.println(i);
        //clientes[i] = new Cliente(idCliente, nombre, apellido);
        clientes[i] = new Cliente(idCliente, nombre, apellido);

    }

    /**
     * Creación del método String declaro la variable lista de tipo String
     *
     * @return nos va a devolver la lista de los clientes por medio de un for
     */
    public String listarClientes() {
        String lista = "";

        for (Cliente cliente : clientes) {
            if (cliente != null) {
                lista += cliente;
            }

        }
        return lista;
    }

    public Cliente buscarCliente(int posicion) {
        return clientes[posicion];

    }

    public void editarCliente(int posicion, String nombre, String apellido) {

        clientes[posicion] = new Cliente(numClientes, nombre, apellido);

    }

    //Metodo  Eliminar Clientes
    public void eliminarCliente(int posicion) {
        numClientes--;
        int a = 0;
        Cliente[] eliAux = clientes;
        clientes = new Cliente[numClientes];
        if (posicion < eliAux.length - 1) {
            if (posicion == eliAux.length - 1) {
                System.arraycopy(eliAux, 0, clientes, 0, numClientes);

            } else {
                for (int i = 0; i < eliAux.length; i++) {
                    if (i != posicion) {
                        clientes[a] = eliAux[i];
                        a++;

                    }
                }
            }
        } else {
            System.out.println("No existe la posicion: " + posicion);

        }
    }

    //Empleados
    
//    public static void nuevoEmpleado(Empleado e) {
     public static void nuevoEmpleado(Empleado e) {
        int i = numEmpleados++;

        if (numEmpleados > empleados.length) {
            Empleado[] arAux = empleados;
            empleados = new Empleado[numEmpleados];
            System.arraycopy(arAux, 0, empleados, 0, arAux.length);
        }
       
        empleados[i] = e;
    }
    
    
    /**
     * Metodos Getter que nos permite mostrar el valor del atributo de la clase
     * Banco
     *
     * @return nos regresa los atributos de la clase Banco
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public int getNumClientes() {
        return numClientes;
    }

    /**
     * Metodo Setter que sirve para modificar el valor
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo Setter que sirve para modificar el valor
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo Setter que sirve para modificar el valor
     *
     * @param clientes
     */
    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    /**
     * Metodo Setter que sirve para modificar el valor
     *
     * @param numClientes
     */
    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    
    
    /**
     * Método para convertir a String el objeto en Java
     *
     * @return Se poner en cadena de texto todos los atributos de la clase Banco
     */
    @Override
    public String toString() {
        return " \nnombre=" + nombre
                + ", \ndireccion=" + direccion
                + ", \nclientes=" + Arrays.toString(clientes)
                + ", \nnumClientes=" + numClientes;
    }

}
