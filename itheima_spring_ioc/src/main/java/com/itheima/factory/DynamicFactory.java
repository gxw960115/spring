package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

/**
 * @ClassName DynameFactory
 * @Description TODO
 * @Author gxw
 * @Date 21:49 2022/10/12
 * @Version 1.0
 **/
public class DynamicFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
