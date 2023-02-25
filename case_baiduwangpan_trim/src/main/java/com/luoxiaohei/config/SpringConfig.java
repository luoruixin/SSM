package com.luoxiaohei.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.luoxiaohei")
@EnableAspectJAutoProxy
public class SpringConfig {
}
