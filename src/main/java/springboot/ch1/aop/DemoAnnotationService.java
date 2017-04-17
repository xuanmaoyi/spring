package springboot.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by maoyi.xuan on 2017/4/11.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截")
    public void  add(){

    }
}
