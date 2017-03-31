package com.study.springcloud;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by smq on 2017/3/6.
 */
@RestController
public class SimpleController {
    private final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());

    /**
     * 传统使用方式接口调用：
     * 这个方法现在应该 迁移到 Server中
     * 打印
     */

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, host:" + serviceInstance.getHost() + ", service_id:" + serviceInstance.getServiceId() + ", result:" + r);
        return r;
    }


    /**
     * ribbon方式请求处理
     */

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add1", method = RequestMethod.GET)
    public String add1() {
        return restTemplate.getForEntity("http://SERVICE-A/add?a=10&b=20", String.class).getBody();
    }


    /**
     * feign的方式请求处理
     * 同时使用：断路器的功能：已经包含了
     */

    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add2", method = RequestMethod.GET)
    public Integer add2() {
        logger.info("http requset 111111111111111111");
        return computeClient.add(10, 60);
    }


    /**
     * ribbon结合断路器使用
     */
    @Autowired
    ComputeService computeService;

    @RequestMapping(value = "/add3", method = RequestMethod.GET)
    public String add3() {
        return computeService.addService();
    }
}
