package Ej01_Numeros_Letras;

public class Main01 {
    public static void main(String[] args) {

        HiloNumerosLetras h1 = new HiloNumerosLetras(1);
        HiloNumerosLetras h2 = new HiloNumerosLetras(2);

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();

    }
}
