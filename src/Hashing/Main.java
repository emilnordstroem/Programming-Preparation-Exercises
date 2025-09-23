package Hashing;

import java.util.Set;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        System.out.println("Put 'Coca-Cola': " + hashMap.put(111, "Coca-Cola"));
        System.out.println("Put 'Fanta': " + hashMap.put(222, "Fanta"));
        System.out.println("Put 'Coca-Cola Zero': " + hashMap.put(333, "Coca-Cola Zero"));
        System.out.println("Put 'Coca-Cola Light': " + hashMap.put(444, "Coca-Cola Light"));
        System.out.println("Put 'Sprite': " + hashMap.put(555, "Sprite"));
        System.out.println("Current size: " + hashMap.size());
        System.out.println("Put 'Coca-Cola (because I ran out)': " + hashMap.put(666, "Coca-Cola"));
        System.out.println("Put 'Coca-Cola Cherry (ehhh)': " + hashMap.put(777, "Coca-Cola"));
        System.out.println("Put 'Coca-Cola Vanilla (just, don't)': " + hashMap.put(888, "Coca-Cola"));
        System.out.println("Now, the Hashing table should have refactored due to threshold");
        System.out.println("Put 'Fanta Light': " + hashMap.put(999, "Fanta"));
        System.out.println("Current size: " + hashMap.size());

        System.out.println("Contains key '111': " + hashMap.containsKey(111));

        Set<Integer> keyset = hashMap.keySet();
        System.out.print("KeySet in Hashmap: ");
        keyset.forEach((key) -> System.out.print(key + "\t"));
        System.out.println();

        Set<String> values = hashMap.values();
        System.out.print("Values in Hashmap: ");
        values.forEach((value) -> System.out.print(value + "\t"));
        System.out.println();

        System.out.println("Successfully removed 'Coca-Cola': " + hashMap.remove(111));
        System.out.println("Contains key '111': " + hashMap.containsKey(111));
        System.out.println("Is 'Fanta' present: " + hashMap.containsValue("Fanta"));
        System.out.println("Is 'Coca-Cola' present: " + hashMap.containsValue("Coca-Cola"));

        System.out.println("Current size: " + hashMap.size());
        System.out.println("Clear HashingTable...");
        hashMap.clear();
        System.out.println("Current size: " + hashMap.size());
        System.out.println("Is HashingTable empty: " + hashMap.isEmpty());

    }

}
