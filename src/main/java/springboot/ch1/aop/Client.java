package springboot.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by maoyi.xuan on 2017/4/11.
 */
public class Client {
    public static void  main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AopConfig.class);
        context.getBean(DemoAnnotationService.class).add();
        context.getBean(DemoMethodService.class).add();
        context.close();
    }
}
