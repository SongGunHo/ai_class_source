package em01;

import org.junit.jupiter.api.Test;
import org.koreait.configs.AppCtx;
import org.koreait.configs.person.Greeter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ex01 {

    @Test
    void test1(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);


        //Greeter g1 = ctx.getBean("greeter", Greeter.class);
       //g1.hello("안녕 하세요.");
        Greeter g1 = ctx.getBean(Greeter.class);
        Greeter g2 = ctx.getBean("greeter", Greeter.class);
        System.out.println(g1 == g2);

        ctx.close();


    }




}
