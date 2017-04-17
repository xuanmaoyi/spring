package springboot.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by maoyi.xuan on 2017/4/12.
 */
public class Client {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ELConfig.class);
        context.getBean(ELConfig.class).outputResource();
    }
}
