package Test.Java.Nivel1.S0104Ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExceptionTest {
    @Test
    void testArrayException(){
        int contar [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int conteo = contar[10];
        });
    }

}