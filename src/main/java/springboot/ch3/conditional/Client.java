package springboot.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by maoyi.xuan on 2017/4/17.
 */
public class Client {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(conditionConfig.class);
        System.out.println(context.getBean(ListService.class).showListCMD());

    }
}
