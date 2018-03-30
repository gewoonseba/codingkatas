package fizzbuzz;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void fizzBuzzTest_Number() {
        assertEquals("1", fizzBuzz.doFizzBuzz(1));
        assertEquals("2", fizzBuzz.doFizzBuzz(2));
    }

    @Test
    public void fizzBuzzTest_Fizz(){
        assertEquals("Fizz", fizzBuzz.doFizzBuzz(3));
    }

    @Test
    public void fizzBuzzTest_Buzz(){
        assertEquals("Buzz", fizzBuzz.doFizzBuzz(5));
    }

    @Test
    public void fizzBuzzTest_FizzBuzz(){
        assertEquals("FizzBuzz", fizzBuzz.doFizzBuzz(15));

    }

}