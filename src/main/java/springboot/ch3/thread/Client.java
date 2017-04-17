package springboot.ch3.thread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by maoyi.xuan on 2017/4/17.
 */
public class Client {
    public static  void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService taskService=context.getBean(AsyncTaskService.class);
        for(int i=0;i<10;i++){
            taskService.executeAsyncTask(i);
            taskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
