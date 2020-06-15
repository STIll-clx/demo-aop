package com.still.demo.aspectj;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author Lee
 * @Description TODO
 * @Date 2020/6/15 14:09
 * @Version 1.0
 */
@Aspect
@Component
@Slf4j
public class AdvisingObj {

    /**
     * 第一个 * 代表匹配任意修饰符及任意返回值,
     * 第二个 * 代表任意类的对象,
     * 第三个 * 代表任意方法,
     * 参数列表中的 ..  匹配任意数量的参数
     */
    @Pointcut("execution(* com.still.demo.aspectj.AdvisedObj.perform(..))")
    public void performance() {
    }

    @Before("performance()")
    public void beforeExecute(){
        log.info("beforeExcecute().");
    }

    @AfterReturning("performance()")
    public void afterExecute(){
        log.info("afterExecute().");
    }

    @Around("performance()")
    public Object roundExecute(ProceedingJoinPoint joinpoint){
        Object result = null;
        try{
            log.info("before roundExecute().");
            result = joinpoint.proceed();
            log.info("after roundExecute().");
        }catch(Throwable t){

        }
        return result;
    }

}
