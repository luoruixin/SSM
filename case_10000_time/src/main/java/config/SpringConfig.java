package config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"config","dao","domain","service","aop"})
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
