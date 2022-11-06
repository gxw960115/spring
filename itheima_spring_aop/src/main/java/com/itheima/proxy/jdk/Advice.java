package com.itheima.proxy.jdk;

/**
 * @ClassName Advice
 * @Description TODO
 * @Author gxw
 * @Date 16:10 2022/11/6
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
