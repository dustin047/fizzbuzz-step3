import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UT_FizzBuzz {


    FizzBuzz fizzBuzz = new FizzBuzz();
    int [] counts = {0, 0, 0, 0 ,0};

    @Test
    public void testForReturningLucky() {
        assertEquals(fizzBuzz.LUCKY, fizzBuzz.fizzBuzz(3, counts));
    }
    @Test
    public void testForReturningFizz() {
        assertEquals(fizzBuzz.FIZZ, fizzBuzz.fizzBuzz(6, counts));
    }

    @Test
    public void testForReturningBuzz() {
        assertEquals(fizzBuzz.BUZZ, fizzBuzz.fizzBuzz(10, counts));
    }

    @Test
    public void testForReturningFizzBuzz() {
        assertEquals(fizzBuzz.FIZZBUZZ, fizzBuzz.fizzBuzz(15, counts));
    }

    @Test
    public void testForReturningNumber() {
        assertEquals("22", fizzBuzz.fizzBuzz(22, counts));
    }

    @Test
    public void testFizzBuzzResults() {
        assertEquals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz\n" +
                "fizz: 4\n" +
                "buzz: 3\n" +
                "fizzbuzz: 1\n" +
                "lucky: 2\n" +
                "integer: 10", fizzBuzz.runFizzBuzz(20));
    }

}
