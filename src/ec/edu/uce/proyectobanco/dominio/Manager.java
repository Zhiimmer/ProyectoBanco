package ec.edu.uce.proyectobanco.dominio;

import java.time.LocalDate;

/**
 *
 * @author Zhiimmer
 */
public class Manager extends Empleado {

    protected String departamento;

    //Constructor con argumento

    public Manager(String nombre, String apellido, String cargo, Double salario, LocalDate fechaNacimiento, String departamento) {
        super(nombre, apellido, cargo, salario, fechaNacimiento);
        this.departamento = departamento;
    }
        
    //Constructor sin argumentos
    
    public Manager(){
        super();
        this.departamento = "Informatica";
    }
    
    //Metodos Get y Set
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String toString() {
        //return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", fechaNacimiento=" + fechaNacimiento + '}';
//        return this.nombre + this.apellido + this.cargo +this.departamento;
        return super.toString() + "\nDepartamento: " + this.departamento;
    }

}
