package Ej04_IDs;

public class Man04 {
    public static void main(String[] args) {
        Ids id1 = new Ids("Hilo 1");
        Ids id2 = new Ids("Hilo 2");
        Ids id3 = new Ids("Hilo 3");
        Ids id4 = new Ids("Hilo 4");
        Ids id5 = new Ids("Hilo 5");

        Thread t1 = new Thread(id1);
        Thread t2 = new Thread(id2);
        Thread t3 = new Thread(id3);
        Thread t4 = new Thread(id4);
        Thread t5 = new Thread(id5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }



}
