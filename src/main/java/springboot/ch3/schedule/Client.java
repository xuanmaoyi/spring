package springboot.ch3.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by maoyi.xuan on 2017/4/17.
 */
public class Client {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SheduledConfig.class);
        context.getBean(ScheduledTaskService.class).fixedTimeExecute();
        context.close();
    }
}
