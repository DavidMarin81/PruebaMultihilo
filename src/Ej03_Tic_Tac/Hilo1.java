package Ej03_Tic_Tac;

public class Hilo1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.print(" TIC ");
            try {
                sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
