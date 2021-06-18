package SpringDemo.ORMExperiment;

import SpringDemo.entity.Student;

import java.util.List;


public interface StudentDao {

    int insert(Student student);

    void update(Student student); //don't return anything

    int delete(int id);

    void upsert(Student student);      //will update or insert the data if not present in the table

    Student getStudent(int id);

    List<Student> getAllStudent();
}
