package fizzbuzz;

public class FizzBuzz {

    public String doFizzBuzz(Integer number){
        if (number % 3 == 0) {
            return "Fizz";
        } else {
            return number.toString();
        }
    }
}
