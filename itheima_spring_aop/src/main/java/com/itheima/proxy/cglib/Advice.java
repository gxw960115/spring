package com.itheima.proxy.cglib;

/**
 * @ClassName Advice
 * @Description TODO
 * @Author gxw
 * @Date 16:23 2022/11/6
 * @Version 1.0
 **/
public class Advice {

    public void before(){
        System.out.println("前置增强......");
    }

    public void afterRunning(){
        System.out.println("后置增强......");
    }
}
