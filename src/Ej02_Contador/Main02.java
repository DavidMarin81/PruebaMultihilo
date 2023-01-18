package Ej02_Contador;

public class Main02 {
    public static void main(String[] args) {

        Contador c1 = new Contador("Contador 1", 40);
        Contador c2 = new Contador("Contador 2", 50);
        Contador c3 = new Contador("Contador 3", 20);
        Contador c4 = new Contador("Contador 4", 70);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Con join se queda esperando hasta que se acaben todos los hilos
        // En caso de no ponerlo se podría imprimir "Fin del programa" al principio
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException ex) {
            System.out.println("Se ha producido un error " + ex);
        }

        System.out.println("Fin del programa");

    }
}
