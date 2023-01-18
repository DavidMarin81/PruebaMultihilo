package Ej06_ComprobarSaldo;

public class RetiradaDeCajero extends Thread{

    private Cuenta cuenta;
    private float cantidad;
    public RetiradaDeCajero(Cuenta cuenta, float cantidad) {
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            cuenta.restarSaldo(cantidad);
            System.out.println("La cuenta " + cuenta.nombre + " tiene " + cuenta.devolverSaldo() + " euros");
        }
    }
}
