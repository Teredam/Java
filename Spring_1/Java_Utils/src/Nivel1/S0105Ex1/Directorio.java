package Nivel1.S0105Ex1;

import java.io.File;

public class Directorio{
    public static void main(String[] args) {
        File directorio = new File("c:/");//creamos el objeto

        String[] listado = directorio.list();//método list() obtenemos los nommbres de todos sus hijos

        //Arrays.sort(listado); //método sort() para ordenar

        if (listado == null || listado.length == 0) { //Condicional: Si no devuelve nada o la lingitud es 0 muestra mensaje
            System.out.println("No hay elementos dentro del directorio actual");
            return;
        }
        else { // otra parte del condicional
            for (int i=0; i< listado.length; i++) { //recorremos en un bucle todos los nombres de elementos hijo
                System.out.println(listado[i]); //Mostramos sus nombres en la consola, cada uno en una línea
            }
        }
    }
}
