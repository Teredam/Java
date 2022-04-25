package Test.Java.Nivel1.S0104Ex1;

import Main.Java.Nivel1.S0104Ex1.Java;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaTest {
    @Test
    void validarTamanio(){
        Java listaMeses = new Java();
        assertEquals(listaMeses.getTamanio(), 12);
    }

    @Test
    void noNulo(){
        Java listaMeses = new Java();
        assertNotNull(listaMeses.getMesesDelAnio());
    }

    @Test
    void agostoPosicion(){
        Java listaMeses = new Java();
        assertEquals(listaMeses.getMes(7), "Agosto");
    }

}