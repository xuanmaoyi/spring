package springboot.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by maoyi.xuan on 2017/4/17.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{
    public void onApplicationEvent(DemoEvent event) {
        String msg=event.getMsg();
        Object source=event.getSource();
        System.out.println("事件源"+source.toString()+"事件信息"+msg);
    }
}
