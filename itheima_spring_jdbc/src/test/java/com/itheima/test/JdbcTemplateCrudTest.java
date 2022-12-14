package com.itheima.test;

import com.itheima.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName JdbcTemplateCrudTest
 * @Description TODO
 * @Author gxw
 * @Date 23:19 2022/10/24
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateCrudTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void update() {
        int row = jdbcTemplate.update("update `account` set money = ? where name = ?", 10000, "tom");
        System.out.println(row);
    }

    @Test
    public void delete() {
        int row = jdbcTemplate.update("delete from `account`  where name = ?", "tom");
        System.out.println(row);
    }

    @Test
    public void testQueryAll() {
        List<Account> accountList = jdbcTemplate.query("select * from `account`", new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(accountList);
    }

    @Test
    public void testQueryOne() {
        Account account = jdbcTemplate.queryForObject("select * from `account` where name = ?", new BeanPropertyRowMapper<Account>(Account.class), "张三");
        System.out.println(account);
    }

    @Test
    public void testQueryCount() {
        Long count = jdbcTemplate.queryForObject("select count(1) from `account` where name = ?", Long.class, "张三");
        Long count1 = jdbcTemplate.queryForObject("select count(1) from `account`", Long.class);
        System.out.println(count+","+count1);
    }
}
