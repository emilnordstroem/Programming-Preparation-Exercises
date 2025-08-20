package Lambda;

public class Main {

    public static void main(String[] args) {

        Person emil = new Person();
        emil.sayHello();

        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };
        greeting1.sayHello();

        Greeting greeting2 = () -> System.out.println("Hello, World!");
        greeting2.sayHello();

    }

}
