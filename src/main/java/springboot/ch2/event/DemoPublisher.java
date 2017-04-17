package springboot.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by maoyi.xuan on 2017/4/17.
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext context;
    public void publish(String msg){
        context.publishEvent(new DemoEvent(this,msg));
    }
}
