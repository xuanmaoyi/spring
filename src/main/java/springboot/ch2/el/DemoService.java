package springboot.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by maoyi.xuan on 2017/4/11.
 */
@Service
public class DemoService {
    /**
     * @Value 用来注入普通字符串
     * */
    @Value("注入普通字符串")
    private String  author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
