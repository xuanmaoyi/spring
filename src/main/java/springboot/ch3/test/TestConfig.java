package springboot.ch3.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by maoyi.xuan on 2017/4/17.
 */
@Configuration
public class TestConfig {
    @Bean
    @Profile("dev")
    public TestBean devTest(){
        return new TestBean("dev");
    }
    @Bean
    @Profile("pro")
    public TestBean proTest(){
        return new TestBean("pro");
    }
}
