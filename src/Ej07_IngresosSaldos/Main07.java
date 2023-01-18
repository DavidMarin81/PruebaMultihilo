package Ej07_IngresosSaldo;

public class Main07 {
    public static void main(String[] args) {
        Saldo saldo = new Saldo(500);

        RealizaIngresos r1 = new RealizaIngresos(saldo, 2);
        RealizaIngresos r2 = new RealizaIngresos(saldo, 30);
        RealizaIngresos r3 = new RealizaIngresos(saldo, 400);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("El saldo final es " + saldo.obtenerSaldo());

    }
}
