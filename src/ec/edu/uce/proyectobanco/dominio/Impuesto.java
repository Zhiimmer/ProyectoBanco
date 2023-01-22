package ec.edu.uce.proyectobanco.dominio;

/**
 *
 * @author Zhiimmer
 */
public class Impuesto {

    /**
     * Atributos
     */
    private double tasa;
 
    /**
     * 
     */
    public Impuesto() {
        this.tasa = 0.5;
    }

    /**
     * 
     * @param tasa 
     */
    public Impuesto(double tasa) {
        this.tasa = tasa;
    }
    
    /**
     * 
     * @param impuesto 
     */
    public Impuesto(Impuesto impuesto) {
        this.tasa = impuesto.tasa;
        
    }

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
     * 
     * @param tasa
     * @param salario
     * @return 
     */
    public double calcularImpuesto (Double tasa,Double salario){
        Double aux = tasa*salario ;
        return aux;
        
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
