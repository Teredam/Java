package Test.Java.Nivel2.S0104Ex1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFeatureMatcher {

    @Test
    void testHamcrest(){
            assertThat("foo", is("foo"));
            assertThat("foo", equalTo("foo"));
            assertThat("foo", is (equalTo("foo")));
            assertEquals("foo", is("foo"));
    }

    @Test
    public void tamanio() {
        assertThat("Mordor", length(is(6)));
        //assertThat("Mordor", length(is(10)));
    }

    public static Matcher<String> length(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher, "a String of length that", "length") {

            @Override
            protected Integer featureValueOf(String actual) {
                return actual.length();
            }
        };
    }

}
