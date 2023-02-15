package Ej05_NumerosAscendentes;

public class Hilo extends Thread {
    private int inicio, fin;
    private String nombre;

    public Hilo(int inicio, int fin, String nombre) {
        super(nombre);
        this.inicio = inicio;
        this.fin = fin;
        this.nombre = nombre;
    }

    public void run() {
        for (int i = inicio; i <= fin ; i++) {
            System.out.println(nombre + " dice: " + i + ".");
        }
        System.out.println(nombre + " acaba");
    }
}