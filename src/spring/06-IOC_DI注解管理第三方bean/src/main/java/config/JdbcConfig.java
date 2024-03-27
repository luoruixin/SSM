package config;

import com.alibaba.druid.pool.DruidDataSource;
import dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//为第三方bean注入资源
//@Configuration  //--这里注释掉是因为前面写了Import
public class JdbcConfig {

    //1、基本数据类型的注入
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306/spring_db")
    private String url;
    @Value("root")
    private String userName;
    @Value("1234")
    private String password;

    @Autowired
    BookDao bookDao;

    @Bean(name = "dataSource")
    public DataSource dataSource(){//2、引用类型的注入直接使用形参即可
        System.out.println(bookDao);
        DruidDataSource ds=new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}
