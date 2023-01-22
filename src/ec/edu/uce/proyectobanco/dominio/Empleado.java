package ec.edu.uce.proyectobanco.dominio;

import java.util.Date;

/**
 *
 * @author Zhiimmer
 */
public class Empleado {

    //Atributos de la clase Empleado
    protected String nombre;
    protected String apellido;
    protected String cargo;
    protected double salario;
    protected Date fechaNacimiento;

    //Constructor de la clase empleado

    public Empleado() {
        this.nombre = "Juan";
        this.apellido = "Perez";
        this.cargo = "Cajero";
        this.fechaNacimiento = new Date (12/2012/22/12/15/00);
        this.salario= 200.00 ;
    }
    
    public Empleado(String nombre, String apellido, String cargo, Date fechaNacimiento, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.fechaNacimiento = fechaNacimiento;
        this.salario = salario;
    }

    public Empleado(String nombre, String apellido, String cargo, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public Empleado(Empleado empleado) {
        this.nombre = empleado.nombre;
        this.apellido = empleado.apellido;
        this.cargo = empleado.cargo;
        this.fechaNacimiento = empleado.fechaNacimiento;
        this.salario=empleado.salario;
    }
    
    //Metodos Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;

    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        //return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", fechaNacimiento=" + fechaNacimiento + '}';
        return this.nombre + " " + this.apellido + " " + this.cargo + this.fechaNacimiento + " " + this.salario;
    }

}
