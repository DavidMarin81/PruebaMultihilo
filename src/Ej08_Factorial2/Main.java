package Ej08_Factorial2;

public class Main {
    public static void main(String[] args) {
        Factorial2[] hilosFact = new Factorial2[10];
        int x = 0;

        for (int i = 5; i <= 14; i++) {
            hilosFact[x] = new Factorial2(i);
            hilosFact[x].start();
            x++;
        }
        System.out.println("Fin");
    }
}

