package com.itheima.controller;

import com.itheima.exception.MyException;
import com.itheima.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileNotFoundException;

/**
 * @author gxw
 */
@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/show")
    public String show() throws FileNotFoundException, MyException {
        System.out.println("show running......");
//        demoService.show1();
//        demoService.show2();
//        demoService.show3();
//        demoService.show4();
        demoService.show5();
        return "index";
    }

}
