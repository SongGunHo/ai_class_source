package em01;

import org.junit.jupiter.api.Test;
import org.koreait.configs.AppCtx1;
import org.koreait.configs.person.Greeter;
import org.koreait.member.RequestJoin;
import org.koreait.member.RequestLogin;
import org.koreait.member.dao.MemberDAO;
import org.koreait.member.servlces.ServlceJoin;
import org.koreait.member.servlces.ServlceLoing;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class ex02 {


    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx1.class);

        ServlceJoin service = ctx.getBean("ServletJoin", ServlceJoin.class);
        ServlceLoing servlceLoing = ctx.getBean("ServlceLoing", ServlceLoing.class);
        MemberDAO memberDao = ctx.getBean("memberDao", MemberDAO.class);


        RequestJoin form = new RequestJoin();
        form.setEmail("user01@test.org");
        form.setName("사용자01");
        form.setPassword("12345678");

        service.process(form); // 회원 가입 처리

        List<> members = memberDao.getList();
        members.forEach(System.out::println);


        RequestLogin login = new RequestLogin();
        login.setEmail(form.getEmail());
        login.pr






        ctx.close();
    }

    @Test
    void test2() {
        //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class, DBConfig.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx1.class);

        ServlceJoin service = ctx.getBean(ServlceJoin.class);
        Greeter g1 = ctx.getBean(Greeter.class);

        System.out.println("service:" + service);
        System.out.println("g1:" + g1);

        ctx.close();
    }
}
}
