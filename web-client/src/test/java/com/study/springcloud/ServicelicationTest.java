package com.study.springcloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ServicelicationTest {

    @Autowired
    RestTemplate restTemplate;

    @Test
    public void testServiceA() {
        String body = restTemplate.getForEntity("http://SERVICE-A/add?a=10&b=20", String.class).getBody();
        System.out.println(body);
    }

}
