package SpringDemo.exp;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class Address {
    private String city;
    private int postalCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public Address( String city,String postalCode) {
        this.city = city;
        this.postalCode = Integer.parseInt(postalCode);
    }
public Address(String city,int postalCode)
{
    this.city=city;
    this.postalCode=postalCode;
}
    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
