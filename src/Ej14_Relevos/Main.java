package Ej14_Relevos;

public class Main {
    public static void main(String[] args) {

        Hilo h1 = new Hilo("Corredor 1");
        Hilo h2 = new Hilo("Corredor 2");
        Hilo h3 = new Hilo("Corredor 3");
        Hilo h4 = new Hilo("Corredor 4");

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
        Thread t3 = new Thread(h3);
        Thread t4 = new Thread(h4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
