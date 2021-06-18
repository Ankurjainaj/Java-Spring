package SpringDemo.temp;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class UserService {
    private String serviceHost;

    void initUS()
    {
        System.out.println("Initializing User Service");
    }
    void destroyUS()
    {
        System.out.println("Destroying User Service");
    }
}
