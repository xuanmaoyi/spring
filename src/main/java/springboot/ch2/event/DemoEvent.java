package springboot.ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by maoyi.xuan on 2017/4/17.
 */
public class DemoEvent extends ApplicationEvent{
    private static final long serialVersionUID=1l;
    private String msg;
    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
