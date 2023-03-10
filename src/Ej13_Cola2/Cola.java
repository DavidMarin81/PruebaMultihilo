package Ej13_Cola2;

public class Cola {

    private int numero;
    private boolean disponible = false;//inicialmente cola vacia

    public synchronized int get() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        disponible = false;
        notify();
        return numero;
    }


    public synchronized void put(int valor) {
        while (disponible){
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        numero = valor;
        disponible = true;
        //System.out.println("Se graba: " + numero);
        notify();
    }
}
