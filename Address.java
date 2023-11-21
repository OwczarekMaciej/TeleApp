public class Address {
    TelephoneNumber telephoneNumber;
    String street;
    String city;
    String zipCode;

    Address(TelephoneNumber telephoneNumber, String street, String city, String zipCode)
    {
        this.telephoneNumber = telephoneNumber;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

}
