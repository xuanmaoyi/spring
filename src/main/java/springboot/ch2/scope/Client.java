package springboot.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by maoyi.xuan on 2017/4/11.
 */
public class Client {
    public static void  main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ScopeConfig.class);
        System.out.println(context.getBean(DemoSingleonService.class)==context.getBean(DemoSingleonService.class));
        System.out.println(context.getBean(DemoProtoTypeService.class)==context.getBean(DemoProtoTypeService.class));
    }
}
