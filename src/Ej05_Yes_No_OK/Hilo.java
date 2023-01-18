package Ej05_Yes_No_OK;

public class Hilo implements Runnable{

    private String palabra;

    public Hilo(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(palabra);
        }
    }
}
