package com.itheima.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyTest
 * @Description TODO
 * @Author gxw
 * @Date 16:11 2022/11/6
 * @Version 1.0
 **/
public class ProxyTest {
    public static void main(String[] args) {
        // 目标对象
        final Target target = new Target();
        // 增强对象
        final Advice advice = new Advice();

        //返回值 就是动态生成的代理对象
        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance(
                // 目标对象类加载器
                target.getClass().getClassLoader(),
                // 目标对象相同的接口字节码对象数组
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    // 调用代理对象的任何方法 实质执行的都是invoke方法
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 前置增强
                        advice.before();
                        // 执行目标方法
                        Object invoke = method.invoke(target, args);
                        // 后置增强
                        advice.afterRunning();
                        return invoke;
                    }
                }
        );

        // 调用代理方法
        proxy.save();
    }
}
