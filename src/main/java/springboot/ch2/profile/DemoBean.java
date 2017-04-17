package springboot.ch2.profile;

/**
 * Created by maoyi.xuan on 2017/4/12.
 */
public class DemoBean {
    private String content;

    public DemoBean(String content) {
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
