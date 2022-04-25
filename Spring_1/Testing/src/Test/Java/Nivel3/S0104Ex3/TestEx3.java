package Test.Java.Nivel3.S0104Ex3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestEx3 {
    int contar [] = {30, 29 , 28, 27};
    int contar1 [] = {30, 29 , 28, 27};

    @Test
    void test() {
        assertThat(contar).isEqualTo(contar1);
    }
}
