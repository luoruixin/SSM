package com.luoxiaohei.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

////4.定义一个servlet容器启动的配置类，在里面加spring的配置
//public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
//
//    //加载springMVC容器配置
//    @Override
//    protected WebApplicationContext createServletApplicationContext() {
//        AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();//创建一个空容器
//        ctx.register(SpringMvcConfig.class);//加载spring配置
//        return ctx;
//    }
//
//    //设置哪些清求归属springMVC处理
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/"};//表示所有请求都归springmvc处理
//    }
//
//    //加载spring容器配置
//    @Override
//    protected WebApplicationContext createRootApplicationContext() {
//        return null;
//    }
//}


//也可以用下面这种方式
//4.定义一个servlet容器启动的配置类，在里面加spring的配置
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
