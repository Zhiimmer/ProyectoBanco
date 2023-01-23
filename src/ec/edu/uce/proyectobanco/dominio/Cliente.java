package ec.edu.uce.proyectobanco.dominio;

/**
 * @author Eduardo Noboa
 */
public class Cliente {

    /**
     * Creacion de los atributo de la clase Cliente
     */
    private int idCliente;
    private String nombre;
    private String apellido;
    private Cuenta[] cuentas;
    private int numCuentas;

    /**
     * Creacion del método constructor sin argumentos de la clase Cliente
     */
    public Cliente() {
        this.idCliente = 00000;
        this.nombre = "XXXX";
        this.apellido = "XXXXX";
        this.cuentas = new Cuenta[3];
        this.numCuentas = 0;
        //System.out.println("Se esta ejecutando el constructor sin argumentos");
    }

    /**
     * Creacion del método constructor con argumentos
     *
     * @param idCliente nos indica el numero de identificacion del cliente
     * @param nombre indica el nombre del cliente
     * @param apellido indica el apellido del cliente
     * @param numCuentas
     */
    public Cliente(int idCliente, String nombre, String apellido, int numCuentas) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCuentas = numCuentas;
        //System.out.println("Se está ejecutando el constructor con argumentos");
    }
    
    /**
     * Creacion del método constructor con argumentos
     *
     * @param idCliente nos indica el numero de identificacion del cliente
     * @param nombre indica el nombre del cliente
     * @param apellido indica el apellido del cliente
     */
    public Cliente(int idCliente, String nombre, String apellido) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Método Get que nos permite mostrar el valor del atributo IdCliente
     *
     * @return nos regresa los atributos de la clase Cliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Método Get que nos permite mostrar el valor del atributo nombre
     *
     * @return nos regresa los atributos de la clase Cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método Get que nos permite mostrar el valor del atributo apellido
     *
     * @return nos regresa los atributos de la clase Cliente
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Método Get que nos permite mostrar el valor del atributo cuentas
     *
     * @return nos regresa los atributos de la clase Cliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
//        return " idCliente=" + idCliente
//                + ", nombre=" + nombre + ", apellido="
//                + apellido + ", cuentas="
//                + Arrays.toString(cuentas) + ", numCuentas=" + numCuentas + "\n";
//    }
        return "idCliente=" + idCliente
                + ", nombre=" + nombre + ", apellido="
                + apellido + "\n";
    }

}
