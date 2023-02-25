package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"aop","config","dao"})
@EnableAspectJAutoProxy //表示开启aop
public class SpringConfig {
}
