package springboot.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by maoyi.xuan on 2017/4/11.
 */
public class Client {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DiiConfig.class);
        System.out.println(context.getBean(UseFunctionService.class).sayHello("spring-boot"));
        context.close();

    }
}
