package Ej05_NumerosAscendentes;

public class Main {
    public static void main(String[] args) {
        Hilo h1 = new Hilo(1, 10, "Hilo1");
        Hilo h2 = new Hilo(20, 30, "Hilo2");

        System.out.println("INICIO");

        h1.start();
        h2.start();

        try {
            h1.join();
            h2.join();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

        System.out.println("FIN");
    }
}