public abstract class TelephoneEntry {

    String name;
    Address address;

    abstract Address getAddress();

    abstract String description();
}