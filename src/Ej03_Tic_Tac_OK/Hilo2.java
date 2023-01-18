package Ej03_Tic_Tac_OK;

public class Hilo2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.print(" TAC ");
            try {
                sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
