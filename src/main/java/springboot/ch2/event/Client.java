package springboot.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by maoyi.xuan on 2017/4/17.
 */
public class Client {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(eventConfig.class);
        context.getBean(DemoPublisher.class).publish("spring event");
        context.close();

    }
}
