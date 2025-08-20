public class CircularArray {
    private static int[] circularArray = new int[10];
    private static int capacity = 10;

    public static void main(String[] args) {

        int counter = 1;
        for (int index = 0; index < capacity; index++) {
            int circularIndex = index % capacity;
            circularArray[circularIndex] = counter;
            counter++;
        }

        for (int integer : circularArray) {
            System.out.println(integer);
        }

    }

}