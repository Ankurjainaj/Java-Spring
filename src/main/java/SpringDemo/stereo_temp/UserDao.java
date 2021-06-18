package SpringDemo.stereo_temp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@ToString
@AllArgsConstructor
public class UserDao {

    @Value("localhost:3306")
    private String dbUrl;

}
