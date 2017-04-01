package com.huifenqi.payment.web_common;

import com.huifenqi.payment.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by smq on 2017/3/27.
 */

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        // 更新业务逻辑处理
        Date thirdTradeTime = null;
        try {
//            thirdTradeTime = new SimpleDateFormat("YYYYMMDDhhmmss").parse("20170324180504");
            thirdTradeTime = new SimpleDateFormat("yyyyMMddHHmmss").parse("20170324180504");
        } catch (ParseException e) {
            thirdTradeTime = new Date();
        }

        System.out.println(new SimpleDateFormat("yyyyMMddHHmmss").format(thirdTradeTime));
    }
}
