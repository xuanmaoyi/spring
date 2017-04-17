package springboot.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by maoyi.xuan on 2017/4/11.
 */
@Configuration
@ComponentScan("com.springboot.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
