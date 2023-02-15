package Ej08_Factorial;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Factorial f1 = new Factorial(5);
        Factorial f2 = new Factorial(6);

        f1.start();
        f2.start();

        f1.join();
        f2.join();

        f1.mostrarFactorial();
        f2.mostrarFactorial();
    }
}
