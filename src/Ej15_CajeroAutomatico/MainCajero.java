package Ej15_CajeroAutomatico;

public class MainCajero {
    public static void main(String[] args) {
        int total;
        Cajero compartido = new Cajero("Cajero Alameda");

        Terminal t1 = new Terminal("terminal1", compartido);
        Terminal t2 = new Terminal("terminal2", compartido);
        Terminal t3 = new Terminal("terminal3", compartido);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            System.out.println("Interrupción");
        }

        total = compartido.mostrarLocalidades();

        System.out.println("En total se vendieron " + total + " localidades.");
    }
}