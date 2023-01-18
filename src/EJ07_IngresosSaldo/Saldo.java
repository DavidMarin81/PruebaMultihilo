package EJ07_IngresosSaldo;

import static java.lang.Thread.sleep;

public class Saldo {

    private float saldo;

    public Saldo(float saldo) {
        this.saldo = saldo;
    }

    public float obtenerSaldo() {
        try {
            sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return saldo;
    }

    synchronized public void modificarSaldo(float cantidad){
        saldo += cantidad;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void realizarIngreso(float cantidad) {
        modificarSaldo(cantidad);
        System.out.println("SALDO TOTAL: " + saldo + " euros");
    }
}
