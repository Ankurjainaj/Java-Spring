package SpringDemo.experiment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class JdbcTemplateDemo {
    public static void main(String[] args) {

        //using spring
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcExpConfig.class);
       StudentDao studentDao = context.getBean("studentDao",StudentDao.class);

/*      For insertion
       Student student=new Student(12,"Adam","Delhi");
        int insert=studentDao.insert(student);
        System.out.println("Insert result: "+insert);
*/
        //Update
        Student student=new Student(12,"Adam","Udaipur");
        int update=studentDao.update(student);
        System.out.println("Update result: "+update);

        //Delete
        int delete=studentDao.delete(8);
        System.out.println("Delete result: "+delete);

        //Get data from table
        Student student1=studentDao.getStudent(1);
        System.out.println(student1);

        //For all data rows
        List<Student> students=studentDao.getAll();
        System.out.println(students);

/*      Using basic jdbc
        DriverManagerDataSource dataSource=new DriverManagerDataSource("jdbc:mysql://localhost:3306/student","root","Ankur2112000");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");      //which database driver to be interacted with

        JdbcTemplate jdbcTemplate=new JdbcTemplate((dataSource));

        Student student=new Student(8,"Kart","Mumbai");
        String sql="insert into data values(?,?,?)";
        int res = jdbcTemplate.update(sql,student.getId(),student.getName(), student.getCity());    //no of records that are updated
        System.out.println(res);
*/
    }
}
