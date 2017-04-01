package com.huifenqi.payment.web_common;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by smq on 2017/3/27.
 */
@Aspect
@Component
public class WebLogAspect {
    private Logger logger = Logger.getLogger(getClass());

    private ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("@annotation(com.huifenqi.payment.web_common.HttpReqAction)")
    public void log() {

    }


    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        logger.debug("doBefore");
        startTime.set(System.currentTimeMillis());
    }

    @After("log()")
    public void doAfter(JoinPoint joinPoint) {

        logger.debug("doAfter");
    }

    @AfterReturning(returning = "result", pointcut = "log()")
    public void doAfterReturning(Object result) throws Exception {
        logger.debug("doAfterReturning");
        logger.debug("RESP TIME : " + (System.currentTimeMillis() - startTime.get()) + " ms");
    }

}
