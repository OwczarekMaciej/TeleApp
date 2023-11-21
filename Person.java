public class Person extends TelephoneEntry{

    String lastName;

    Person(String name, String lastName, Address address)
    {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public Address getAddress()
    {
        return address;
    }

    public void description()
    {
        System.out.println(name + " " + lastName + " " + getAddress().street + ", " + getAddress().city + ", " + getAddress().zipCode);
    }

}
