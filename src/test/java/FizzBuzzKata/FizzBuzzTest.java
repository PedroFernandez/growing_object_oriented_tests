package FizzBuzzKata;

import org.junit.Assert;
import org.junit.Test;

/**
 * 1 == 1
 * 2 == 2
 * 3 == Fizz
 * 4 == 4
 * 5 == Buzz
 * 6 == Fizz
 * 7 == 7
 * 8 == 8
 * 9 == Fizz
 * 10 == Buzz
 * 11 == 11
 * 12 == Fizz
 * 13 == 13
 * 14 == 14
 * 15 == FizzBuzz
 * ...
 * 100 = Buzz
 */

public class FizzBuzzTest {

    @Test
    public void fizzBuzzConverterLeavesNormalNumbersAlone() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("2", fizzBuzz.convert(2));
        Assert.assertEquals("4", fizzBuzz.convert(4));
    }

    @Test
    public void fizzBuzzConverterMultiplesOfThree() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Fizz", fizzBuzz.convert(3));
        Assert.assertEquals("Fizz", fizzBuzz.convert(9));
        Assert.assertEquals("Fizz", fizzBuzz.convert(12));
    }

    @Test
    public void fizzBuzzConverterMultiplesOfFive() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Buzz", fizzBuzz.convert(5));
        Assert.assertEquals("Buzz", fizzBuzz.convert(10));
        Assert.assertEquals("Buzz", fizzBuzz.convert(20));
    }

    @Test
    public void fizzBuzzConverterMultiplesOfThreeAndFive() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15));
        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(30));
        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(45));
    }
}
