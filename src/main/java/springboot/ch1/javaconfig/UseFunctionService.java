package springboot.ch1.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by maoyi.xuan on 2017/4/11.
 */
public class UseFunctionService {
    @Autowired
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }
    public String  sayHello(String word){
        return  functionService.sayHello(word);
    }
}
