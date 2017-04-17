package springboot.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by maoyi.xuan on 2017/4/11.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
