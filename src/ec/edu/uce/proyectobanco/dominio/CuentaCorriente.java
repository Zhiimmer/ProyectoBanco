package ec.edu.uce.proyectobanco.dominio;

/**
 *
 * @author Edu. N
 */
public class CuentaCorriente extends Cuenta {

//    private double montoInteres;
    private double sobregiro = 10;

    //Constructores
    public CuentaCorriente(double saldo, double sobregiro) {
        super(saldo);
        this.sobregiro = sobregiro;
    }
    
    public CuentaCorriente(double saldo) {
        super(saldo);
//        this.sobregiro = 0.0;
    }

    //Metodos
    @Override
    public boolean deposito(double monto) {
        boolean resp = false;
        if (monto > 1) {
            saldo = saldo + monto;
            resp = true;
        } else {
            System.out.println("No se pudo depositar...");
        }
        return resp;
        
    }
    
    @Override
//    public boolean retiro(double monto) {
//        boolean resp = false;
//        if (monto <= (super.getSaldo() + sobregiro)) {
//            if (monto > super.getSaldo()) {
//                super.saldo = (super.getSaldo()-monto);
//                sobregiro = sobregiro + saldo;
//                return true;
//            } else{
//                super.saldo = super.getSaldo()-monto;
//            }
//            
//        } else {
//            System.out.println("\nNo se pudo retirar");
//        }
//        return resp;
//
//    }
    public boolean retiro(double monto) throws SobregiroException {
        
        boolean resp = false;
        if (saldo < monto) {
            double sobregiroRequerido = monto - saldo;
            if (sobregiro < sobregiroRequerido) {
                throw new SobregiroException("Fondos Insuficientes, no cubiertos por el sobregiro", sobregiroRequerido);
            } else{
                saldo = 0;
                sobregiro -= sobregiroRequerido;
                resp = true;
            }
            saldo = saldo - monto;
            resp = true;
            
        } else {
            saldo-=monto;
            resp = true;
        }
        /*Verificamos que el monto a retirar sea menor o igual
        al saldo disponible más el limite del sobregiro
         */
//        if (monto <= (super.getSaldo() + sobregiro)) {
//            /*
//            Se verifica si el monto a retirar es mayor al saldo disponible. Si es asi entonces
//            se actualizar el sobregiro restando la diferencia entre el monto a retirar y el saldo
//            disponible y se actualiza el saldo a cero.
//             */
//            if (monto > super.getSaldo()) {
//                sobregiro = sobregiro - (monto - super.getSaldo());
//                super.saldo = 0;
//            } else {
//                /*
//                Caso contrario se actualiza el saldo restando el monto a retirar.
//                 */
//                super.saldo = super.getSaldo() - monto;
//            }
//            resp = true;
//        } else {
////            System.out.println("No se puede realizar el retiro, excede el limite de sobregiro :/");
//            throw new SobregiroException("Fondos insuficientes sin proteccion de sobregiro", monto - saldo);
//        }
        return resp;
        
    }
    
    @Override
    public boolean equals(Object o) {
        boolean resultado = false;
        if (o instanceof CuentaCorriente) {
            CuentaCorriente e = (CuentaCorriente) o;
            if (o.equals(e.saldo)) {
                resultado = true;
            }
        }
        return resultado;
        
    }
    
    @Override
    public String toString() {
        double total = (super.getSaldo() + sobregiro);
        return """
               \nCuentaCorriente\n
               Saldo: """ + super.getSaldo() + "\nSobregiro = " + sobregiro
                + "\nTotal: " + total;
    }
    
}
