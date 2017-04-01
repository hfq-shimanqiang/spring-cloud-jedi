package com.huifenqi.payment.web_common;

import org.springframework.stereotype.Service;

/**
 * Created by smq on 2017/3/27.
 */
@Service
public class DemoService {
    @HttpReqAction()
    public void test() {
        System.out.println("exec DemoService#test()");
    }
}
