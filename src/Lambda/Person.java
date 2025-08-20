package Lambda;

public class Person implements Greeting {

    public Person() {}

    @Override
    public void sayHello() {
        System.out.println("Hello, World!");
    }

}