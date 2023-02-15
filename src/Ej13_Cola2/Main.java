package Ej13_Cola2;

public class Main {
    public static void main(String[] args) {

        Cola cola = new Cola();

        Productor p = new Productor(cola, "fichero.txt");
        Consumidor c = new Consumidor(cola, 1);
        Consumidor c2 = new Consumidor(cola, 2);
        Consumidor c3 = new Consumidor(cola, 3);

        p.start();
        c.start();
        c2.start();
        c3.start();

        try {
            p.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Estado Consumidor 1: "+c.getState());
        System.out.println("Estado Consumidor 2: "+c2.getState());
        System.out.println("Estado Consumidor 3: "+c3.getState());

        //cuando termina el productor hemos de finalizar los consumidores
        if(c.isAlive()) {cola.put(-1);c.interrupt();}
        if(c2.isAlive()) {cola.put(-1);c2.interrupt();}
        if(c3.isAlive()) {cola.put(-1);c3.interrupt();}
    }
}
