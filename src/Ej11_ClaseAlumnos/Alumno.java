package Ej11_ClaseAlumnos;

public class Alumno extends Thread {
    Bienvenida saludo;
    int numAlumno;

    public Alumno (Bienvenida bienvenida, int numAlumno) {
        this.saludo = bienvenida;
        this.numAlumno = numAlumno;
    }

    public void run() {
        System.out.println("Alumno " + numAlumno + " llegó");
        try {
            Thread.sleep(1000);
            saludo.saludarProfesor(numAlumno);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
