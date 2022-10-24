package com.itheima.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

/**
 * @ClassName JdbcTemplateTest
 * @Description TODO
 * @Author gxw
 * @Date 22:40 2022/10/24
 * @Version 1.0
 **/
public class JdbcTemplateTest {

    @Test
    // 测试JdbcTemplate开发步骤
    public void test1() throws PropertyVetoException {
        // 创建数据源对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8");
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        JdbcTemplate template = new JdbcTemplate();
        // 设置数据源对象 知道数据库在哪儿
        template.setDataSource(dataSource);
        // 执行操作
        int row = template.update("insert  into account values (?,?)", "tom", 5000);
        System.out.println(row);
    }


    @Test
    // 测试spring产生JdbcTemplate对象
    public void test2() throws PropertyVetoException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jd = context.getBean(JdbcTemplate.class);
        int row = jd.update("insert into `account` values (?,?)", "张三", 5000);
        System.out.println(row);
    }
}
