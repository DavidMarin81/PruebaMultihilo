package Ej13_Cola2;

public class Consumidor extends Thread {
    private Cola comp;
    private int n;

    public Consumidor(Cola c, int n) {
        comp = c;
        this.n = n;
    }

    public void run() {
        char valor;
        int i  = comp.get();
        while(i!= -1 ) {
            System.out.printf("%c [%d] %n",(char) i,n);
            i = comp.get(); //recoge el valor
        }
        System.out.println("\nFin consumidor "+n);
    }
}
