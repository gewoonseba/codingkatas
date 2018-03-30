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
        assertEquals("Fizz", fizzBuzz.doFizzBuzz(6));
        assertEquals("Fizz", fizzBuzz.doFizzBuzz(13));

    }

    @Test
    public void fizzBuzzTest_Buzz(){
        assertEquals("Buzz", fizzBuzz.doFizzBuzz(5));
        assertEquals("Buzz", fizzBuzz.doFizzBuzz(10));
        assertEquals("Buzz", fizzBuzz.doFizzBuzz(52));

    }

    @Test
    public void fizzBuzzTest_FizzBuzz(){
        assertEquals("FizzBuzz", fizzBuzz.doFizzBuzz(15));
        assertEquals("FizzBuzz", fizzBuzz.doFizzBuzz(30));
        assertEquals("FizzBuzz", fizzBuzz.doFizzBuzz(51));

    }

}