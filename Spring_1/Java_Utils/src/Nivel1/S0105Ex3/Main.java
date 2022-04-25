/* Ejecute el ejercicio anterior guardando en un archivo txt el resultado.*/
package Nivel1.S0105Ex3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {
    static FileWriter fileWriter;

    public static void main(String[] args) throws IOException {
        fileWriter = new FileWriter(new File("C:\\Users\\formacio\\IdeaProjects\\JavaUtils\\src\\Nivel1\\S0105Ex3\\fichero.txt")); //creamos el archivo de texto

        listaSubDirectorio(new File("C:\\Users\\formacio\\IdeaProjects"));//agregamos el contenido

        fileWriter.close();//escritura cerrada

    }
    public static void fichero(String st){
        try {
            fileWriter.append(st + "\n");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void listaSubDirectorio(File directorio){
        fichero("(D)" + directorio + " " + new Date(directorio.lastModified()));
        //System.out.println("(D)" + directorio + " " + new Date(directorio.lastModified()));

        File [] subDirectorio = directorio.listFiles();

        if (subDirectorio!= null) {
            for (File file: subDirectorio) {
                if (file.isDirectory())listaSubDirectorio(file);//si es un directorio aplicamos recursiva (un método se llama a sí mismo).
                else {
                    fichero("(F)" + file + " " +  new  Date(file.lastModified()));
                    //System.out.println("(F)" + file + " " +  new  Date(file.lastModified()));


                }
            }

        }
    }

}
