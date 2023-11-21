public class TelephoneNumber implements Comparable<TelephoneNumber>{
    int countryCode;
    String localNumber;
    
    TelephoneNumber(int countryCode, String localNumber)
    {
        this.countryCode = countryCode;
        this.localNumber = localNumber;
    }

    @Override public int compareTo(TelephoneNumber a)
    {
        if(countryCode != a.countryCode)
            return countryCode - a.countryCode;
        else
            return localNumber.compareTo(a.localNumber);
    }

    public String getTelephoneNum()
    {
        return "+" + countryCode + " " + localNumber;
    }
}