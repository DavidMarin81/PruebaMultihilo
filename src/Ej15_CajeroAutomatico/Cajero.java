package Ej15_CajeroAutomatico;

public class Cajero {int localidades = 0;
    String nombre;

    public Cajero(String n) {
        nombre = n;
    }

    public synchronized void sumarLocalidades() {
        localidades++;
    }

    public int mostrarLocalidades() {
        return localidades;
    }
}
