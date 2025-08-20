package LinkedList.circularLinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> carBrands = new LinkedList<>();
        carBrands.add("Mercedes");
        carBrands.add("Porsche");
        carBrands.add("Lamborghini");
        System.out.println(carBrands.size());

        carBrands.remove("Porsche");
        System.out.println(carBrands.size());

        carBrands.remove("Mercedes");
        System.out.println(carBrands.size());

        carBrands.remove("Lamborghini");
        System.out.println(carBrands.size());

    }

}