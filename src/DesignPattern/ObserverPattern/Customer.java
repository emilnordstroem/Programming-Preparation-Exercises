package DesignPattern.ObserverPattern;

public class Customer implements Observer {
    private final String name;
    private final String interestInGenre;

    public Customer(String name, String interestInGenre) {
        this.name = name;
        this.interestInGenre = interestInGenre;
    }

    @Override
    public void notify(Book book) {
        if (book.getGenre().equalsIgnoreCase(interestInGenre)) {
            System.out.println(
                    String.format("Now available:%nBook: %s%nGenre %s",
                            book.getTitle(),
                            book.getGenre()
                    )
            );
        }
    }

    public String getName() {
        return name;
    }

    public String getInterestInGenre() {
        return interestInGenre;
    }

}
