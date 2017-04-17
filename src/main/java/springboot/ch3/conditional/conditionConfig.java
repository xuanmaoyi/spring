package springboot.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by maoyi.xuan on 2017/4/17.
 */
@Configuration
public class conditionConfig {
    @Bean
    @Conditional(windowsCondition.class)
    public ListService getWinService(){
        return  new winService();
    }
    @Bean
    @Conditional(MacCondition.class)
    public ListService getMAcService(){
        return  new macService();
    }
}
