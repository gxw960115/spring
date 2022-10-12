package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

/**
 * @ClassName StaticFactory
 * @Description TODO
 * @Author gxw
 * @Date 21:45 2022/10/12
 * @Version 1.0
 **/
public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
