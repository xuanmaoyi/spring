package springboot.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by maoyi.xuan on 2017/4/12.
 */
@Configuration
@ComponentScan("com.springboot.ch2.prepost")
public class PrePostConfig {
    @Bean(initMethod = "init",destroyMethod = "destory")
    public  BeanWayService beanWayService(){
        return  new BeanWayService();
    }
    @Bean
    public JSR250WayService jsr250WayService(){
        return  new JSR250WayService();
    }
}
