package com.luoxiaohei.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;


public class JdbcConfig {
    @Value("${jdbc.driver}")  //使用属性占位符${}读取properties文件中的属性
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }

    //2、配置事务管理器，mybatis使用的是jdbc事务，表示将事务交给spring管理
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource){ //别忘了使用形参注入dataSource
        //使用的是jdbc的事务管理器
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);//这里的dataSource不要用前面的方法进行传入
        return transactionManager;
    }
}