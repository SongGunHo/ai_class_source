package org.koreait.proxy3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import java.util.HashMap;
import java.util.Map;
@Order(1)
@Aspect
public class CacheCalculator {
    private Map<Long, Object> cache = new HashMap<>();


    @Pointcut("execution* org.koreait.proxy3).*(..)")
    public  void publicTarget(){}

    //@Around("publicTarget()")
    @Around("execution(* org.koreait.proxy,*.*(long)")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        Object [] args  = joinPoint.getArgs();// 사용된 메개 변수에 사용된 값 - 인수
        long num =(long) args[0];
        if (cache.containsKey(num)){ // 캐시에 저장 확인
            System.out.println("캐쉬 저장 확인 ");
            return cache.get(num);

        }

        Object result = joinPoint.proceed();
        cache.put(num, result);
        System.out.println("캐시에 저장된 ");

        return  result;
    }
}
