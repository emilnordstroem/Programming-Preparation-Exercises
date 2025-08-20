package LinkedList.linearLinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linearCarBrands = new LinkedList<>();
        linearCarBrands.add("BMW");
        linearCarBrands.add("Porsche");
        linearCarBrands.add("Mercedes");
        System.out.println(linearCarBrands.size());

        linearCarBrands.remove("Porsche");
        System.out.println(linearCarBrands.size());

        linearCarBrands.remove("Mercedes");
        System.out.println(linearCarBrands.size());

        linearCarBrands.remove("BMW");
        System.out.println(linearCarBrands.size());
    }

}