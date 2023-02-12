package ec.edu.uce.proyectobanco.dominio;

/**
 *
 * @author Zhiimmer
 */
public abstract class  Cuenta {

    /**
     * Creacion de los atributos de la clase cuenta
     */
    protected double saldo;

    /**
     * Creacion del constructor Cuenta con argumentos
     *
     * @param inicioSaldo
     */
    public Cuenta(double inicioSaldo) {
        this.saldo = inicioSaldo;
    }

//    public Cuenta() {
//
//        this.balance = 100.0;
//
//    }
//
//    /**
//     * Creacion del metodo depositar
//     */
//    public void depositar() {
//        double depositar = 150.0;
//        //Equivale a usar: this.balance = this.balance + depositar;
//        this.balance += depositar;
//        System.out.println("Se depositara el valor de $150 en su cuenta\nSaldo Actual: $" + this.balance + "\n");
//    }
//
//    /**
//     * Creacion del metodo retirar
//     */
//    public void retirar() {
//        double retirar = 100.0;
//        //Equivale a usar: this.balance = this.balance - retirar;
//        this.balance -= retirar;
//        System.out.println("Se retiraron $100 de su cuenta\nSaldo Actual: $" + this.balance + "\n");
//
//    }

    /**
     * Metodo get para el balance
     *
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

//    /**
//     * Metodo toString
//     *
//     * @return
//     */
//    @Override
//
//    public String toString() {
//        return " $" + saldo + "\n";
//    }
    
    //Metodo abstractos 
    
    public abstract boolean retiro(double monto) throws SobregiroException;

    public abstract boolean deposito (double monto);

}
