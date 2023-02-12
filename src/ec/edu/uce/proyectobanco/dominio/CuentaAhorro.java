package ec.edu.uce.proyectobanco.dominio;

/**
 *
 * @author Edu. N
 */
public class CuentaAhorro extends Cuenta {

    public static final double TASA_INTERES = 1.8;
    private double montoInteres = 10;

    /**
     * Constructor
     *
     * @param saldo
     */
    public CuentaAhorro(double saldo) {
        super(saldo);
//        this.montoInteres = 0.0;
    }

    /**
     * Constructor
     *
     * @param saldo
     * @param montoInteres
     */
    public CuentaAhorro(double saldo, double montoInteres) {
        super(saldo);
        this.montoInteres = montoInteres;
    }

    public double getMontoInteres() {
        return montoInteres;
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
    public boolean retiro(double monto) throws SobregiroException {
        boolean resp = false;
        if (monto <= saldo) {
            saldo = saldo - monto;
            resp = true;
        } else {

//            System.out.println("No se pudo retirar...");
            throw new SobregiroException("Fondos Insuficientes", monto - saldo);
        }
        return resp;

    }

    @Override
    public boolean equals(Object o) {
        boolean resultado = false;
        if (o instanceof CuentaAhorro) {
            CuentaAhorro e = (CuentaAhorro) o;
            if (o.equals(e.saldo)) {
                resultado = true;
            }
        }
        return resultado;

    }

//@Override
//    public boolean equals(Object o) {
//        if (o instanceof CuentaAhorro) {
//            CuentaAhorro ca = (CuentaAhorro) o;
//            return this.getSaldo() == ca.getSaldo();
//        }
//        return false;
//    }
    @Override
    public String toString() {
        double interes = (super.getSaldo() * montoInteres) / 100;
        double total = super.getSaldo() + interes;
        return "\nSaldo: " + super.getSaldo()
                + "\nInteres: " + interes
                + "\nSaldo con Intereses: " + total + "\n";
    }

}
