package SpringDemo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
        //Demo for traditional code for jdbc it is very bulky and easy to make mistakes  thus we use spring jdbc
    @Test
    public void legacyJdbc() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");          //registering driver class
            Connection con = DriverManager.getConnection(       //Throws classnotfound exception so the use of try catch block
                    "jdbc:mysql://localhost:3306/ankur", "root", "123456789");
//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();         //Statement
            ResultSet rs = stmt.executeQuery("select * from student");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}