package exam01;

import org.junit.jupiter.api.Test;
import org.koreait.configs.AppCtx;
import org.koreait.lifecycle.Message2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Target;

public class exam01 {
    @Test
    void text1(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class); // 객체 생성 -> 의존성 주입 -> 초기화 ()
        Message2 m1 = ctx.getBean(Message2.class);
        Message2 m2 = ctx.getBean(Message2.class);
        System.out.println(m1 == m2); //false
         ctx.close(); // distroy  -> 소멸
    }

}
