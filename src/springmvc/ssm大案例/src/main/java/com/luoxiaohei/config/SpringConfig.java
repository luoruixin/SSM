package com.luoxiaohei.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//ComponentScan用于加载其他文件，Import用于加载配置文件

@Configuration
@ComponentScan({"com.luoxiaohei.service"})
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableTransactionManagement //1、开启注解式事务驱动，告诉spring我们使用了注解的形式开启事务
public class SpringConfig {
}
