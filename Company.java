public class Company extends TelephoneEntry{
 
    Company(String name, Address address)
    {
        this.name = name;
        this.address = address;
    }

    public Address getAddress()
    {
        return address;
    }

    public void description()
    {
        System.out.println(name + " " + getAddress().street + ", " + getAddress().city + ", " + getAddress().zipCode);
    }
}
