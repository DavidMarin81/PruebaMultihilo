package Ej11_ClaseAlumnos;

public class Bienvenida {
    boolean clase_comenzada;

    public Bienvenida() {
        this.clase_comenzada = false;
    }

    public synchronized void saludarProfesor(int num) {
        try {
            if (!clase_comenzada) {
                wait();
            }
            System.out.println("Alumno " + num + ": Buenos días profesor");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void llegadaProfesor(String nombre) {
        System.out.println("Buenos días a todos. Soy " + nombre);
        this.clase_comenzada = true;
        notifyAll();
    }
}