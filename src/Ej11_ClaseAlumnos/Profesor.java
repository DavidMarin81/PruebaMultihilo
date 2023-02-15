package Ej11_ClaseAlumnos;

public class Profesor extends Thread {
    Bienvenida saludo;
    String nombre;

    public Profesor (Bienvenida bienvenida, String nombre) {
        this.saludo = bienvenida;
        this.nombre = nombre;
    }

    public void run() {
        System.out.println("Profesor " + nombre + " llegó");
        try {
            Thread.sleep(1000);
            saludo.llegadaProfesor(nombre);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
