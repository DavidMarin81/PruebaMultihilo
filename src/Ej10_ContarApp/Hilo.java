package Ej10_ContarApp;

public class Hilo extends Thread {
    private int maxContar;

    Hilo(int numero) {
        maxContar = numero;
    }

    @Override
    public void run() {
        for (int i = 1; i<=maxContar; i++) {
            System.out.println("Repetición " + i);
            System.out.println("Nombre del hilo: " + getName());
            try {
                sleep(2000);
            } catch (InterruptedException e){}
        }
    }
}

