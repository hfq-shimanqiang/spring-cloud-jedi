package com.huifenqi.jedi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudConfigClinetApplication {

    /**
     * 参考
     * http://nobodyiam.com/2016/04/02/dive-into-spring-cloud-config/
     * <p>
     * 访问：http://localhost:18081/env
     * 查看环境配置
     * <p>
     * PSOT方式访问:http://localhost:18081/refresh
     * 刷新git上的配置文件
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClinetApplication.class, args);
    }
}
