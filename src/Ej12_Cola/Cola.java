package Ej12_Cola;

public class Cola {

    private int numero;
    private boolean numGenerado = false;

    public synchronized void generarNumero(int valor){
        if (numGenerado) {
            try{
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Se ha producido una interrupción");
            }
        }
        numero = valor;
        numGenerado = true;
        notify();
        System.out.println("Se ha generado el numero: " + numero);
    }

    public synchronized int insertarNumero(){
        if (!numGenerado){
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Se ha producido una interrupción");
            }
        }
        numGenerado = false;
        notify();
        System.out.println("Se ha introducido el numero: " + numero);
        return numero;
    }

}
