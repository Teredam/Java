package Nivel1.S0105Ex5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDeserializacion {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        ObjectInputStream objetoEntrada = null;
        Alumno alumno;

        try {
            fileInputStream = new FileInputStream("C:\\Users\\formacio\\IdeaProjects\\JavaUtils\\src\\Nivel1\\S0105Ex5\\alumno.dat");
            objetoEntrada = new ObjectInputStream(fileInputStream);

            alumno = (Alumno) objetoEntrada.readObject();
            System.out.println(alumno.getId() + " " + alumno.getNombre() + " " + alumno.getEdad() + " "
                    + alumno.getFechaMatricula().getDia() + "-" + alumno.getFechaMatricula().getMes() + "-"
                    + alumno.getFechaMatricula().getAnio());

            alumno = (Alumno) objetoEntrada.readObject();
            System.out.println(alumno.getId() + " " + alumno.getNombre() + " " + alumno.getEdad() + " "
                    + alumno.getFechaMatricula().getDia() + "-" + alumno.getFechaMatricula().getMes() + "-"
                    + alumno.getFechaMatricula().getAnio());
            alumno = (Alumno) objetoEntrada.readObject();
            System.out.println(alumno.getId() + " " + alumno.getNombre() + " " + alumno.getEdad() + " "
                    + alumno.getFechaMatricula().getDia() + "-" + alumno.getFechaMatricula().getMes() + "-"
                    + alumno.getFechaMatricula().getAnio());
        } catch (FileNotFoundException e) {
            System.out.println("Error: fichero no encontrado");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: no se puede acceder al fichero");
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (objetoEntrada != null) {
                    objetoEntrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
