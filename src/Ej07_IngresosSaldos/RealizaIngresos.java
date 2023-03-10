package Ej07_IngresosSaldos;

import Ej07_IngresosSaldos.Saldo;

public class RealizaIngresos extends Thread{

    private Saldo saldo;
    private float cantidad;

    public RealizaIngresos(Saldo saldo, float cantidad) {
        this.saldo = saldo;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            saldo.realizarIngreso(cantidad);
        }
    }
}
