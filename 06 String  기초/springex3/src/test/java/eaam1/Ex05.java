package eaam1;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.koreait.member.Repositorys.MemberRepository;
import org.koreait.member.entiits.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(AppCtx.class)
public class Ex05 {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void test1(){
        List<Member> items = memberRepository.getList();


    }
}
