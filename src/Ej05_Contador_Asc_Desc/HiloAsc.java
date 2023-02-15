package Ej05_Contador_Asc_Desc;

public class HiloAsc extends Thread {
    private Contador contador;

    HiloAsc(String n, Contador c) {
        setName(n);
        contador = c;
    }

    public void run() {
        for (int i = 0; i < 200; i++) {
            contador.incrementa();
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(getName() + " contador: " + contador.getValor());
    }
}
