package Ej05_ContadorHilos;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Hilo hilo1 = new Hilo("SI");
        Hilo hilo2 = new Hilo("NO");

        ThreadGroup grupo = new ThreadGroup("Grupo PSP");

        Thread h1 = new Thread(grupo, hilo1, "hilo1");
        Thread h2 = new Thread(grupo, hilo2, "hilo2");

        h1.start();
        h2.start();

        System.out.println("Existen " + grupo.activeCount() + " hilos activos");
        try {
            h1.join();
            h2.join();

            System.out.println("Existen " + grupo.activeCount() + " hilos activos");
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}