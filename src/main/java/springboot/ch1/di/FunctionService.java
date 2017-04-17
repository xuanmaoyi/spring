package springboot.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by maoyi.xuan on 2017/4/11.
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "hello"+word+"!";
    }
}
