package Ej05_Yes_No_OK;

public class Main05 {
    public static void main(String[] args) {

        Hilo h1 = new Hilo("YES");
        Hilo h2 = new Hilo("NO");

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();

    }
}
