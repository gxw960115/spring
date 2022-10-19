package com.itheima.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateConverter
 * @Description TODO
 * @Author gxw
 * @Date 23:30 2022/10/19
 * @Version 1.0
 **/
public class DateConverter implements Converter<String, Date> {

    public Date convert(String s) {
        // 将日期的字符串转换成真正的日期对象
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date  = sf.parse(s);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
