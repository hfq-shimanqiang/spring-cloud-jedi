package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者
 * 通过@EnableDiscoveryClient注解来添加发现服务能力。
 * <p>
 * 使用feign
 *
 * @EnableFeignClients 需要的注解
 * ComputeClient  需要的接口
 * <p>
 * 使用ribbon
 * 创建RestTemplate实例，并通过@LoadBalanced注解开启均衡负载能力。
 * <p>
 * 使用断路器:Hystrix
 * @EnableCircuitBreaker
 */


/**
 * 这里用了@SpringCloudApplication注解，之前没有提过，通过源码我们看到，
 * 它整合了
 *
 * @SpringBootApplication
 * @EnableDiscoveryClient
 * @EnableCircuitBreaker 主要目的还是简化配置。
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
@EnableFeignClients
public class Application {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
//        new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
    }
}
