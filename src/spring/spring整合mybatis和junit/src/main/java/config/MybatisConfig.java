package config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

//下面就是与mybatis整合相关的方法
public class MybatisConfig {

    //定义bean，SqlSessionFactoryBean，用于产生SqlSessionFactory对象
    //这样做更快
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){//使用@Bean定义的bean通过形参注入引用类型
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("domain");//设置类型别名的包
        ssfb.setDataSource(dataSource);
        return ssfb;
    }

    //定义bean(映射扫描配置的类)，返回MapperScannerConfigurer对象
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("dao");
        return msc;
    }
}