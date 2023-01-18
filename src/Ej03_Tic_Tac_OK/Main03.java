package Ej03_Tic_Tac_OK;

public class Main03 {
    public static void main(String[] args) {

        Hilo1 h1 = new Hilo1();
        Hilo2 h2 = new Hilo2();

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();

    }
}
