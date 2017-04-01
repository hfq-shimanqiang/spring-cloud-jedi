package com.huifenqi.payment.web_common;

import java.lang.annotation.*;

/**
 * Created by smq on 2017/3/27.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HttpReqAction {
    String name() default "";
}
