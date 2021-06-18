package SpringDemo.exp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExpDemo {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config-exp.xml");

       Address a1=context.getBean("a1",Address.class);
        System.out.println(a1);
        Address a2=context.getBean("a2",Address.class);
        System.out.println(a2);
        Address a3=context.getBean("a3",Address.class);
        System.out.println(a3);
        Employee e1=context.getBean("e1",Employee.class);
        System.out.println(e1);

        //Constructor injection example
        Address a4=context.getBean("a4",Address.class);
        System.out.println(a4);
        Employee e3=context.getBean("e3",Employee.class);
        System.out.println(e3);
    }
}
