package FizzBuzzKata;

public class FizzBuzzConverter {

    public String convert(int toConvertToFizzBuzz) {

        if (toConvertToFizzBuzz % 3 == 0 && toConvertToFizzBuzz % 5 == 0) {
            return "FizzBuzz";
        }

        if (toConvertToFizzBuzz % 3 == 0 ) {
            return "Fizz";
        } else if (toConvertToFizzBuzz % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(toConvertToFizzBuzz);
    }
}
