package com.itheima.domain;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author gxw
 * @Date 21:36 2022/10/19
 * @Version 1.0
 **/
public class User implements Serializable {
    private String userName;
    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
