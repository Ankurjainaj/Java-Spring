package SpringDemo;

import SpringDemo.temp.Database;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("manage-bean.xml");
        Database db=context.getBean("db", Database.class);
        System.out.println(db);

    }
}
