package fizzbuzz;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void fizzBuzzTest() {
        assertEquals("1", fizzBuzz.doFizzBuzz(1));
        assertEquals("2", fizzBuzz.doFizzBuzz(2));
        assertEquals("Fizz", fizzBuzz.doFizzBuzz(3));
    }

}