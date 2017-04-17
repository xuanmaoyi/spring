package springboot.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by maoyi.xuan on 2017/4/12.
 */
public class Clent {
    public static  void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);
        context.refresh();
        System.out.println(context.getBean(DemoBean.class).getContent());
    }
}
