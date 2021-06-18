package SpringDemo.temp;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class AccountService {
    private String serviceHost;
   //@PostConstruct
     void init()
    {
        System.out.println("Creating Account service");
    }
    //@PreDestroy
    void destroy()
    {
        System.out.println("Destroying Account Service");
    }
}
