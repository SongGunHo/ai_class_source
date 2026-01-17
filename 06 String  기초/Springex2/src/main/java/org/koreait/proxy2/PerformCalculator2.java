package org.koreait.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformCalculator2 implements InvocationHandler {
    private final Object instance;
    public PerformCalculator2(Object instance){
        this.instance = instance;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long stime = System.nanoTime(); // 공톨 기능
        try {

        Object result = method.invoke(instance, args);
        return  result;
        }finally {
            long etime = System.nanoTime(); // 공통  기능
            System.out.printf("걸린시간 : %d%n" , etime - stime);

        }
    }
}
