package springboot.ch1.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * Created by maoyi.xuan on 2017/4/11.
 */
@Aspect
@Component
public class LogAspect {
    //定义切入点
    @Pointcut("@annotation(com.springboot.ch1.aop.Action)")
    public void  annotationPointCut(){}
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature methodSignature= (MethodSignature) joinPoint.getSignature();
        Method method=methodSignature.getMethod();
        Action action=method.getAnnotation(Action.class);
        System.out.println("注解式拦截"+action.name());

    }
    @Before("execution(* com.springboot.ch1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature methodSignature= (MethodSignature) joinPoint.getSignature();
        Method method=methodSignature.getMethod();
        System.out.println("方法拦截"+method.getName());
    }
}
