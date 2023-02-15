package Ej12_Cola;

public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();

        Productor productor = new Productor(cola, "fichero.txt");
        Consumidor consumidor = new Consumidor(cola, 1);
        productor.start();
        consumidor.start();

    }
}
