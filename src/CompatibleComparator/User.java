package CompatibleComparator;

public class User implements Comparable<User> {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(User otherUser) {
        return name.compareToIgnoreCase(otherUser.getName());
    }

}
