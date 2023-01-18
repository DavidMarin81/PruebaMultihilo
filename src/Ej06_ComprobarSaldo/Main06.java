package Ej06_ComprobarSaldo;

public class Main06 {
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta("Cuenta 1", 1000);
        Cuenta c2 = new Cuenta("Cuenta 2", 2000);
        Cuenta c3 = new Cuenta("Cuenta 3", 3000);

        RetiradaDeCajero retirada01 = new RetiradaDeCajero(c1, 20);
        RetiradaDeCajero retirada02 = new RetiradaDeCajero(c2, 4000);
        RetiradaDeCajero retirada03 = new RetiradaDeCajero(c3, 501);

        Thread t1 = new Thread(retirada01);
        Thread t2 = new Thread(retirada02);
        Thread t3 = new Thread(retirada03);

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

        System.out.println("==================================================");
        System.out.println("La cuenta " + c1.nombre + " termina con " + c1.devolverSaldo() + " euros");
        System.out.println("La cuenta " + c2.nombre + " termina con " + c2.devolverSaldo() + " euros");
        System.out.println("La cuenta " + c3.nombre + " termina con " + c3.devolverSaldo() + " euros");

    }
}
