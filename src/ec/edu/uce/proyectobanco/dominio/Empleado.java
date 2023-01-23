package ec.edu.uce.proyectobanco.dominio;

import java.time.LocalDate;

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
    protected LocalDate fechaNacimiento;

    //Constructor con argumentos de la clase empleado

    public Empleado(String nombre, String apellido, String cargo, double salario, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
    }
    //Constructor sin argumentos o predeterminado
    
    public Empleado() {
        this.nombre = "Eduardo";
        this.apellido = "Noboa";
        this.cargo = "Estudiante de Ing.";
        this.salario = 1250.0;
//        LocalDate fechaNacimiento = LocalDate.of(1995, 03, 07);
        this.fechaNacimiento = LocalDate.of(1995, 03, 07);
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
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
        return this.nombre + " " + this.apellido + " " + this.cargo + this.salario + " " + this.fechaNacimiento;
    }

}
