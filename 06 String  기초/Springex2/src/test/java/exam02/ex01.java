package exam02;

import org.junit.jupiter.api.Test;
import org.koreait.proxy.Calculator;
import org.koreait.proxy.ImplCalculator;
import org.koreait.proxy.PerformanceCalculator;
import org.koreait.proxy.RecCalculator;

public class ex01 {
    @Test
    void text1(){
        long stime = System.nanoTime(); // 시작 시간 공동기능

        ImplCalculator cal = new ImplCalculator();
        long result1 = cal.factorial(20L);// 핵심 기능

        long etime = System.nanoTime(); // 종료 시간 공통 기능
        System.out.printf("걸린시간 : %d, 값 : %d%n", etime -stime , result1);

        stime = System.nanoTime();// 시작 시간 공통기능

        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(20L);// 핵심 기능

        etime = System.nanoTime(); // 종료 시간 공통 기능
        System.out.printf("걸린시간 : %d, 값 : %d%n", etime -stime , result2);


        System.out.printf("cal:%d, cal2%d%n", result1, result2);
    }
    @Test
    void test2(){
        Calculator cal = new PerformanceCalculator(new ImplCalculator());
        long result1 = cal.factorial(10L);
        Calculator cal1  = new PerformanceCalculator(new ImplCalculator());
        long result2 = cal.factorial(10L);
        System.out.printf("cal:%d , cal1:%d%n", result1 , result2);
    }
}
