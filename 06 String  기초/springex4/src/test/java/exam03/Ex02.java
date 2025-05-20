package exam03;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.DBCon;
import org.koreait.global.configs.MvcConfig;
import org.koreait.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

//@SpringJUnitWebConfig(MvcConfig.class)
@SpringJUnitConfig(DBCon.class)
public class Ex02 {
    @Autowired
    private MemberRepository repository;

    @Test
    void test1(){
      boolean result =  repository.existsByEmail("user01@test.org");
        System.out.println(result);
    }

}
