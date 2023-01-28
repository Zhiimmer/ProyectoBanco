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
     * @param montoInteres
     */
    public CuentaAhorro(double saldo, double montoInteres) {
        super(saldo);
        this.montoInteres = montoInteres;
    }

    /**
     * Constructor
     *
     * @param saldo
     */
    public CuentaAhorro(double saldo) {
        super(saldo);
        this.montoInteres = 0.0;
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
        if (monto <= saldo) {
            saldo = saldo - monto;
            resp = true;
        } else {
            System.out.println("No se pudo retirar");
        }
        return resp;

    }
}
