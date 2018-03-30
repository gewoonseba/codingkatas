package fizzbuzz;

public class FizzBuzz {

    public void run(Integer max){
        for(Integer i = 1;i <= max ; i++){
            System.out.println(doFizzBuzz(i));
        }
    }

    public String doFizzBuzz(Integer number) {
        String result = "";

        if (isFizz(number)) {
            result += "Fizz";
        }

        if (isDivisableBy(number, 5)) {
           result += "Buzz";
        }

        if (! (isFizz(number) || isDivisableBy(number, 5))){
            result += number.toString();
        }

        return result;
    }

    private boolean isFizz(Integer number){
        return isDivisableBy(number, 3) || number.toString().contains("3");
    }


    private boolean isDivisableBy(Integer number, Integer divisor){
        return number % divisor == 0;
    }
}
