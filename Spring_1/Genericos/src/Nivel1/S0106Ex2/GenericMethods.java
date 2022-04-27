/* Luego crea una clase llamada GenericMethods con un método genérico que acepte tres argumentos de tipo genérico.
Este método sólo debe imprimir por pantalla los argumentos que ha recibido. */
package Nivel1.S0106Ex2;

public class GenericMethods <T> {
    public void metodoGenerico(T argumento1, T argumento2, T argumento3){
        System.out.println("Método Genérico:");
        System.out.println("Argumento 1: " + argumento1);
        System.out.println("Argumento 2: " + argumento2);
        System.out.println("Argumento 3: " + argumento3);
    }

}
