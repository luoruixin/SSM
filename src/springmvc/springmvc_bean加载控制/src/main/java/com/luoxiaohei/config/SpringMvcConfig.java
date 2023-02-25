package com.luoxiaohei.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //这里要注释掉
@ComponentScan("com.luoxiaohei.controller")
public class SpringMvcConfig {
}
