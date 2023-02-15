package Ej10_ContarApp;

public class Main {
    public static void main(String[] args) {
        Hilo hilo1 = new Hilo(5);
        hilo1.start();
        try {
            hilo1.sleep(3000);
        } catch (InterruptedException e){

        }

        Hilo hilo2 = new Hilo(4);
        hilo2.start();
        while (hilo1.isAlive() && hilo2.isAlive()) {
            try {
                hilo1.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println("Sigo contando...");
        }
    }
}

