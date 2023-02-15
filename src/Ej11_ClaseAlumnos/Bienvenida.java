package Ej11_ClaseAlumnos;

public class Bienvenida {

    private boolean profesor = false;

    public Bienvenida() {

    }

    public boolean isProfesor() {
        return profesor;
    }

    public void setProfesor(boolean profesor) {
        this.profesor = profesor;
    }

    public synchronized void llegadaProfesor() {
        profesor = true;
        String saludo = "Hola alumnos";
        notifyAll();
    }

    public synchronized void llegadaAlumno() {
        String saludo = "";
        try {
            if (!isProfesor()){
                wait();
                saludo = "Hola profesor";
            }else {
                saludo = "Hola profesor";
            }
        } catch (InterruptedException ex) {

        }
    }
}
