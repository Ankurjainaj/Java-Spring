package SpringDemo.stereo_temp;

import SpringDemo.Dummy.Fruit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("SpringDemo.stereo_temp, SpringDemo.Dummy")
public class AppConfig {

    @Bean("userDao")
    UserDao getUserDao()
    {
        return new UserDao("localhost:3305");
    }

    @Bean("fruit")
    Fruit getFruit()
    {
        return new Fruit("Mango");
    }

    @Bean("apple")
    Fruit getApple()
    {
        return new Fruit("Apple");
    }

    //@Autowired        By default autowired
    @Bean("us")
    @Scope("prototype")
    UserService getUserService(UserDao userDao)
    {
        System.out.println("Hello!");
        return new UserService(userDao);
    }
}
