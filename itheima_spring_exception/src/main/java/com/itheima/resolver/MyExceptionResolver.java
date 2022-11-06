package com.itheima.resolver;

import com.itheima.exception.MyException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName MyExceptionResolver
 * @Description TODO
 * @Author gxw
 * @Date 22:02 2022/10/31
 * @Version 1.0
 **/
public class MyExceptionResolver implements HandlerExceptionResolver {
    /*
     * 参数Exception：异常对象
     * 返回ModelAndView 跳转到错误视图信息
     * */
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        if (e instanceof MyException) {
            modelAndView.addObject("info", "自定义异常");
        } else if (e instanceof ClassCastException) {
            modelAndView.addObject("info", "类型转换异常");
        }
        modelAndView.setViewName("error");
        return modelAndView;

    }
}
