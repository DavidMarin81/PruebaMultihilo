package Ej05_Contador_Asc_Desc;

public class Main {
    public static void main(String[] args) {
        Contador cont = new Contador(500);
        HiloAsc inc = new HiloAsc("Incremental", cont);
        HiloDesc dec = new HiloDesc("Decremental", cont);
        inc.start();
        dec.start();

        try {
            inc.join();
            dec.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(cont.getValor());
    }
}

