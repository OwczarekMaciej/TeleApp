public class Company extends TelephoneEntry {

    String companyName;

    Company(String name, Address address) {
        this.companyName = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String description() {
        return companyName + ", " + address.streetNum + " "+ address.street + ", " + address.city + ", "
        + address.zipCode + ", " + address.country;
    }
}
