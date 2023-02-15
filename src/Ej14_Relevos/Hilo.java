package Ej14_Relevos;

import static java.lang.Thread.sleep;

public class Hilo implements Runnable {
    private String palabra;
    private int contador = 0;

    private boolean llegada = false;

    public Hilo(String palabra) {
        this.palabra = palabra;
        contador++;

    }

    @Override
    public synchronized void run() {

        System.out.println("Soy el " + palabra);
    }

    public synchronized void llegadaTestigo() {
        String corredor = "Corredor " + contador;
        while (!palabra.equals(corredor)) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        llegada = true;
        String saludo = "Hola alumnos";
        notifyAll();
    }

}

