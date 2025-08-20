package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int factorialResult = factorialCalculation(5);
        System.out.println(factorialResult);
    }

    private static int factorialCalculation(int number){
        if(number <= 1){
            return 1;
        }
        return number * factorialCalculation(number - 1);
    }
}
