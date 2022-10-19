package com.itheima.domain;

import java.util.List;

/**
 * @ClassName VO
 * @Description TODO
 * @Author gxw
 * @Date 22:29 2022/10/19
 * @Version 1.0
 **/
public class VO {
    List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "VO{" +
                "userList=" + userList +
                '}';
    }
}
