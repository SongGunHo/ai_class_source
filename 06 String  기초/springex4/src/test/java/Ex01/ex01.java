package Ex01;

import org.junit.jupiter.api.Test;
import org.koreait.global.member.controllers.RequestJoin2;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class ex01 {
    @Test
    void test1(){
        RequestJoin2 re2 = new RequestJoin2("user01@test.org", "1234", "1234",  "사용자01", true);

        System.out.printf("email:%s , name:%s%n", re2.email(), re2.name());
        System.out.println(re2);

    }
}
