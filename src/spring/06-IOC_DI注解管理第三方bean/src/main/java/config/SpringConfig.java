package config;

import com.alibaba.druid.pool.DruidDataSource;
import config.JdbcConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

//ComponentScan一般带入非配置bean,Import一般导入配置的bean

@Configuration
@ComponentScan("dao")
@Import({JdbcConfig.class})  //推荐这样写---这样写jdbcConfig就不用写Configuration
public class SpringConfig {

    //1、定义一个方法获得要管理的对象
    //2.添加@Bean,表示当前方法的返回值是一个bean
//    @Bean(name = "dataSource")
//    public DataSource dataSource(){
//        DruidDataSource ds=new DruidDataSource();
//        ds.setDriverClassName("com.mysql.jdbc.Driver");
//        ds.setUrl("jdbc:mysql:///db1?useSSL=false");
//        ds.setUsername("root");
//        ds.setPassword("1234");
//        return ds;
//    }

}
