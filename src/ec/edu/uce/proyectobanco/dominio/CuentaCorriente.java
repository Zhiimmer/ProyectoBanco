
package ec.edu.uce.proyectobanco.dominio;

/**
 *
 * @author Edu. N
 */
public class CuentaCorriente extends Cuenta {
    
//    private double montoInteres;
    private double sobregiro = 10;
    
    //Constructores
    
    public CuentaCorriente (double saldo, double sobregiro){
        super(saldo);
        this.sobregiro = sobregiro;
    }
    
    public CuentaCorriente(double saldo){
        super(saldo);
        this.sobregiro = 0.0;
    }
    
    //Metodos
    @Override
    public boolean deposito(double monto) {
        boolean resp = false;
        if (monto > 1) {
            saldo = saldo + monto;
            resp = true;
        } else {
            System.out.println("No se pudo depositar");
        }
        return resp;

    }

    @Override
    public boolean retiro(double monto) {
        boolean resp = false;
        if (monto <= (super.getSaldo() + sobregiro)) {
            if (monto > super.getSaldo()) {
                super.saldo = (super.getSaldo()-monto);
                sobregiro = sobregiro + saldo;
                return true;
            } else{
                super.saldo = super.getSaldo()-monto;
            }
            
        } else {
            System.out.println("No se pudo retirar");
        }
        return resp;

    }

    @Override
    public String toString() {
        double total = (super.getSaldo()+sobregiro);
        return """
               \nCuentaCorriente\n
               Saldo: """ + super.getSaldo() + "\nSobregiro = " + sobregiro + 
                "\nTotal: " + total;
    }

    
}
