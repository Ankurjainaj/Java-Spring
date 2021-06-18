package SpringDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@ComponentScan
@EnableTransactionManagement
@Configuration
public class AppsConfig {

    @Bean("dataSource")
    DataSource getDataSource()
    {
        DriverManagerDataSource dataSource=new DriverManagerDataSource("jdbc:mysql://localhost:3306/student","root","Ankur2112000");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }
    @Bean("annotatedClasses")
    Class<?>[] getAnnotatedClasses(){return new Class[]{SpringDemo.entity.Student.class};}

    @Bean("hibernateProperties")
    Properties getHibernateProperties()
    {
        Properties properties=new Properties();
        properties.setProperty("hibernateDialect", "org.hibernate.dialect.MySQL57Dialect");
        properties.setProperty("hibernate.show_sql","true");
        properties.setProperty("hibernate.hbm2ddl.auto","update");      //not recommended in case of production code
        return properties;
    }
    @Bean("sessionFactory")
    LocalSessionFactoryBean getSessionFactory(DataSource dataSource,Properties hibernateProperties, Class<?>[] annotatedClasses)
    {
        LocalSessionFactoryBean localSessionFactoryBean=new LocalSessionFactoryBean();
        localSessionFactoryBean.setAnnotatedClasses(annotatedClasses);
        localSessionFactoryBean.setDataSource(dataSource);
        localSessionFactoryBean.setHibernateProperties(hibernateProperties);
        return localSessionFactoryBean;
    }
    @Bean("hibernateTemplate")
    HibernateTemplate getHibernateTemplate(LocalSessionFactoryBean sessionFactory)
    {
        HibernateTemplate hibernateTemplate=new HibernateTemplate();
        hibernateTemplate.setSessionFactory(sessionFactory.getObject());
        return hibernateTemplate;
    }
    @Bean("txnManager")
    HibernateTransactionManager getTransactionManager(HibernateTemplate hibernateTemplate,LocalSessionFactoryBean sessionFactory)
    {
        HibernateTransactionManager txnManager=new HibernateTransactionManager();
        txnManager.setSessionFactory(sessionFactory.getObject());
        return txnManager;
    }
}
