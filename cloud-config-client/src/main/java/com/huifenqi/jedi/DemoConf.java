package com.huifenqi.jedi;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created by smq on 2017/3/29.
 */
@Component
@ConfigurationProperties(prefix = "demo")
@RefreshScope
public class DemoConf {
    private String say;

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }
}
