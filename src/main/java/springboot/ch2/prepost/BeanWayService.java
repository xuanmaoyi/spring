package springboot.ch2.prepost;

/**
 * Created by maoyi.xuan on 2017/4/12.
 */
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }
    public BeanWayService() {
        super();
        System.out.println("初始化构造-beanService");
    }
    public void destory(){
        System.out.println("@Bean-destory-method");
    }
}
