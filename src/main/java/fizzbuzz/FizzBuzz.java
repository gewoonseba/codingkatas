package fizzbuzz;

public class FizzBuzz {

    public String doFizzBuzz(Integer number) {
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
           result += "Buzz";
        }
        if (result == ""){
            result = number.toString();
        }
        return result;
    }
}
