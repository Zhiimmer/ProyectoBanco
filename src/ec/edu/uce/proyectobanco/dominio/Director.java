package ec.edu.uce.proyectobanco.dominio;

import java.time.LocalDate;

/**
 *
 * @author Zhiimmer
 */
public class Director extends Manager {

    protected double comision;

    /**
     * Constructor sin argumentos de la clase Director
     */
    public Director() {
        super();
        this.comision = 25.0;
    }

    /**
     * Constructor de la clase con argumentos
     *
     * @param nombre
     * @param apellido
     * @param cargo
     * @param salario
     * @param fechaNacimiento
     * @param departamento
     * @param comision
     */
    public Director(String nombre, String apellido, String cargo, Double salario, LocalDate fechaNacimiento, String departamento, double comision) {
        super(nombre, apellido, cargo, salario, fechaNacimiento, departamento);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    //toString
    @Override
    public String toString() {
//        return "Director{" + "comision=" + comision + '}';
        return super.toString() + this.comision;

    }

}
