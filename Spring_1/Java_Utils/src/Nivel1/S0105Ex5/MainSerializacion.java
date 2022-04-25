/* Ahora el programa debe serializar un Objeto Java a un archivo .ser y después debe desserializarlo. */
package Nivel1.S0105Ex5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainSerializacion {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objetoSalida = null;
        Alumno alumno;
        Fecha fecha;

        try {
            fileOutputStream = new FileOutputStream("C:/Users/formacio/IdeaProjects/JavaUtils/src/Nivel1/S0105Ex5/alumno.dat");
            objetoSalida = new ObjectOutputStream(fileOutputStream);
            fecha = new Fecha(5,9,2011);
            alumno = new Alumno("Sandra Rojas",12345678, 20, fecha);
            objetoSalida.writeObject(alumno);
            fecha = new Fecha(7,9,2011);
            alumno = new Alumno("Belinda Perez",98765432, 19, fecha);
            objetoSalida.writeObject(alumno);
            fecha = new Fecha(8,9,2011);
            alumno = new Alumno("Maria Gonzalez",78234212, 21, fecha);
            objetoSalida.writeObject(alumno);

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(fileOutputStream != null) fileOutputStream.close();
                if(objetoSalida != null) objetoSalida.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
