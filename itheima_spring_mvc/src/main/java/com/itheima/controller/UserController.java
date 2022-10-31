package com.itheima.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.User;
import com.itheima.domain.VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    // 请求地址  http://localhost:8080/user/quick
    @RequestMapping(value = "/quick", method = RequestMethod.GET, params = {"username"})
    public String save() {
        System.out.println("Controller save running....");
        return "success";
    }

    @RequestMapping(value = "/quick2")
    public ModelAndView save2() {
        /*
         * Model:模型 作用封装数据
         * View：视图 作用展示数据
         * */
        ModelAndView modelAndView = new ModelAndView();
        // 设置模型数据
        modelAndView.addObject("username", "itcast");
        // 设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value = "/quick3")
    public ModelAndView save3(ModelAndView modelAndView) {
        /*
         * Model:模型 作用封装数据
         * View：视图 作用展示数据
         * */
        // 设置模型数据
        modelAndView.addObject("username", "itheima");
        // 设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value = "/quick4")
    public String save4(Model model) {
        model.addAttribute("username", "博学谷");
        return "success";
    }

    @RequestMapping(value = "/quick5")
    public String save5(HttpServletRequest request) {
        request.setAttribute("username", "黑马程序员");
        return "success";
    }

    @RequestMapping(value = "/quick6")
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello world!");
    }

    @RequestMapping(value = "/quick7")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public String save6() throws IOException {
        return "hello world!";
    }

    @RequestMapping(value = "/quick8")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public String save8() throws IOException {
        return "{\"username\":\"张三\",\"age\":18}";
    }


    @RequestMapping(value = "/quick9")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public String save9() throws IOException {
        User user = new User();
        user.setUserName("lisi");
        user.setAge(30);
        // 使用json的转换工具将对象转换成json格式字符串再返回
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }

    @RequestMapping(value = "/quick10")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public User save10() throws IOException {
        User user = new User();
        user.setUserName("lisi");
        user.setAge(30);
        return user;
    }

    @RequestMapping(value = "/quick11")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public String save11(String username, int age) throws IOException {
        System.out.println(username + " , " + age);
        return username + " , " + age;
    }

    @RequestMapping(value = "/quick12")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public String save12(User user) throws IOException {
        System.out.println(user);
        return user.getUserName() + " , " + user.getAge();
    }

    @RequestMapping(value = "/quick13")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public void save13(String[] arrays) throws IOException {
        System.out.println(Arrays.asList(arrays));
//        return Arrays.asList(arrays);
    }

    @RequestMapping(value = "/quick14")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public void save14(VO vo) throws IOException {
        System.out.println(vo);
//        return Arrays.asList(arrays);
    }

    @RequestMapping(value = "/quick15")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public void save15(@RequestBody List<User> userList) throws IOException {
        System.out.println(userList);
    }

    @RequestMapping(value = "/quick16")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public String save16(@RequestParam(value = "user", required = false, defaultValue = "itcast") String username) throws IOException {
        System.out.println(username);
        return username;
    }

    @RequestMapping(value = "/quick17/{user}")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public String save17(@PathVariable(value = "user", required = true) String username) throws IOException {
        System.out.println(username);
        return username;
    }

    @RequestMapping(value = "/quick18")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public String save18(Date date) throws IOException {
        System.out.println(date);
        return date.toString();
    }

    @RequestMapping(value = "/quick19")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public void save19(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
    }

    @RequestMapping(value = "/quick20")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public void save20(@RequestHeader("User-Agent") String user_agent) throws IOException {
        System.out.println(user_agent);
    }

    @RequestMapping(value = "/quick21")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public void save21(@CookieValue(value = "JSESSIONID") String jsessionid) throws IOException {
        System.out.println(jsessionid);
    }

    @RequestMapping(value = "/quick22")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public String save22(String name, MultipartFile uploadFile) throws IOException {
//获得文件名称
        String originalFilename = uploadFile.getOriginalFilename();
        //保存文件
        uploadFile.transferTo(new File("E:\\IdeaProjects\\exercise\\Spring\\itheima_spring_mvc\\src\\main\\webapp\\upload\\" + originalFilename));
        System.out.println(name + " , " + uploadFile);
        return "名字为：" + name + "的" + uploadFile + "上传成功";
    }

    @RequestMapping(value = "/quick23")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public String save23(String name, MultipartFile uploadFile, MultipartFile uploadFile2) throws IOException {
//获得文件名称
        String originalFilename = uploadFile.getOriginalFilename();
        String originalFilename2 = uploadFile.getOriginalFilename();
        //保存文件
        uploadFile.transferTo(new File("E:\\IdeaProjects\\exercise\\Spring\\itheima_spring_mvc\\src\\main\\webapp\\upload\\" + originalFilename));
        uploadFile2.transferTo(new File("E:\\IdeaProjects\\exercise\\Spring\\itheima_spring_mvc\\src\\main\\webapp\\upload\\" + originalFilename2));
        System.out.println(name + " , " + uploadFile.getName());
        System.out.println(name + " , " + uploadFile2.getName());
        return "名字为：" + name + "的" + uploadFile.getOriginalFilename() + "上传成功" + "名字为：" + name + "的" + uploadFile2.getName() + "上传成功";
    }
}
