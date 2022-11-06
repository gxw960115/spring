package com.itheima.proxy.cglib;

import com.itheima.proxy.jdk.Advice;
import com.itheima.proxy.jdk.Target;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName ProxyTest
 * @Description TODO
 * @Author gxw
 * @Date 16:24 2022/11/6
 * @Version 1.0
 **/
public class ProxyTest {
    public static void main(final String[] args) {
        // 目标对象
        final com.itheima.proxy.jdk.Target target = new Target();
        // 增强对象
        final com.itheima.proxy.jdk.Advice advice = new Advice();

        //返回值 就是动态生成的代理对象 基于cglib
        // 1、创建增强器
        Enhancer enhancer = new Enhancer();
        // 2、设置父类 （目标）
        enhancer.setSuperclass(Target.class);
        // 3、设置回调
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                // 执行前置
                advice.before();
                // 执行目标
                Object invoke = method.invoke(target, objects);
                // 执行后置
                advice.afterRunning();
                return invoke;
            }
        });
        // 4、创建代理对象
        Target proxy = (Target) enhancer.create();
        proxy.save();
    }
}
