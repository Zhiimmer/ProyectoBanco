package ec.edu.uce.proyectobanco.dominio;

import java.util.Date;

/**
 *
 * @author Zhiimmer
 */
public class Gerente extends Empleado {

    protected String departamento;

    //Constructores
    public Gerente(String departamento) {
        this.departamento = departamento;
    }

    public Gerente(String nombre, String apellido, String cargo, Date fechaNacimiento, double salario, String departamento) {
        super(nombre, apellido, cargo, fechaNacimiento, salario);
        this.departamento = departamento;
    }

    public Gerente() {
        super();
        this.departamento = "xxx";
    }

    public Gerente(Gerente gerente, Empleado empleado) {
        super(empleado);
        this.departamento = gerente.departamento;
    }
    //Metodos Get y Set
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
//
//    @Override
//    public String toString() {
//        return "Gerente{" + "departamento=" + departamento + '}';
//    }

    public String toString() {
        //return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", fechaNacimiento=" + fechaNacimiento + '}';
//        return this.nombre + this.apellido + this.cargo +this.departamento;
        return super.toString() + " " + this.departamento;
    }

}
