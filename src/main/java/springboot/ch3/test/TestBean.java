package springboot.ch3.test;

/**
 * Created by maoyi.xuan on 2017/4/17.
 */
public class TestBean {
    private String content;

    public TestBean(String content) {
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
