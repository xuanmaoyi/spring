package springboot.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by maoyi.xuan on 2017/4/11.
 */
@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService(){
        return  new FunctionService();
    }
    @Bean
    public UseFunctionService useFunctionService(){
        return  new UseFunctionService();
    }
}
