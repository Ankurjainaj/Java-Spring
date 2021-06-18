package SpringDemo.temp;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@ToString
//@NoArgsConstructor
public class Employee {
    @Autowired
    @Qualifier("address")
    private Address address;

//    public Employee(Address a)
//    {
//        System.out.println("Constructor wire");
//        this.address=a;
//    }
//    @Autowired
//    public void setAddress(Address address) {
//        System.out.println("Setter method");//wont get executed in case of constructor auto wiring but will print in case of setter injection
//        this.address = address;
//    }
}
