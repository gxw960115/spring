package com.itheima.test;

import com.itheima.config.SpringConfiguration;
import com.itheima.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @ClassName SpringJunitTest
 * @Description TODO
 * @Author gxw
 * @Date 23:18 2022/10/17
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
@ContextConfiguration(classes = {SpringConfiguration.class})
public class SpringJunitTest {

    @Autowired
//    @Qualifier("userService")
    private UserService userService;

    @Test
    public void test1(){
        userService.save();
    }

}
