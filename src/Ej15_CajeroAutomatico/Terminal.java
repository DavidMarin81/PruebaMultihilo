package Ej15_CajeroAutomatico;

public class Terminal extends Thread {
    String nombre;
    Cajero obj;
    int loc = 0;

    public Terminal(String nombre, Cajero c) {
        this.nombre = nombre;
        obj = c;
    }

    public void run() {
        for (int i = 0; i < 20000; i++) {
            obj.sumarLocalidades();
            loc++;
        }
        System.out.println("Terminal: " + this.nombre + " vendió " + loc);
    }

}