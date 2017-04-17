package springboot.ch3.schedule;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by maoyi.xuan on 2017/4/17.
 */
@Configurable
@ComponentScan("springboot.ch3.schedule")
@EnableScheduling
public class SheduledConfig {

}
