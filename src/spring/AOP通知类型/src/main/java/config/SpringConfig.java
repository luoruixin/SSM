package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"dao","config","aop"})
//开启注解开发AOP功能
@EnableAspectJAutoProxy  //告诉spring我这里有用注解开发的aop
public class SpringConfig {
}
