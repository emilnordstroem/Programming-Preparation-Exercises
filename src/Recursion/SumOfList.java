package Recursion;

public class SumOfList {

    public static void main(String[] args) {
        Double[] array = {10.0, 20.5, 30.0, 5.9, 4.1, 30.5, 9.0}; // 100
        double result = sum(array, array.length);
        System.out.println(result);
    }

    private static double sum(Double[] array, int position){
        if(position <= 1){
            return 0;
        }
        return array[position - 1] + sum(array, position - 1);
    }
}
