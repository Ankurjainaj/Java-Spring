package SpringDemo.temp;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
       /*
         AbstractApplicationContext context=new ClassPathXmlApplicationContext("manage-bean.xml");
        Database db=context.getBean("db", Database.class);
        context.registerShutdownHook();
        System.out.println(db);
        */
//        AbstractApplicationContext context1=new ClassPathXmlApplicationContext("autowire-temp.xml");
//        context1.registerShutdownHook();
//        Employee e=context1.getBean("emp",Employee.class);
//        System.out.println(e);

//        AbstractApplicationContext context=new ClassPathXmlApplicationContext("standalone-config.xml");
//        context.registerShutdownHook();
//        FeedService feedService=context.getBean("feed",FeedService.class);
//        System.out.println(feedService);
//        System.out.println(feedService.getFiles().getClass());
//        System.out.println(context.getBean("config"));
//      //  System.out.println(context.getBean("colours"));
//        Set colours = context.getBean("colours",Set.class);
//        System.out.println(colours.getClass());
//        System.out.println(colours);

        AbstractApplicationContext context=new ClassPathXmlApplicationContext("standalone-config.xml");
        context.registerShutdownHook();
        Student student=context.getBean("student",Student.class);
        System.out.println(student);

    }
}
