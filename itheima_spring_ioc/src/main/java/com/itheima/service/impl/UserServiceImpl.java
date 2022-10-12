package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author gxw
 * @Date 22:14 2022/10/12
 * @Version 1.0
 **/
public class UserServiceImpl implements UserService {
    private UserDao userDao;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }


    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    @Override
    public void save() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext app = new FileSystemXmlApplicationContext("E:\\IdeaProjects\\exercise\\Spring\\itheima_spring_ioc\\src\\main\\resources\\applicationContext.xml");
//        ApplicationContext app = new AnnotationConfigApplicationContext("E:\\IdeaProjects\\exercise\\Spring\\itheima_spring_ioc\\src\\main\\resources\\applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }
}
