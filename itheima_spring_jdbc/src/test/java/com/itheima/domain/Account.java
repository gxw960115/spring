package com.itheima.domain;

/**
 * @ClassName Account
 * @Description TODO
 * @Author gxw
 * @Date 22:39 2022/10/24
 * @Version 1.0
 **/
public class Account {
    private String name;
    private double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
