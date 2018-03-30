package fizzbuzz;

public class FizzBuzz {

    public String doFizzBuzz(Integer number) {

        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
           return "Buzz";
        }

        return number.toString();

    }
}
