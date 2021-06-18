package SpringDemo.experiment;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public  class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs,int rowNum) throws SQLException
    {
        System.out.println("Row Number: "+rowNum);
        return new Student(rs.getInt(1),rs.getString(2), rs.getString(3));  //Column no. start from 1
    }

}
