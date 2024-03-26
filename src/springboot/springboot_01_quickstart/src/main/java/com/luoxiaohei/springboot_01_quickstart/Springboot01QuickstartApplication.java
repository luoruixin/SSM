package com.luoxiaohei.springboot_01_quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

////springboot会默认扫描启动类的包及其子包下的bean（springboot的默认包扫描）
@SpringBootApplication(scanBasePackages = "com.luoxiaohei")//将默认包扫描时的基础包扩大
public class Springboot01QuickstartApplication {

    public static void main(String[] args) {
        //context就是ioc容器
        ConfigurableApplicationContext context = SpringApplication.run(Springboot01QuickstartApplication.class, args);


    }

}
