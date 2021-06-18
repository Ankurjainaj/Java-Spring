package SpringDemo.exp;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee
{
    List<String> phones;
private Map<String,String> course;

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }


}
