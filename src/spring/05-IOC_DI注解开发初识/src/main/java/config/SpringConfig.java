package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//代表这是一个配置类
@Configuration   //@Configuration注解用于设定当前类为配置类
@ComponentScan(basePackages= {"dao.impl","service.impl"})
@PropertySource({"jdbc.properties"}) //这样加载properties配置文件,大括号里可以写多个配置文件
public class SpringConfig {
}


//@ComponentScan注解用于设定扫描路径,此注解只能添加一-次,多个数据请用数组格式