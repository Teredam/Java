/* Añada a la clase del nivel anterior la funcionalidad de listar un árbol de directorios con el contenido de todos sus
niveles (recursivamente) de modo que se impriman en pantalla en orden alfabético dentro de cada nivel, indicando además
si es un directorio (D) o un archivo (F), y su última fecha de modificación.*/
package Nivel1.S0105Ex2;

import java.io.File;
import java.util.Date;

public class ClassJavaEx2 {
    public static void main(String[] args) {
            listaSubDirectorio(new File("C:\\Users\\formacio\\IdeaProjects"));

    }
    public static void listaSubDirectorio (File directorio){
        System.out.println("(D)" + directorio + " " + new Date(directorio.lastModified()));

        File[] subDirectorio = directorio.listFiles();

        if (subDirectorio != null) {
            for (File file : subDirectorio) {
                if (file.isDirectory())
                    listaSubDirectorio(file);//si es un directorio aplicamos recursiva (un método se llama a sí mismo).
                else {
                    System.out.println("(F)" + file + " " + new Date(file.lastModified()));
                }

            }
        }
    }
}
