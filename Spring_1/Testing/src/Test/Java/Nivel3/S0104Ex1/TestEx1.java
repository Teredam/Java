package Test.Java.Nivel3.S0104Ex1;

//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
//import static org.hamcrest.MatcherAssert.assertThat;

public class TestEx1 {
    @Test
    void igualYNoIgual(){
        assertThat(120).isNotEqualTo(121);
        assertThat(120).isEqualTo(120);
    }
}
