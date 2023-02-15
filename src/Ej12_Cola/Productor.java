package Ej12_Cola;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Productor extends Thread {
    private Cola cola;
    private String nombreFichero = "fichero.txt";

    public Productor(Cola cola, String nombreFichero) {
        this.cola = cola;
        this.nombreFichero = nombreFichero;
    }

    public void run() {
        File fichero = new File(nombreFichero);
        if (fichero.exists()) {
            try {
                FileReader fr = new FileReader(fichero);
                int i;
                while ((i = fr.read()) != -1) {
                    cola.generarNumero(i);
                    try{
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println("Se ha producido una excepcion");
                    }
                }

            } catch (FileNotFoundException ex) {
                System.out.println("No se ha encontrado el archivo");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
