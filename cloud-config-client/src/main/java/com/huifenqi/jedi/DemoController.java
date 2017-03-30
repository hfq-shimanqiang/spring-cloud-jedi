package com.huifenqi.jedi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by smq on 2017/3/30.
 */
@RestController
public class DemoController {

    @Autowired
    DemoConf demoConf;

    @GetMapping("/hello/test")
    public String test001() {
        return demoConf.getSay();
    }
}
