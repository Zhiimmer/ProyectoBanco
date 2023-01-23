package ec.edu.uce.proyectobanco.dominio;

/**
 *
 * @author Zhiimmer
 */
public class Director extends Manager {

    protected double comision;

    /**
     *
     * @param director
     * @param gerente
     * @param empleado
     */
    public Director(Director director, Manager gerente, Empleado empleado) {
        super(gerente, empleado);
        this.comision = director.comision;
    }

    public Director(double comision) {
        this.comision = comision;
    }

    //Metodos Getter and Setter
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
