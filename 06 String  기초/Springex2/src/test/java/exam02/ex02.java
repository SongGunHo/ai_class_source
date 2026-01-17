package exam02;

import org.junit.jupiter.api.Test;
import org.koreait.proxy.Calculator;
import org.koreait.proxy.ImplCalculator;
import org.koreait.proxy.PerformanceCalculator;
import org.koreait.proxy.RecCalculator;
import org.koreait.proxy2.PerformCalculator2;

import java.lang.reflect.Proxy;

public class ex02 {

    @Test
    void text1(){
        Calculator ctx =(Calculator) Proxy.newProxyInstance(Calculator.class.getClassLoader(),new Class[]{ Calculator.class}, new PerformCalculator2(new RecCalculator()));
        long result = ctx.factorial(10L);
        System.out.printf("결과: %d%n", result);
    }

//    @Test
//    void text2(){
//        Calculator ctx =(RecCalculator) Proxy.newProxyInstance(Calculator.class.getClassLoader(),new Class[]{ Calculator.class}, new PerformCalculator2(new RecCalculator()));
//        long result = ctx.factorial(10L);
//        System.out.printf("결과: %d%n", result);
//    }
}
