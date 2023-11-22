public class Company extends TelephoneEntry {

    Company(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String description() {
        return name + " " + address.street + ", " + address.city + ", " + address.zipCode;
    }
}
