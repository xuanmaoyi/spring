package springboot.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by maoyi.xuan on 2017/4/11.
 */
@Service
@Scope("prototype")
public class DemoProtoTypeService {
}
