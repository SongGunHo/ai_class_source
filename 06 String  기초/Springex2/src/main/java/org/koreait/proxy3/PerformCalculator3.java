package org.koreait.proxy3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Order(2)
@Aspect
public class PerformCalculator3 {

    //@Pointcut("execution(* org.koreait.proxy,*.*(long))")
    public void publicTarget(){}

  //  @Around("publicTarget()")
   // @Around("org.koreait.proxy3.CommonPointcut.publicTarget")
    @Around("CommonPointcut.publicTarget")
    public Object process(ProceedingJoinPoint joinPoint)throws Throwable{
        System.out.println("공통 코드 수행");
        long stiem = System.nanoTime();
        try {
            Object result = joinPoint.proceed(); //  핵심 기능을 대신 수행 예-> long factorial(long)
            return  result;

        }finally {
            long etime  = System.nanoTime();
            System.out.printf("걸린시간: %d%n" , etime - stiem);
        }
    }
    @Before("CommonPointcut.publicTarget")
    public void before(JoinPoint joinPoint){
        System.out.println("before");
    }
    @After("CommonPointcut.publicTarget")
    public void after(JoinPoint joinPoint){
        System.out.println("after");
    }
    @AfterReturning(pointcut = "CommonPointcut.publicTarget", returning =" returnValue")
    public void afterReturning(JoinPoint joinPoint, Object returnValue){
        System.out.println(" afterReturning");
        System.out.println("return"+returnValue);
    }
}
