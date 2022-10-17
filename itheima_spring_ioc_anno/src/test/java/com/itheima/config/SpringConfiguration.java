package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @ClassName SpringConfiguration
 * @Description TODO
 * @Author gxw
 * @Date 22:59 2022/10/17
 * @Version 1.0
 **/
// 标志该类时Spring的核心配置类
@Configuration
@ComponentScan("com.itheima")
//<context:property-placeholder location="classpath:application.properties"/>
@PropertySource("classpath:application.properties")
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {

}
