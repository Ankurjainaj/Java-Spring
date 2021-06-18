package SpringDemo.ORMExperiment;

import SpringDemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component("studentDao1")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public int insert(Student student) {
       Integer res= (Integer)hibernateTemplate.save(student);       //insert a record in the database
        return res;         //will return an identifier like the private key of the record inserted and not the no. of records updated
    }

    @Transactional
    @Override
    public void update(Student student) {
        this.hibernateTemplate.update(student);
    }

    @Transactional
    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    @Transactional
    public void upsert(Student student) {
    hibernateTemplate.saveOrUpdate(student);

    }

    @Transactional
    @Override
    public Student getStudent(int id) {
        //Used for lazy loading
//        Session session=hibernateTemplate.getSessionFactory().openSession();
//        Student student=session.load(Student.class,id);
//        session.close();
//        return student;
        //Used for eager loading
          return hibernateTemplate.get(Student.class,id);
    }

    @Override
    public List<Student> getAllStudent() {
        return hibernateTemplate.loadAll(Student.class);
    }
}
