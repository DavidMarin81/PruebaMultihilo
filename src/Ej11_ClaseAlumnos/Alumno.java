package Ej11_ClaseAlumnos;

public class Alumno extends Thread {
    private Alumno alumno;

    public Alumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
