/* Modifica el ejercicio anterior de forma que uno de los argumentos del método genérico no sea genérico. */
package Nivel2.S0106Ex1;

public class MetodoGenerico <T>{
    public void unoNoGenerico(T objeto1, String objeto2, T objeto3){
        System.out.println("Orden: Método Genérico, Método No Genérico (tipo String) y Método Genérico:");
        System.out.println("Objeto 1: " + objeto1);
        System.out.println("Objeto 2: " + objeto2);
        System.out.println("Objeto 3: " + objeto3);
    }
}
