package springboot.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

/**
 * Created by maoyi.xuan on 2017/4/11.
 */
@Configuration
@ComponentScan("springboot.ch2.el")
@PropertySource("classpath:text.properties")
@Component
public class ELConfig {
    @Value("普通注入")
    private String  nomal;
    @Value("#{systemProperties['os.name']}")
    private String osname;
    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomNumber;
    @Value("#{demoService.author}")
    private String  fromAnthor;
    @Value("classpath:text.txt")
    private Resource textFlie;
    @Value("www.baidu.com")
    private Resource testUrl;
    @Value("${book.name}")
    private String bookName;
    @Autowired
    private Environment env;

    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return  new PropertySourcesPlaceholderConfigurer();
    }

    public void  outputResource(){
        try{
            System.out.println(nomal);
            System.out.println(osname);
            System.out.println(randomNumber);
            System.out.println(fromAnthor);
            System.out.println(IOUtils.toString(textFlie.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(env.getProperty("book.author"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
