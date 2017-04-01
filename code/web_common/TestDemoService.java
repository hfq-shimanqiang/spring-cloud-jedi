package com.huifenqi.payment.web_common;

import com.huifenqi.payment.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by smq on 2017/3/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class TestDemoService {
    @Autowired
    DemoService demoService;

    @Test
    public void test001() throws Exception {
        demoService.test();
    }
}
