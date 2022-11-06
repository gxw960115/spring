package com.itheima.test;

import com.itheima.anno.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName AnnoTest
 * @Description TODO
 * @Author gxw
 * @Date 21:36 2022/11/6
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-anno.xml")
public class AnnoTest {
    @Autowired
    private TargetInterface targetInterface;

    @Test
    public void test1() {
        targetInterface.save();
    }
}
