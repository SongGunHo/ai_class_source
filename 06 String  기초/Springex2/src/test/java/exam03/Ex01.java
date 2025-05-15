package exam03;


import org.junit.jupiter.api.Test;
import org.koreait.configs.AppCtx2;
import org.koreait.proxy.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Calendar;

@SpringJUnitConfig(AppCtx2.class)
public class Ex01 {

    @Autowired
    private Calculator calculator;
    @Test
    void test1(){
        long resutl = calculator.factorial(10L);
        System.out.printf("result:%d%n", resutl);

         resutl = calculator.factorial(10L);
        System.out.printf("result:%d%n", resutl);

         resutl = calculator.factorial(10L);
        System.out.printf("result:%d%n", resutl);
    }
}
