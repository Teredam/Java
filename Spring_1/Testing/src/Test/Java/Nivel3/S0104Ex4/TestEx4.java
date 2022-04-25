/* Crea un arrayList contenedor de varios tipos de objetos (créelos también). Escribe una aserción para verificar el
orden de los objetos en ArrayList según han sido insertados. Verifica ahora que la lista anterior contiene los objetos
en cualquier orden. Verifica que en la lista anterior uno de los objetos se ha añadido sólo una vez. Deja uno de los
elementos sin añadir, y verifica que la lista no contiene este último. */
package Test.Java.Nivel3.S0104Ex4;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestEx4 {
    @Test
    void test(){
        ArrayList<Integer> contenedor = new ArrayList<Integer>();
        contenedor.add(50);
        contenedor.add(51);
        contenedor.add(52);


    }
}
