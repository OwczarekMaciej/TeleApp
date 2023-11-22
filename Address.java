public class Address {
    TelephoneNumber telephoneNumber;
    String streetNum;
    String street;
    String city;
    String zipCode;
    String country;

    Address(TelephoneNumber telephoneNumber, String street, String streetNum, String city, String zipCode, String country) {
        this.telephoneNumber = telephoneNumber;
        this.street = street;
        this.streetNum = streetNum;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }
}
