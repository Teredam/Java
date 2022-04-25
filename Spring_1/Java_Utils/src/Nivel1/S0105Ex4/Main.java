/* Añade la funcionalidad de leer cualquier archivo txt y mostrar su contenido por consola. */
package Nivel1.S0105Ex4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        LeerFichero visualizar = new LeerFichero();

        visualizar.leeArchivo();

    }

}
class LeerFichero{
    public void leeArchivo(){
        try (FileReader lectura = new FileReader("C:/Users/formacio/IdeaProjects/JavaUtils/src/Nivel1/S0105Ex3/fichero.txt")) {

            BufferedReader bufferedReader = new BufferedReader(lectura);

            String linea = "";

            while (linea != null){
                linea = bufferedReader.readLine();

                if (linea != null)
                    System.out.println(linea);

            }

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("No se encontro el archivo");
        }
    }
}
