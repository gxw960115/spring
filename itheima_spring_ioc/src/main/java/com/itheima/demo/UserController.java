package com.itheima.demo;

import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author gxw
 * @Date 22:16 2022/10/12
 * @Version 1.0
 **/
public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = (UserService) app.getBean("userService");
        UserService userService = app.getBean(UserService.class);
        userService.save();
//没有从容器里取，所以会报空指针异常
//        UserService userService = new UserServiceImpl();
//        userService.save();
    }
}
