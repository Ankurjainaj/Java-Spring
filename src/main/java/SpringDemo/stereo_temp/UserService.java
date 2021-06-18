package SpringDemo.stereo_temp;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

//@Component("us")
@AllArgsConstructor
@Scope(SCOPE_PROTOTYPE)
public class UserService {

    private UserDao userDao;
    void getUser()
    {
        System.out.println("Connecting to "+userDao.getDbUrl());
        System.out.println("Getting user");
    }
}
