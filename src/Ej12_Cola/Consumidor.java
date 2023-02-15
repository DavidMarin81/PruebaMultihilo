package Ej12_Cola;

public class Consumidor extends Thread {
    private Cola cola;
    private int n;

    public Consumidor(Cola cola, int n) {
        this.cola = cola;
        this.n = n;
    }

    public void run() {
        int i = cola.insertarNumero();
        while (i != -1) {
            System.out.println(i);
        }
    }
}
