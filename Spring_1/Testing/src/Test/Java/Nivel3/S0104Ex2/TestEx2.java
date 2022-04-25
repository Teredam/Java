package Test.Java.Nivel3.S0104Ex2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class TestEx2 {
    @Test
    void test(){
        Object object = new Object();
        Object object1 = new Object();

        assertThat(object, is(object));
        //assertThat(object, equalTo(object));
        //assertThat(object, is(equalTo(object)));

        assertNotEquals(object, object1);
        //assertNotEquals(object, object, " Error: son iguales ");
        //assertNotSame(object, object1);
    }
}
