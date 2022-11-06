package com.itheima.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyAspect
 * @Description TODO
 * @Author gxw
 * @Date 20:32 2022/11/6
 * @Version 1.0
 **/
@Component("myAspect")
// 标注当前MyAspect是一个切面类
@Aspect
public class MyAspect {

    // 配置前置增强
//    @Before("execution(* com.itheima.anno.*.*(..))")
    public void before() {
        System.out.println("前置增强......");
    }

    //    @AfterReturning("execution(* com.itheima.anno.*.*(..))")
    public void afterRunning() {
        System.out.println("后置增强......");
    }

    // Proceeding JoinPoint:正在执行的连接点==切点
    @Around("execution(* com.itheima.anno.*.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前增强......");
        // 切点方法
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕后增强......");
        return proceed;
    }

    //    @AfterThrowing("execution(* com.itheima.anno.*.*(..))")
    public void afterThrowing() {
        System.out.println("异常抛出增强......");
    }

    @After("MyAspect.pointcut()")
    public void after() {
        System.out.println("最终增强......");
    }

    // 定义切点表达式
    @Pointcut("execution(* com.itheima.anno.*.*(..))")
    public void pointcut() {
    }
}
