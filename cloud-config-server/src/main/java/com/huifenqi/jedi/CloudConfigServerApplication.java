package com.huifenqi.jedi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class CloudConfigServerApplication {

    /**
     * 参考
     * http://blog.csdn.net/liaokailin/article/details/51307215
     * <p>
     * 访问
     * http://localhost:18080/foo/test
     * http://localhost:18080/foo/test/master
     * 查看生效可用的配置@see bootstrap.yml
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigServerApplication.class, args);
    }
}
