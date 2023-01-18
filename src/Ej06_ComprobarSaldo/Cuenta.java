package Ej06_ComprobarSaldo;

public class Cuenta {

    String nombre;
    private float saldo;

    public Cuenta(String nombre, int saldo) {
        this.saldo = saldo;
        this.nombre = nombre;
    }


    public float devolverSaldo() {
        return saldo;
    }

    public void restarSaldo(float cantidad) {
        if (comprobarSaldo(cantidad)){
            saldo -= cantidad;
        }

    }

    public boolean comprobarSaldo(float cantidad){
        boolean positivo = true;
        if (cantidad > saldo) {
            positivo = false;
            System.out.println("La cuenta " + nombre + " no tiene saldo suficiente");
        }
        return positivo;
    }
}
