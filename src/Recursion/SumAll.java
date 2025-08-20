package Recursion;

public class SumAll {

    public static void main(String[] args) {
        int n = 10;
        int recursionResult = sumRecursion(n);
        System.out.println(recursionResult);
        int iterationResult = sumIteration(n);
        System.out.println(iterationResult);
    }

    private static int sumRecursion(int n){
        if(n <= 1){
            return 1;
        }
        return n + sumRecursion(n - 1);
    }

    private static int sumIteration(int n){
        int result = 0;
        for(int counter = 1; counter <= n; counter++){
            result += counter;
        }
        return result;
    }
}
