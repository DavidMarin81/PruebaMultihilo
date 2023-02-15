package Ej05_ContadorHilos;

public class Hilo extends Thread {
    private String varSiNo;
    static int contador = 0;

    public Hilo (String cadena) {
        super();
        varSiNo = cadena;
    }

    public void run () {
        for (int i = 0; i <= 10; i++) {
            System.out.println(++contador+" : "+varSiNo+" ");
        }
    }
}
