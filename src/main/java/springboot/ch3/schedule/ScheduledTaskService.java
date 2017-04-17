package springboot.ch3.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by maoyi.xuan on 2017/4/17.
 */
@Service
public class ScheduledTaskService {
    SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每5秒报告当前时间"+dateFormat.format(new Date()));
    }
    @Scheduled(cron = "0 28 11 ? * *")
    public void fixedTimeExecute(){
        System.out.println("每5秒报告当前时间"+dateFormat.format(new Date()));
    }
}
