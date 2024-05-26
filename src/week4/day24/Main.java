package week4.day24;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        NameChangeListener listener = new NameChangeListener();

        // Add the listener to the person
        person.addPropertyChangeListener(listener);

        // Change the name property
        person.setName("John");
        person.setName("Jane");
        person.setName("Doe");

        // Remove the listener
        person.removePropertyChangeListener(listener);

        // Change the name property again
        person.setName("Smith");
    }
}
