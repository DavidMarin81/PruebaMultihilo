package Ej13_Cola2;

public class Productor extends Thread {
    private Cola cola;
    private int numero;

    public Productor(Cola cola, int numero){
        this.cola = cola;
        this.numero = numero;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            cola.generarNumero(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
