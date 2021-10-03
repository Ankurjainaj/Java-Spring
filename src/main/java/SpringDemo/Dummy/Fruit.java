package SpringDemo.Dummy;


import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
//@Component
@ToString
public class Fruit {
    //@Value("Mango")
    public String name;
    private String type;
    private String family;
}
