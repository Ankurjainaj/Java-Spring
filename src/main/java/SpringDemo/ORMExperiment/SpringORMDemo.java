package SpringDemo.ORMExperiment;

import SpringDemo.AppsConfig;
import SpringDemo.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringORMDemo {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppsConfig.class);

        StudentDao studentDao= context.getBean("studentDao1",StudentDao.class);
        Student student=new Student(10,"Bob","Delhi");
        Student student1=new Student(10,"Bob","Udaipur");
        Student student2=new Student(13,"ab","delhi");

        System.out.println(studentDao.getStudent(10));

        System.out.println(studentDao.getAllStudent());

        //studentDao.upsert(student2);
        //int res= studentDao.insert(student);
        //studentDao.update(student1);
        //System.out.println("Insert result: "+res);
    }
}
