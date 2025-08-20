package MultidimensionalArray;

public class Matrix {
    private static int[][] matrix = { // [rows] [columns]
            {0,1,2,3,4,5,6,7,8,9}, // 0
            {10,11,12,13,14,15,16,17,18,19}, // 1
            {20,21,22,23,24,25,26,27,28,29}, // 2
    };

    public static void main(String[] args) {
        System.out.printf("Total: %d%n", totalValue());
        System.out.printf("Addition: %d%n", addition(0,0,1,0));
        System.out.printf("Substract: %d%n", subtract(0,0,1,0));
        System.out.println(search(4));
    }

    private static int totalValue () {
        int result = 0;
        for (int[] row : matrix) {
            for (int column : row) {
                result += column;
            }
        }
        return result;
    }

    private static int addition (int rowIndex1, int columnIndex1,
                                 int rowIndex2, int columnIndex2) {
        return (matrix[rowIndex1][columnIndex1] + matrix[rowIndex2][columnIndex2]);
    }

    private static int subtract(int rowIndex1, int columnIndex1,
                                int rowIndex2, int columnIndex2){
        return (matrix[rowIndex1][columnIndex1] - matrix[rowIndex2][columnIndex2]);
    }

    private static int search(int target){
        for (int[] row : matrix) {
            int foundAtIndex = binarySearch(row, target, 0, row.length);
            if (foundAtIndex != -1) {
                return foundAtIndex;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] array, int target, int left, int right){
        if(left > right){
            return -1;
        }
        int middle = (left + right) / 2;
        int candidate = array[middle];
        if(candidate == target){
            return middle;
        } else if (target < candidate) {
            return binarySearch(array, target, left, middle - 1);
        } else {
            return binarySearch(array, target, middle + 1, right);
        }
    }
}