package LinkedList.extendedLinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> carBrands = new LinkedList<>();
        carBrands.add("Mercedes");
        carBrands.add("BMW");
        carBrands.add("Porsche");
        System.out.println(carBrands.size());

        carBrands.remove("BMW");
        System.out.println(carBrands.size());

        carBrands.remove("Mercedes");
        System.out.println(carBrands.size());

        carBrands.remove("Porsche");
        System.out.println(carBrands.size());
    }

}
