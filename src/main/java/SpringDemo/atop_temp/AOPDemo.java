package SpringDemo.atop_temp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPDemo {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("config-aop-temp.xml");
        PaymentService paymentService= context.getBean("paymentService",PaymentService.class);
        paymentService.makePayment();

        paymentService.makePayment(100);
    }
}
