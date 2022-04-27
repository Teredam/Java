/* Crea una clase llamada NoGenericMethods que almacene tres objetos del mismo tipo, junto con los métodos para
almacenar y extraer estos objetos y un constructor para inicializar los tres. Comprueba que los argumentos pueden
ponerse en cualquier posición en la llamada al constructor. */
package Nivel1.S0106Ex1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods noGenericMethods = new NoGenericMethods(new Animal("Mamífero", "Vertebrados"),
                new Animal("Reptiles", "Vertebrados"), new Animal("Moluscos", "Invertevrados"));

        System.out.println(noGenericMethods);
        System.out.println(noGenericMethods.getAnimal2());
    }
}
