package springboot.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by maoyi.xuan on 2017/4/11.
 */
@Service
public class UseFunctionService {
    @Autowired
    FunctionService functionService;
    public  String   sayHello(String  word){
        return  functionService.sayHello(word);
    }
}
