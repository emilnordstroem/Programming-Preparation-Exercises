package CompatibleComparator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Random"));
        users.add(new User("PokeBall"));
        users.add(new User("Space"));
        users.add(new User("James"));
        users.add(new User("Jack"));

        quickSort(users);

        users.forEach(user -> System.out.print(user.getName() + " "));

        users.sort((user1, user2) -> Integer.compare(user1.getName().length(), user2.getName().length()));

        System.out.println();
        users.forEach(user -> System.out.print(user.getName() + " "));

    }

    private static void quickSort(List<User> list){
        quickSort(list, 0, list.size() - 1);
    }

    private static void quickSort(List<User> list, int left, int right){
        if (left < right) {
            int pivotIndex = partition(list, left, right);
            quickSort(list, left, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, right);
        }
    }

    private static int partition(List<User> list, int left, int right){
        User pivotElement = list.get(right);
        int lowIndex = left - 1;

        for (int index = left; index < right; index++) {
            if (list.get(index).compareTo(pivotElement) < 0) {
                lowIndex++;
                swap(list, lowIndex, index);
            }
        }

        swap(list, lowIndex + 1, right);

        return lowIndex + 1;
    }

    private static void swap(List<User> list, int index1, int index2){
        if (index1 == index2) {
            return;
        }
        User temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }


}
