package springboot.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by maoyi.xuan on 2017/4/12.
 */
@Configuration

public class ProfileConfig {
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return  new DemoBean("dev");
    }
    @Bean
    @Profile("pro")
    public DemoBean proDemoBean(){
        return  new DemoBean("pro");
    }
}
