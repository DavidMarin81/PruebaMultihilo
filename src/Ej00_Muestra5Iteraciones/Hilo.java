package Ej00_Muestra5Iteraciones;

public class Hilo extends Thread{
    // constructor
    public  Hilo(String nombre) {
        super(nombre);
        System.out.println("CREANDO HILO:" + getName());
    }

    // metodo run
    public void run() {
        for (int i=0; i<5; i++)
            System.out.println("Hilo:" + getName() + " C = " + i);
    }
}