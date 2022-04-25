/* Crea una clase llamada Persona con los atributos nombre, apellido y edad. Luego crea una clase llamada GenericMethods
 con un método genérico que acepte tres argumentos de tipo genérico. Este método sólo debe imprimir por pantalla los
 argumentos que ha recibido. En el main() de la clase principal, llama al método genérico con diferentes tipos de
 parámetros. Ejemplo: un objeto de la clase Persona, un String y un tipo primitivo. De esta forma has comprobado que se
 le puede pasar cualquier tipo de parámetro y en cualquier orden. */
package Nivel1.S0106Ex2;

public class Main {
    public static void main(String[] args) {

        GenericMethods genericMethods = new GenericMethods();

        genericMethods.metodoGenerico(new Persona("Iris", "Rojas", 33), "String", 125f);
        System.out.println("");

        genericMethods.metodoGenerico("String",new Persona("Iris", "Rojas", 33), 2);
        System.out.println("");

        genericMethods.metodoGenerico(155.54, 1, "Calculo");
    }
}
