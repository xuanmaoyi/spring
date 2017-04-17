package springboot.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by maoyi.xuan on 2017/4/12.
 */

public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("@PostConstruct");
    }
    public JSR250WayService() {
        super();
        System.out.println("初始化构造-JSR250WayService");
    }
    @PreDestroy
    public void destory(){
        System.out.println("@PreDetory");
    }
}
