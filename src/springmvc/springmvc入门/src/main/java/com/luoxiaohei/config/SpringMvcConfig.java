package com.luoxiaohei.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//3.创建springmvc的配置文件，加载controller 对应的bean
@Configuration
@ComponentScan("com.luoxiaohei.controller")//加载controller对应的bean
public class SpringMvcConfig {
}
