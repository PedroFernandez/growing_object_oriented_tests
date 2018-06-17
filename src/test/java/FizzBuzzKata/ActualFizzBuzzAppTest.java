package FizzBuzzKata;

import org.junit.Test;

public class ActualFizzBuzzAppTest {

    @Test
    public void outputTheHundredBizzBuzzes() {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        for (int i=1; i <=100 ; i++) {
            System.out.println(fizzBuzz.convert(i));
        }
    }
}
