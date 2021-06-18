package SpringDemo.temp;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


@AllArgsConstructor
@ToString
public class Database implements InitializingBean, DisposableBean {
    private String dbUrl;


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing db");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying db");
    }
}
