package com.luoxiaohei.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {

    //这个bean负责造出SqlSessionFactory对象
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){  //dataSource从参数中来
        SqlSessionFactoryBean factoryBean =new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);//设置dataSource，来源是jdbcConfig里面
        factoryBean.setTypeAliasesPackage("com.luoxiaohei.domain"); //设置类型别名的包
        return factoryBean;
    }

    //这个bean负责造自动代理对象
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc=new MapperScannerConfigurer();
        msc.setBasePackage("com.luoxiaohei.dao");
        return msc;
    }
}
