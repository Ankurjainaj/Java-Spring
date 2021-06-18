package SpringDemo.stereo_temp;

import SpringDemo.Dummy.Fruit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereoDemo {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean("us",UserService.class);
        UserService userService2 = context.getBean("us",UserService.class);
        UserService userService3 = context.getBean("us",UserService.class);
        UserService userService4 = context.getBean("us",UserService.class);
        System.out.println(userService.hashCode());
        System.out.println(userService2.hashCode());
        System.out.println(userService3.hashCode());
        System.out.println(userService4.hashCode());
        userService.getUser();

        Fruit fruit =context.getBean("fruit", Fruit.class);
        System.out.println(fruit);
        Fruit apple =context.getBean("apple", Fruit.class);
        System.out.println(apple);
    }
}
