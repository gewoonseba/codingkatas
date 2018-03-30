package fizzbuzz;

public class FizzBuzz {

    public void run(Integer max){
        for(Integer i = 1;i <= max ; i++){
            System.out.println(doFizzBuzz(i));
        }
    }

    public String doFizzBuzz(Integer number) {
        String result = "";

        if (isDivisableBy(number, 3)) {
            result += "Fizz";
        }

        if (isDivisableBy(number, 5)) {
           result += "Buzz";
        }

        if (! (isDivisableBy(number, 3) || isDivisableBy(number, 5))){
            result += number.toString();
        }

        return result;
    }

    private boolean isDivisableBy(Integer number, Integer divisor){
        return number % divisor == 0;
    }
}
