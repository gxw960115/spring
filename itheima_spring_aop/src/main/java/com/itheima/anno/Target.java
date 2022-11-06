package com.itheima.anno;

import org.springframework.stereotype.Component;

/**
 * @ClassName Target
 * @Description TODO
 * @Author gxw
 * @Date 16:09 2022/11/6
 * @Version 1.0
 **/
@Component("target")
public class Target implements TargetInterface {
    public void save() {
//        int i = 1 / 0;
        System.out.println("save running.....");
    }
}
