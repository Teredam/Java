package Test.Java.Nivel1.S0104Ex2;

import Main.Java.Nivel1.S0104Ex2.CalculoDNI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDNITest {
    @Test
    void testLetra(){
        CalculoDNI calculoDNI = new CalculoDNI();
        assertEquals(calculoDNI.obtenerLetra(12345678), "Z");
    }

}