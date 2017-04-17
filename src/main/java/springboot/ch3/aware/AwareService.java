package springboot.ch3.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * Created by maoyi.xuan on 2017/4/12.
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{
    private String  beanName;
    private ResourceLoader resourceLoader;
    public void setBeanName(String s) {
        this.beanName=s;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader=resourceLoader;
    }
    public void  outputResult(){
        System.out.println(beanName);
    }
}
