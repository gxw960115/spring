package com.itheima.web;

import com.itheima.config.SpringConfiguration;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author gxw
 * @Date 22:23 2022/10/17
 * @Version 1.0
 **/
//@Controller
public class UserController {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        UserService bean = app.getBean(UserService.class);
        UserService bean1 = app.getBean(UserService.class);
        bean.save();
        System.out.println(bean);
        bean1.save();
        System.out.println(bean1);
//        app.close();
    }
}
