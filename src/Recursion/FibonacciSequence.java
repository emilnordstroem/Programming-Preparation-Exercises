package Recursion;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSequence {
    private final static Map<Integer, Integer> memorization = new HashMap<>();

    public static void main(String[] args) {
        int fibonacci = fibonacci(10);
        System.out.println(fibonacci);

        for(int value : memorization.values()){
            System.out.println(value);
        }
    }

    private static int fibonacci(int number){
        if(number <= 1){
            return number;
        }
        if(memorization.containsKey(number)){
            return memorization.get(number);
        }
        int result = fibonacci(number - 1) + fibonacci(number - 2);
        memorization.put(number, result);
        return result;
    }
}
