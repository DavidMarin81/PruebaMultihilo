package Ej04_IDs;

public class Ids implements Runnable{

    String cadena;

    public Ids(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public void run() {
        try {
            //Sleep = hilo actual + su getId * 10
            Thread.sleep(Thread.currentThread().getId() * 10);
        } catch (InterruptedException e) {

        }

        System.out.println("Hola Mundo " + cadena + " " + Thread.currentThread().getId());
    }
}
