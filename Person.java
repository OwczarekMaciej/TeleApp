public class Person extends TelephoneEntry {

    String firstName;
    String lastName;

    Person(String name, String lastName, Address address) {
        this.firstName = name;
        this.lastName = lastName;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String description() {
        return firstName + " " + lastName + ", " + address.streetNum + " "+ address.street + ", " + address.city + ", "
                + address.zipCode + ", " + address.country;
    }

}
