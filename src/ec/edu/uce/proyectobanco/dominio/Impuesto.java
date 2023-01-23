package ec.edu.uce.proyectobanco.dominio;

/**
 *
 * @author Zhiimmer
 */
public class Impuesto {

    private double tasa;
    
    /**
     * Constructor sin argumentos o parámetros
     */
    public Impuesto() {
        this.tasa = 0.5;
    }

    /**
     * Constructor con argumentos
     * Este constructor tiene un parámetro double "tasa",
     * el cual se utiliza para establecer el valor de la 
     * tasa de impuesto en la instancia de la clase.
     * @param tasa 
     */
    public Impuesto(double tasa) {
        this.tasa = tasa;
    }
    
    /**
     * Este constructor se utiliza para establecer el valor de la tasa de
     * impuesto en la nueva instancia de la clase igual al
     * valor de la tasa de impuesto en la instancia existente.
     * @param impuesto 
     */
    public Impuesto(Impuesto impuesto) {
        this.tasa = impuesto.tasa;
        
    }
    //Getter and Setter
    
    /**
     * 
     * @return 
     */
    public double getTasa() {
        return tasa;
    }

    /**
     * 
     * @param tasa 
     */
    public void setTasa(double tasa) {
        this.tasa = tasa;
    }
    
    /**
     * Método donde calculamos impuesto de nuestros empleados
     * @param tasa
     * @param salario
     * @return 
     */
    public double calcularImpuesto (Double tasa,Double salario){
//        Double aux = tasa*salario;
        return tasa*salario;
        
    }

    @Override
    public String toString() {
        return "Impuesto{" + "tasa=" + tasa + '}';
    }

}

//Tasa * salario
/*
        Empleado tasa =0;
        Gerente tasa = 0.10;
        Director tasa = 0.20;
 */
//Usar instanceof 
        //casting de objetos
