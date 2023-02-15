package Ej13_Cola2;

public class Consumidor extends Thread {
    private Cola cola;

    public Consumidor(Cola cola) {
        this.cola = cola;
    }

    public void run() {
        for (int i = 1; i <= 10; i++){
            cola.insertarNumero();
        }
    }
}
