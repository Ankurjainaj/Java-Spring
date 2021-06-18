package SpringDemo.temp;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@AllArgsConstructor
@ToString
public class Student {

    private List<String> colours;
    private Map<String,Integer> courses;
    private Properties properties;
}
