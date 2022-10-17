package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author gxw
 * @Date 22:18 2022/10/17
 * @Version 1.0
 **/
// <bean id="userService" class="com.itheima.service.impl.UserServiceImpl">
//
//    </bean>
//@Component("userService")
@Service("userService")
//@Scope("prototype")
@Scope("singleton")
//@Autowired 按照数据类型从Spring容器中进行匹配的
public class UserServiceImpl implements UserService {
    //<property name="userDao" ref="userDao"/>
//    @Autowired
//    @Qualifier("userDao") // 是按照ID的值从容器中进行匹配的 但是此处@Qualifier要结合@Autowired一起使用
    @Resource(name = "userDao") // @Resource 相当于@Autowired + @Qualifier
    private UserDao userDao;

    @Value("${jdbc.driver}")
    private String driverName;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void save() {
        userDao.save();
        System.out.println(driverName);
    }

    @PostConstruct
    public void init(){
        System.out.println("Service对象的初始化方法");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Service对象的销毁方法");
    }
}
