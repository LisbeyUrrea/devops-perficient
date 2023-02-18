package org.example;



import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.hasToString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();
    @Test
    void adding1Plus3() {
        int result = calculator.add(1,3);
        assertEquals(4, result);
    }

    @Test
    void subtract3Minus2() {
        int result = calculator.subtract(3,2);
        assertEquals(1, result);
        /**hamcrest test examples -> tutorial: https://hamcrest.org/JavaHamcrest/tutorial */
        assertThat(result, is(1));
        assertThat(result, is(equalTo(1))); //-> test object equality using Object.equals
//        assertThat(calculator, hasToString(equalTo("true"))); // -> Validate that the toString method is equal to comparator value.
        assertThat(calculator, hasToString(containsString("true"))); // -> Validate that the toString method has the comparator value.
    }

    @Test
    void multiply3By3() {
        int result = calculator.multiplication(3,3);
        assertEquals(9, result);
    }

    @Test
    void divide15By5() {
        int result = calculator.division(15,5);
        assertEquals(3, result);
    }

    @Test
    void divide15By0() {
        IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> calculator.division(15, 0));
        assertEquals("We can divide by 0", result.getMessage());
    }
}